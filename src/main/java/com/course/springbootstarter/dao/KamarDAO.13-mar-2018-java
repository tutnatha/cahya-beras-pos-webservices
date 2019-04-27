package com.course.springbootstarter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.course.springbootstarter.entity.Kamar;

@Transactional
@Repository
public class KamarDAO implements IKamarDAO{
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Kamar getKamarById(String no) {
		return entityManager.find(Kamar.class, no);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Kamar> getAllKamars() {
		String hql = "FROM Kamar as kamar ORDER BY kamar.no";
		return (List<Kamar>) entityManager.createQuery(hql).getResultList();
	}	
	@Override
	public void addKamar(Kamar kamar) {
		entityManager.persist(kamar);
	}
	@Override
	public void updateKamar(Kamar kamar) {
		Kamar kmr = getKamarById(kamar.getNo());
		kmr.setJmlTt(kamar.getJmlTt());
		kmr.setUrlPicture(kamar.getUrlPicture());
		kmr.setLantai(kamar.getLantai());
		entityManager.flush();
	}
	@Override
	public void deleteKamar(String kamarId) {
		entityManager.remove(getKamarById(kamarId));
	}
	@Override
	public boolean kamarExists(String no, int lantai) {
		String hql = "FROM Kamar as kmr WHERE kmr.no = ? and kmr.lantai = ?";
		int count = entityManager.createQuery(hql).setParameter(1, no)
		              .setParameter(2, lantai).getResultList().size();
		return count > 0 ? true : false;
	}
}
