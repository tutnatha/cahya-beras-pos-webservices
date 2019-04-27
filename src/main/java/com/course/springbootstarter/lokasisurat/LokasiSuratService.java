package com.course.springbootstarter.lokasisurat;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LokasiSuratService {

    @Autowired
    private LokasiSuratRepository lokasiSuratRepository;

    public List<LokasiSurat> getAllLokasiSurats() {
        List<LokasiSurat> lokasiSurats = new ArrayList<>();
        lokasiSuratRepository.findAll().forEach(lokasiSurats::add);
        return lokasiSurats;
    }

    public LokasiSurat getLokasiSurat(String no) {
        //return kamars.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return lokasiSuratRepository.findOne(no);     //err
        return null;    //err
    }

    public void addLokasiSurat(LokasiSurat lokasiSurat) {
        lokasiSuratRepository.save(lokasiSurat);
    }

    void updateLokasiSurat(String no, LokasiSurat lokasiSurat) {
        lokasiSuratRepository.save(lokasiSurat);
    }

    void updateLokasiSurat(LokasiSurat lokasiSurat) {
        lokasiSuratRepository.save(lokasiSurat);
    }
    
    void deleteLokasiSurat(String no) {
//        lokasiSuratRepository.delete(no);     //err
    }

}
