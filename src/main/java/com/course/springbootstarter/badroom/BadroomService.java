package com.course.springbootstarter.badroom;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//public class BadroomService {
public class BadroomService implements IBadroomServices{

    @Autowired
    private BadroomRepository badroomRepository;

    public List<Badroom> getAllBadrooms() {
        List<Badroom> badrooms = new ArrayList<>();
        badroomRepository.findAll().forEach(badrooms::add);
        return badrooms;
    }

    public Badroom getBadroom(int no) {
        //return badrooms.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
//        return badroomRepository.findOne(s);  //error check lg..
        return null;    //sementara
    }

    public void addBadroom(Badroom badroom) {
        badroomRepository.save(badroom);
    }

    public void updateBadroom(int no, Badroom badroom) {
        badroomRepository.save(badroom);
    }

    public void deleteBadroom(int no) {
        String s = String.valueOf(no);
//        badroomRepository.delete(s);      //remark
    }

}
