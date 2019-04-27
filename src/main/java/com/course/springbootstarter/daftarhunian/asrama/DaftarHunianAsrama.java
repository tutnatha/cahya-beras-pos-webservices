package com.course.springbootstarter.daftarhunian.asrama;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import lpmpJpaEclipseLink.NamedQuery;

//import com.gigy.model.Skill;

@Entity
@Table(name = "daftarhunian_hdr")
@NamedQuery(name="DaftarHunianAsrama.findAll", query="SELECT d FROM DaftarHunianAsrama d")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //tambahan untuk: error json 500
public class DaftarHunianAsrama implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="no_trx")
    ///private int no;
    private int noTrx;          //catatan: pakai String dulu ya..
    @Column(name="penyelenggara")
    private String penyelenggara;
    @Column(name="jml_peserta")
    private int jmlPeserta;
    @Column(name="tgl_mulai")
    private Date tglMulai;
    @Column(name="tgl_selesai")
    private Date tglSelesai;
    @Column(name="sudah_selesai")
    private String sudahSelesai;
//    @Column(name="kode_kegiatan")
    private String kodeKegiatan;

//    @OneToMany(targetEntity=com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl.class, mappedBy = "daftarHunianAsrama") //person
    @OneToMany(mappedBy="daftarHunianAsrama")
//    private Set<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> daftarHunianAsramaDtls = new HashSet<DaftarHunianAsramaDtl>();
    private List<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> daftarHunianAsramaDtls = new ArrayList<DaftarHunianAsramaDtl>();
    
	public int getNoTrx() {
		return noTrx;
	}

	public void setNoTrx(int no) {
		this.noTrx = noTrx;
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

//	public Set<DaftarHunianAsramaDtl> getDaftarHunianAsramaDtls() {
//		return daftarHunianAsramaDtls;
//	}
//
//	public void setDaftarHunianAsramaDtls(Set<DaftarHunianAsramaDtl> daftarHunianAsramaDtls) {
//		this.daftarHunianAsramaDtls = daftarHunianAsramaDtls;
//	}

	public List<DaftarHunianAsramaDtl> getDaftarHunianAsramaDtls() {
		return daftarHunianAsramaDtls;
	}

	public void setDaftarHunianAsramaDtls(List<DaftarHunianAsramaDtl> daftarHunianAsramaDtls) {
		this.daftarHunianAsramaDtls = daftarHunianAsramaDtls;
	}

	public DaftarHunianAsrama() {
//		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
