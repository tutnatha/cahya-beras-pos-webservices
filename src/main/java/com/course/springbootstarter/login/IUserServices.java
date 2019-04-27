package com.course.springbootstarter.login;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

//import com.course.springbootstarter.badroom.User;

public interface IUserServices {
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	List<Users> getAllUsers();
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	Users getUser(int no);
	@Secured({"ROLE_ADMIN"})
	void addUser(Users users);
	@Secured({"ROLE_ADMIN"})
	void updateUser(int no, Users users);
	@Secured({"ROLE_ADMIN"})
	void deleteUser(int no);
}
