package com.course.springbootstarter.daftarhunian.asrama;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
public class QueriDfrtHunianHdrDtl {
    //Hdr
//  @Column(name="no_trx")
  private String no;          //catatan: pakai String dulu ya..
//  @Column(name="penyelenggara")
  private String penyelenggara;
//  @Column(name="jml_peserta")
  private int jmlPeserta;
//  @Column(name="tgl_mulai")
  private Date tglMulai;
//  @Column(name="tgl_selesai")
  private Date tglSelesai;
//  @Column(name="sudah_selesai")
  private String sudahSelesai;
  private String kodeKegiatan;
  
  //Dtl
//  @Column(name="no_trx")
  ///private int no;
//  private String dtlNo;          //catatan: pakai String dulu ya..
//  @Column(name="seq_no")
  private int seqNo;
//  @Column(name="no_kamar")
  private int noKamar;
  //take from : daftarhunianbad
  private String nip;
  private int lantai;
  private int jmlTt;
  
  public QueriDfrtHunianHdrDtl() {}

  public QueriDfrtHunianHdrDtl(String no, String penyelenggara, int jmlPeserta, Date tglMulai, Date tglSelesai, String sudahSelesai, String kodeKegiatan, String dtlNo, int seqNo, int noKamar) {
      this.no = no;
      this.penyelenggara = penyelenggara;
      this.jmlPeserta = jmlPeserta;
      this.tglMulai = tglMulai;
      this.tglSelesai = tglSelesai;
      this.sudahSelesai = sudahSelesai;
      this.kodeKegiatan = kodeKegiatan;
//      this.dtlNo = dtlNo;  //gak dipakai
      this.seqNo = seqNo;
      this.noKamar = noKamar;
  }

  public String getNo() {
      return no;
  }

  public void setNo(String no) {
      this.no = no;
  }

  public String getPenyelenggara() {
      return penyelenggara;
  }

  public void setPenyelenggara(String penyelenggara) {
      this.penyelenggara = penyelenggara;
  }

  public int getJmlPeserta() {
      return jmlPeserta;
  }

  public void setJmlPeserta(int jmlPeserta) {
      this.jmlPeserta = jmlPeserta;
  }

  public Date getTglMulai() {
      return tglMulai;
  }

  public void setTglMulai(Date tglMulai) {
      this.tglMulai = tglMulai;
  }

  public Date getTglSelesai() {
      return tglSelesai;
  }

  public void setTglSelesai(Date tglSelesai) {
      this.tglSelesai = tglSelesai;
  }

  public String getSudahSelesai() {
      return sudahSelesai;
  }

  public void setSudahSelesai(String sudahSelesai) {
      this.sudahSelesai = sudahSelesai;
  }

  public String getKodeKegiatan() {
      return kodeKegiatan;
  }

  public void setKodeKegiatan(String kodeKegiatan) {
      this.kodeKegiatan = kodeKegiatan;
  }

//  public String getDtlNo() {
//      return dtlNo;
//  }

//  public void setDtlNo(String dtlNo) {
//      this.dtlNo = dtlNo;
//  }

  public int getSeqNo() {
      return seqNo;
  }

  public void setSeqNo(int seqNo) {
      this.seqNo = seqNo;
  }

  public int getNoKamar() {
      return noKamar;
  }

  public void setNoKamar(int noKamar) {
      this.noKamar = noKamar;
  }

	public String getNip() {
		return nip;
	}
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public int getLantai() {
		return lantai;
	}
	
	public void setLantai(int lantai) {
		this.lantai = lantai;
	}
	
	public int getJmlTt() {
		return jmlTt;
	}
	
	public void setJmlTt(int jml_tt) {
		this.jmlTt = jml_tt;
	}


}
