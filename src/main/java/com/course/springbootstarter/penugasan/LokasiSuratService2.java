package com.course.springbootstarter.penugasan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.course.springbootstarter.pegawai.Pegawai;
//import com.course.springbootstarter.pegawai.PegawaiRepository;

@Service
public class LokasiSuratService2 {
    @Autowired
    private LokasiSuratRepository2 lokasiSuratRepository;

    public List<LokasiSurat2> getAllLokasiSurats() {
        List<LokasiSurat2> lokasiSurats = new ArrayList<>();
        lokasiSuratRepository.findAll().forEach(lokasiSurats::add);
        return lokasiSurats;
    }
}
