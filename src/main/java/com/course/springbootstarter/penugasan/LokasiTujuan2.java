package com.course.springbootstarter.penugasan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lokasi_tujuan database table.
 * 
 */
@Entity
@Table(name="lokasi_tujuan")
@NamedQuery(name="LokasiTujuan2.findAll", query="SELECT l FROM LokasiTujuan2 l")
public class LokasiTujuan2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String kode;

	@Column(name="nama_lokasi")
	private String namaLokasi;

	//bi-directional many-to-one association to SuratTugasDtl
	@OneToMany(mappedBy="lokasiTujuan")
	private List<SuratTugasDtl2> suratTugasDtls;

	public LokasiTujuan2() {
	}

	public String getKode() {
		return this.kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNamaLokasi() {
		return this.namaLokasi;
	}

	public void setNamaLokasi(String namaLokasi) {
		this.namaLokasi = namaLokasi;
	}

	public List<SuratTugasDtl2> getSuratTugasDtls() {
		return this.suratTugasDtls;
	}

	public void setSuratTugasDtls(List<SuratTugasDtl2> suratTugasDtls) {
		this.suratTugasDtls = suratTugasDtls;
	}

	public SuratTugasDtl2 addSuratTugasDtl(SuratTugasDtl2 suratTugasDtl) {
		getSuratTugasDtls().add(suratTugasDtl);
		suratTugasDtl.setLokasiTujuan(this);

		return suratTugasDtl;
	}

	public SuratTugasDtl2 removeSuratTugasDtl(SuratTugasDtl2 suratTugasDtl) {
		getSuratTugasDtls().remove(suratTugasDtl);
		suratTugasDtl.setLokasiTujuan(null);

		return suratTugasDtl;
	}

}