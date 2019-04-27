package com.course.springbootstarter.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.course.springbootstarter.entity.Kamar;

public interface IKamarService {
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	List<Kamar> getAllKamars();
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	Kamar getKamar(String no);
//	@Secured({"ROLE_ADMIN","ROLE_USER"})		//semua role
//	void addKamar(Kamar kamar);
	@Secured({"ROLE_ADMIN","ROLE_USER"})		//semua role
	void updateKamar(String no, Kamar kamar);
	@Secured({"ROLE_ADMIN","ROLE_USER"})		//semua role
	void updateKamar(Kamar kamar);
	@Secured({"ROLE_ADMIN","ROLE_USER"})		//semua role
	void deleteKamar(String no);
	@Secured({"ROLE_ADMIN","ROLE_USER"})		//semua role
	Kamar getKamarById(String no);
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	boolean addKamar(Kamar kamar);
}
