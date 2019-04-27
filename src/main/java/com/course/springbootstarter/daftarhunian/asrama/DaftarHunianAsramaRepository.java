package com.course.springbootstarter.daftarhunian.asrama;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.List;
//import com.course.springbootstarter.daftarhunian.DaftarhunianHdr;
@Repository
//public interface DaftarHunianAsramaRepository extends CrudRepository<QueriDfrtHunianHdrDtl, String>{
//public interface DaftarHunianAsramaRepository extends CrudRepository<DaftarHunianAsrama, Integer>{
//RESTful API Example with Spring Boot, Spring Data REST, Spring Data JPA One To Many Relationship and MySQL
public interface DaftarHunianAsramaRepository extends JpaRepository<DaftarHunianAsrama, Integer>{
//	Collection<DaftarHunianAsrama> findAll();
	List<DaftarHunianAsrama> findAll();
	DaftarHunianAsrama getOne(int id);
}
