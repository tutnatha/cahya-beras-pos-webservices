package com.course.springbootstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.springbootstarter.dao.IKamarDAO;
import com.course.springbootstarter.entity.Kamar;

@Service
public class KamarService implements IKamarService {
	@Autowired
	private IKamarDAO kamarDAO;
	@Override
	public Kamar getKamarById(String no) {
		Kamar obj = kamarDAO.getKamarById(no);
		return obj;
	}	
	@Override
	public List<Kamar> getAllKamars(){
		return kamarDAO.getAllKamars();
	}
	@Override
	public synchronized boolean addKamar(Kamar kamar){
       if (kamarDAO.kamarExists(kamar.getNo(), kamar.getLantai())) {
    	   return false;
       } else {
    	   kamarDAO.addKamar(kamar);
    	   return true;
       }
	}
	@Override
	public void updateKamar(Kamar kamar) {
		kamarDAO.updateKamar(kamar);
	}
	@Override
	public void deleteKamar(String kamarId) {
		kamarDAO.deleteKamar(kamarId);
	}
	@Override
	public Kamar getKamar(String no) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateKamar(String no, Kamar kamar) {
		// TODO Auto-generated method stub
		//belum dipakai ya..
	}
	
}
