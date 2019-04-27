package com.course.springbootstarter.daftarhunian.asrama;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsUsedRepository extends JpaRepository<Room,String>{
	//boleh kok dikosongka..!!!
}
