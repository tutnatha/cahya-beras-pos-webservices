package com.course.springbootstarter.daftarhunian.asrama;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.springbootstarter.daftarhunian.DaftarhunianHdr;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class DaftarHunianAsramaService {
//	@Autowired
//    private DaftarHunianAsramaService daftarHunianAsramaService;
	
	@Autowired
	DaftarHunianAsramaRepository daftarHunianAsramaRepository; 

    @PersistenceContext	
    private EntityManager entityManager;	
	
    public List<QueriDfrtHunianHdrDtl> getAllQueriDfrtHunianHdrDtls() {
        List<QueriDfrtHunianHdrDtl> daftarhunianHdrs = new ArrayList<>();
//        daftarhunianHdrRepository.findAll().forEach(daftarhunianHdrs::add);
        Query nativeQuery = entityManager.createNativeQuery("select a.no_trx as no,"
                + "a.penyelenggara as penyelenggara,"
                + "a.tgl_mulai as tglMulai,"
                + "a.tgl_selesai as tglSelesai,"
                + "a.jml_peserta as jmlPeserta,"
                + "a.sudah_selesai as sudahSelesai,"
                + "a.kode_kegiatan as kodeKegiatan,"
                + "b.seq_no as seqNo,"
                + "b.no_kamar as noKamar,"
                + "c.nip as nip,"
                + "k.lantai as lantai,"
                + "k.jml_tt as jmlTt"
                + " from daftarhunian_hdr a,"
                + " daftarhunian_dtl b, "
                + " daftarhunianbad c,"
                + " kamar k"
                + " where (a.no_trx = b.no_trx)"
                + " and (b.no_kamar = k.no)"
                + " and (b.no_trx = c.no_trx)"
                + " and (b.no_kamar = c.no_kamar)");
//        return nativeQuery.getResultList();
        daftarhunianHdrs = nativeQuery.getResultList();
//        daftarHunianAsramaRepository.findAll().forEach(daftarhunianHdrs::add);
        return daftarhunianHdrs;
    }
    
    public String gsonQueryDftrHunianHdrDtls(){
    	Gson gson;
    	gson = new Gson();
        String jsonStudents = gson.toJson(getAllQueriDfrtHunianHdrDtls());
        System.out.println("jsonStudents = " + jsonStudents);
    	return jsonStudents;
    }
    
    public List<DaftarHunianAsrama> getAllDaftarhunianAsramas() {
        List<DaftarHunianAsrama> daftarHunianAsramas = new ArrayList<>();
        daftarHunianAsramaRepository.findAll().forEach(daftarHunianAsramas::add);
        return daftarHunianAsramas;
    }
	
    //method baru : untuk menampilkan Daftar Hunian Asrama
    //per noTrx
    public DaftarHunianAsrama getDaftarHunianAsrama(int no) {
        //return daftarhunianHdrs.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//        String s = String.valueOf(no);
        return daftarHunianAsramaRepository.getOne(no);
    }
}
