package com.course.springbootstarter.penugasan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lokasi_surat database table.
 * 
 */
@Entity
@Table(name="lokasi_surat")
@NamedQuery(name="LokasiSurat2.findAll", query="SELECT l FROM LokasiSurat2 l")
public class LokasiSurat2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="kode_lokasi")
	private String kodeLokasi;

	@Column(name="nama_lokasi")
	private String namaLokasi;

	//bi-directional many-to-one association to SuratTuga
/*	*/
	@OneToMany(mappedBy="lokasiSurat")
	private List<SuratTugas2> suratTugas;
/* */
	public LokasiSurat2() {
	}

	public String getKodeLokasi() {
		return this.kodeLokasi;
	}

	public void setKodeLokasi(String kodeLokasi) {
		this.kodeLokasi = kodeLokasi;
	}

	public String getNamaLokasi() {
		return this.namaLokasi;
	}

	public void setNamaLokasi(String namaLokasi) {
		this.namaLokasi = namaLokasi;
	}

	/* Start */
	public List<SuratTugas2> getSuratTugas() {
		return this.suratTugas;
	}

	public void setSuratTugas(List<SuratTugas2> suratTugas) {
		this.suratTugas = suratTugas;
	}

	public SuratTugas2 addSuratTuga(SuratTugas2 suratTuga) {
		getSuratTugas().add(suratTuga);
		suratTuga.setLokasiSurat(this);

		return suratTuga;
	}

	public SuratTugas2 removeSuratTuga(SuratTugas2 suratTuga) {
		getSuratTugas().remove(suratTuga);
		suratTuga.setLokasiSurat(null);

		return suratTuga;
	}
/* End */
}