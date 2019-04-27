package com.course.springbootstarter.kegiatan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "kegiatan")
public class Kegiatan {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String kode;
    @Column(name="nama_kegiatan")
    private String namaKegiatan;
    private String nama;
    private String keterangan;

    public Kegiatan() {

    }

    public Kegiatan(String kode, String namaKegiatan, String nama, String keterangan) {
        super();
        this.kode = kode;
        this.namaKegiatan = namaKegiatan;
	this.nama = nama;
        this.keterangan = keterangan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public String getNamaKegiatan() {
	return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan){
        this.namaKegiatan = namaKegiatan;
    }
}
