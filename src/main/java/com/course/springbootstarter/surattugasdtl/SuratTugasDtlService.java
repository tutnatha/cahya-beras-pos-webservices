package com.course.springbootstarter.surattugasdtl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuratTugasDtlService {

    @Autowired
    private SuratTugasDtlRepository suratTugasDtlRepository;

    public List<SuratTugasDtl> getAllSuratTugasDtls() {
        List<SuratTugasDtl> suratTugasDtls = new ArrayList<>();
        suratTugasDtlRepository.findAll().forEach(suratTugasDtls::add);
        return suratTugasDtls;
    }

    public SuratTugasDtl getSuratTugasDtl(String no) {
        //return kamars.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return suratTugasDtlRepository.findOne(no);   //error
        return null;    //sementara
    }

    public void addSuratTugasDtl(SuratTugasDtl suratTugasDtl) {
        suratTugasDtlRepository.save(suratTugasDtl);
    }

    void updateSuratTugasDtl(String no, SuratTugasDtl suratTugasDtl) {
        suratTugasDtlRepository.save(suratTugasDtl);
    }

    void updateSuratTugasDtl(SuratTugasDtl suratTugasDtl) {
        suratTugasDtlRepository.save(suratTugasDtl);
    }
    
    void deleteSuratTugasDtl(String no) {
//        suratTugasDtlRepository.delete(no);   //sementara
    }

}
