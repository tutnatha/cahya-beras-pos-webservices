package com.course.springbootstarter.badroom;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

public interface IBadroomServices {
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	List<Badroom> getAllBadrooms();
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	Badroom getBadroom(int no);
	@Secured({"ROLE_ADMIN"})
	void addBadroom(Badroom badroom);
	@Secured({"ROLE_ADMIN"})
	void updateBadroom(int no, Badroom badroom);
	@Secured({"ROLE_ADMIN"})
	void deleteBadroom(int no);
}
