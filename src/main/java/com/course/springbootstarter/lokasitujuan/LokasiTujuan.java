package com.course.springbootstarter.lokasitujuan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "lokasi_tujuan")
public class LokasiTujuan {

    private static final long serialVersionUID = -3009157732242241606L;
//	private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="kode")
    private String kodeLokasi;
    @Column(name="nama_lokasi")
    private String namaLokasi;
    
    public LokasiTujuan() {

    }

    public LokasiTujuan(String kodeLokasi, String namaLokasi) {
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
