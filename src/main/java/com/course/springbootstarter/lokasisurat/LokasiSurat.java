package com.course.springbootstarter.lokasisurat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "lokasi_surat")
public class LokasiSurat {

    private static final long serialVersionUID = -3009157732242241606L;
//	private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="kode_lokasi")
    private String kodeLokasi;
    @Column(name="nama_lokasi")
    private String namaLokasi;
    
    public LokasiSurat() {

    }

    public LokasiSurat(String kodeLokasi, String namaLokasi) {
        super();
        this.kodeLokasi = kodeLokasi;
        this.namaLokasi = namaLokasi;
    }

    public String getKodeLokasi() {
        return kodeLokasi;
    }

    public void setKodeLokasi(String kodeLokasi) {
        this.kodeLokasi = kodeLokasi;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

}
