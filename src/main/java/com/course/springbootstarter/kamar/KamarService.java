package com.course.springbootstarter.kamar;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KamarService {

    @Autowired
    private KamarRepository kamarRepository;

    public List<Kamar> getAllKamars() {
        List<Kamar> kamars = new ArrayList<>();
        kamarRepository.findAll().forEach(kamars::add);
        return kamars;
    }

    public Kamar getKamar(String no) {
        //return kamars.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return kamarRepository.findOne(no);   //err
        return null;
    }

    public void addKamar(Kamar kamar) {
        kamarRepository.save(kamar);
    }

    void updateKamar(String no, Kamar kamar) {
        kamarRepository.save(kamar);
    }

    void updateKamar(Kamar kamar) {
        kamarRepository.save(kamar);
    }
    
    void deleteKamar(String no) {
//        kamarRepository.delete(no);   //err
    }

}
