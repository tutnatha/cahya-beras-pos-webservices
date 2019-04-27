package com.course.springbootstarter.lokasitujuan;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LokasiTujuanService {

    @Autowired
    private LokasiTujuanRepository lokasiTujuanRepository;

    public List<LokasiTujuan> getAllLokasiTujuans() {
        List<LokasiTujuan> lokasiTujuans = new ArrayList<>();
        lokasiTujuanRepository.findAll().forEach(lokasiTujuans::add);
        return lokasiTujuans;
    }

    public LokasiTujuan getLokasiTujuan(String no) {
        //return kamars.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return lokasiTujuanRepository.findOne(no);    //err
        return null;
    }

    public void addLokasiTujuan(LokasiTujuan lokasiTujuan) {
        lokasiTujuanRepository.save(lokasiTujuan);
    }

    void updateLokasiTujuan(String no, LokasiTujuan lokasiTujuan) {
        lokasiTujuanRepository.save(lokasiTujuan);
    }

    void updateLokasiTujuan(LokasiTujuan lokasiTujuan) {
        lokasiTujuanRepository.save(lokasiTujuan);
    }
    
    void deleteLokasiTujuan(String no) {
//        lokasiTujuanRepository.delete(no);    //err
    }

}
