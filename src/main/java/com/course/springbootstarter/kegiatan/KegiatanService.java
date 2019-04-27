package com.course.springbootstarter.kegiatan;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KegiatanService {

    @Autowired
    private KegiatanRepository kegiatanRepository;

    public List<Kegiatan> getAllKegiatans() {
        List<Kegiatan> kegiatans = new ArrayList<>();
        kegiatanRepository.findAll().forEach(kegiatans::add);
        return kegiatans;
    }

    public Kegiatan getKegiatan(String kode) {
        //return kegiatans.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        return kegiatanRepository.findOne(kode);
        return null;
    }

    public void addKegiatan(Kegiatan kegiatan) {
        kegiatanRepository.save(kegiatan);
    }

    void updateKegiatan(String kode, Kegiatan kegiatan) {
        kegiatanRepository.save(kegiatan);
    }

    void deleteKegiatan(String kode) {
//        kegiatanRepository.delete(kode);
    }

}
