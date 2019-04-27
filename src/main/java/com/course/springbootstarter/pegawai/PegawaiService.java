package com.course.springbootstarter.pegawai;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PegawaiService {

    @Autowired
    private PegawaiRepository pegawaiRepository;

    public List<Pegawai> getAllPegawais() {
        List<Pegawai> pegawais = new ArrayList<>();
        pegawaiRepository.findAll().forEach(pegawais::add);
        return pegawais;
    }

    public Pegawai getPegawai(String kode) {
        //return pegawais.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return pegawaiRepository.findOne(kode);
        return null;    //sementara
    }

    public void addPegawai(Pegawai pegawai) {
        pegawaiRepository.save(pegawai);
    }

    void updatePegawai(String kode, Pegawai pegawai) {
        pegawaiRepository.save(pegawai);
    }

    void deletePegawai(String nip) {
//        pegawaiRepository.delete(nip);    //sementara
    }

}
