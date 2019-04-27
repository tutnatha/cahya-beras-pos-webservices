package com.course.springbootstarter.daftarhunian;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaftarhunianHdrService {

    @Autowired
    private DaftarhunianHdrRepository daftarhunianHdrRepository;

    public List<DaftarhunianHdr> getAllDaftarhunianHdrs() {
        List<DaftarhunianHdr> daftarhunianHdrs = new ArrayList<>();
        daftarhunianHdrRepository.findAll().forEach(daftarhunianHdrs::add);
        return daftarhunianHdrs;
    }

    public DaftarhunianHdr getDaftarhunianHdr(int no) {
        //return daftarhunianHdrs.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(no);
//        return daftarhunianHdrRepository.findOne(s);  //sementara
        return null; //sementara
    }

    //Daftar Hunian per Kegiatan
//    public List<DaftarhunianHdr> getDaftarhunianHdr2(int kodeKegiatan) {
    public List<DaftarhunianHdr> getDaftarhunianHdr2(String kodeKegiatan) {
//        return daftarhunianHdrs.stream().filter(t -> t.getId().equals(id)).findFirst().get(); //gak pake
//        String s = String.valueOf(kodeKegiatan);  //gak pake
        return daftarhunianHdrRepository.findByKegiatan(kodeKegiatan);
    }
    
    //Daftar Hunian per Penyelenggara
    public List<DaftarhunianHdr> getDaftarhunianHdr3(String penyelenggara) {
        //return daftarhunianHdrs.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        String s = String.valueOf(penyelenggara);
        return daftarhunianHdrRepository.findByPenyelenggara(s);
    }
    
    public void addDaftarhunianHdr(DaftarhunianHdr daftarhunianHdr) {
        daftarhunianHdrRepository.save(daftarhunianHdr);
    }

    //fungsi baru untuk simpen DaftarHunianHdr: with return value
    public DaftarhunianHdr addDaftarhunianHdr2(DaftarhunianHdr daftarhunianHdr) {
        DaftarhunianHdr dftrHunianHdr = daftarhunianHdrRepository.save(daftarhunianHdr);
        return dftrHunianHdr;
    }
    
    void updateDaftarhunianHdr(int no, DaftarhunianHdr daftarhunianHdr) {
        daftarhunianHdrRepository.save(daftarhunianHdr);
    }

    void deleteDaftarhunianHdr(int no) {
        String s = String.valueOf(no);
//        daftarhunianHdrRepository.delete(s);  //sementara
    }

//20-Jan-19
    public long findMaxNoTrxByUserAppId(String userAppId){
        return daftarhunianHdrRepository.findMaxNoTrxByUserAppId(userAppId);
    }
//20-Jan-19
}
