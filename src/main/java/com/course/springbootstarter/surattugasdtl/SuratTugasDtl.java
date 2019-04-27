package com.course.springbootstarter.surattugasdtl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "surat_tugas_dtl")
public class SuratTugasDtl {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nomor_surat")
    private String nomorSurat;
    @Column(name="nomor_urut")
    private int nomorUrut;
    @Column(name="nip")
    private String nip;
    @Column(name="tujuan_sekolah")
    private String tujuanSekolah;
    @Column(name="tgl_pemantauan")    
    private Date tglPemantauan;
    @Column(name="is_valid")
    private String isValid;

    public SuratTugasDtl() {

    }

    public SuratTugasDtl(String nomorSurat, int nomorUrut, String nip, String tujuanSekolah, Date tglPemantauan, 
	String isValid) {
        super();
        this.nomorSurat = nomorSurat;
        this.nomorUrut = nomorUrut;
	this.nip = nip;
        this.tujuanSekolah = tujuanSekolah;
	this.tglPemantauan = tglPemantauan;
	this.isValid = isValid;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public int getNomorUrut() {
        return nomorUrut;
    }

    public void setNomorUrut(int nomorUrut) {
        this.nomorUrut = nomorUrut;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getTujuanSekolah() {
	return tujuanSekolah;
    }

    public void setTujuanSekolah(String tujuanSekolah){
        this.tujuanSekolah = tujuanSekolah;
    }

    public Date getTglPemantauan(){
        return tglPemantauan;
    }

    public void setTglPemantauan(Date tglPemantauan){
	this.tglPemantauan = tglPemantauan;
    }

    public String getIsValid(){
	return isValid;
    }

    public void setIsValid(String isValid){
        this.isValid = isValid;
    }

}
