package com.course.springbootstarter.surattugas;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuratTugasService {

    @Autowired
    private SuratTugasRepository suratTugasRepository;

    public List<SuratTugas> getAllSuratTugass() {
        List<SuratTugas> suratTugass = new ArrayList<>();
        suratTugasRepository.findAll().forEach(suratTugass::add);
        return suratTugass;
    }

    public SuratTugas getSuratTugas(String no) {
        //return kamars.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return suratTugasRepository.findOne(no); //error check lg
        return null;
    }

    public void addSuratTugas(SuratTugas suratTugas) {
        suratTugasRepository.save(suratTugas);
    }

    void updateSuratTugas(String no, SuratTugas suratTugas) {
        suratTugasRepository.save(suratTugas);
    }

    void updateSuratTugas(SuratTugas suratTugas) {
        suratTugasRepository.save(suratTugas);
    }
    
    void deleteSuratTugas(String no) {
//        suratTugasRepository.delete(no); //error check lg..
    }

}
