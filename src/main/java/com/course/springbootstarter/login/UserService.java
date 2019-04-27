package com.course.springbootstarter.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.course.springbootstarter.badroom.User;
//import com.course.springbootstarter.badroom.UserRepository;

//import com.course.springbootstarter.badroom.IUserServices;

@Service
//public class UserService implements IUserServices{
public class UserService {
    @Autowired
    private UserRepository badroomRepository;

    public List<Users> getAllUsers() {
        List<Users> badrooms = new ArrayList<>();
        badroomRepository.findAll().forEach(badrooms::add);
        return badrooms;
    }

    public Users getUser(int no) {
        //return badrooms.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
//        return badroomRepository.findOne(s);  //err
        return null;    //err
    }

    //find: user berdasarkan nama
    public Users getUser(String username){
//	return badroomRepository.findOne(username); //err
        return null;    //err
    }

    //getArrayUser
    public List<Users> getArrayUser(String username){
//	return badroomRepository.findOne(username);
        return badroomRepository.findByUsername(username);
    }
    
    public void addUser(Users badroom) {
        badroomRepository.save(badroom);
    }

    public void updateUser(int no, Users badroom) {
        badroomRepository.save(badroom);
    }

    public void deleteUser(int no) {
        String s = String.valueOf(no);
//        badroomRepository.delete(s);  //err
    }

}
