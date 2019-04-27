package com.course.springbootstarter.daftarhunianbad;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaftarhunianbadService {

    @Autowired
    private DaftarhunianbadRepository daftarhunianbadRepository;

    public List<Daftarhunianbad> getAllDaftarhunianbads() {
        List<Daftarhunianbad> daftarhunianbads = new ArrayList<>();
        daftarhunianbadRepository.findAll().forEach(daftarhunianbads::add);
        return daftarhunianbads;
    }

    public Daftarhunianbad getDaftarhunianbad(int no) {
        //return daftarhunianHdrs.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
//        return daftarhunianbadRepository.findOne(s);  //err
        return null; //err
    }

    public void addDaftarhunianbad(Daftarhunianbad daftarhunianbad) {
        daftarhunianbadRepository.save(daftarhunianbad);
    }

    void updateDaftarhunianbad(int no, Daftarhunianbad daftarhunianbad) {
        daftarhunianbadRepository.save(daftarhunianbad);
    }

    void deleteDaftarhunianbad(int no) {
        String s = String.valueOf(no);
//        daftarhunianbadRepository.delete(s);  //err
    }

}
