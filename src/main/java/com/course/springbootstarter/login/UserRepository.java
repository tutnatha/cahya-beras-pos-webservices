package com.course.springbootstarter.login;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//import com.course.springbootstarter.badroom.Badroom;

public interface UserRepository extends CrudRepository<Users, String>{
    @Query ("select u from Users u where u.username = ?1")     //Simple as that
    public List<Users> findByUsername(String username);

}
