package com.course.springbootstarter.penugasan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pegawai database table.
 * 
 */
@Entity
@Table(name="pegawai")
@NamedQuery(name="Pegawai2.findAll", query="SELECT p FROM Pegawai2 p")
public class Pegawai2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nip")
	private String nip;

	@Column(name="bln_gol_gaji")
	private int blnGolGaji;

	@Column(name="bln_mkg")
	private int blnMkg;

	@Column(name="bln_pangkat_pertama")
	private int blnPangkatPertama;

	@Column(name="bln_seluruh")
	private int blnSeluruh;

//	private int blnGolGaji;

//	private int blnMkg;

//	private int blnPangkatPertama;

//	private int blnSeluruh;

	@Column(name="gol_pangkat_pertama")
	private String golPangkatPertama;

	@Column(name="golongan_ruang")
	private String golonganRuang;

//	private String golonganRuang;

//	private String golPangkatPertama;

	private String jabatan;

	@Column(name="jenjang_pendidikan")
	private String jenjangPendidikan;

//	private String jenjangPendidikan;

	@Column(name="jurusan_pendidikan")
	private String jurusanPendidikan;

//	private String jurusanPendidikan;

	private String nama;

//	private String name;

	private String pangkat;

	@Temporal(TemporalType.DATE)
	@Column(name="pangkat_tmt")
	private Date pangkatTmt;

//	@Temporal(TemporalType.TIMESTAMP)
//	private Date pangkatTmt;

	@Column(name="tempat_lahir")
	private String tempatLahir;

//	private String tempatLahir;

	@Temporal(TemporalType.DATE)
	@Column(name="tgl_lahir")
	private Date tglLahir;

//	@Temporal(TemporalType.TIMESTAMP)
//	private Date tglLahir;

	@Column(name="thn_gol_gaji")
	private int thnGolGaji;

	@Column(name="thn_mkg")
	private int thnMkg;

	@Column(name="thn_pangkat_pertama")
	private int thnPangkatPertama;

	@Column(name="thn_pensiun")
	private int thnPensiun;

	@Column(name="thn_seluruh")
	private int thnSeluruh;

//	private int thnGolGaji;

//	private int thnMkg;

//	private int thnPangkatPertama;

//	private int thnPensiun;

//	private int thnSeluruh;

	@Temporal(TemporalType.DATE)
	@Column(name="tmt_pangkat_pertama")
	private Date tmtPangkatPertama;

//	@Temporal(TemporalType.TIMESTAMP)
//	private Date tmtPangkatPertama;

	//bi-directional many-to-one association to SuratTuga
	@OneToMany(mappedBy="pegawai")
	private List<SuratTugas2> suratTugas;

	//bi-directional many-to-one association to SuratTugasDtl
	@OneToMany(mappedBy="pegawai")
	private List<SuratTugasDtl2> suratTugasDtls;

	public Pegawai2() {
	}

	public String getNip() {
		return this.nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public int getBlnGolGaji() {
		return this.blnGolGaji;
	}

	public void setBlnGolGaji(int blnGolGaji) {
		this.blnGolGaji = blnGolGaji;
	}

//	public int getBlnMkg() {
//		return this.blnMkg;
//	}
//
//	public void setBlnMkg(int blnMkg) {
//		this.blnMkg = blnMkg;
//	}

	public int getBlnPangkatPertama() {
		return this.blnPangkatPertama;
	}

	public void setBlnPangkatPertama(int blnPangkatPertama) {
		this.blnPangkatPertama = blnPangkatPertama;
	}

	public int getBlnSeluruh() {
		return this.blnSeluruh;
	}

	public void setBlnSeluruh(int blnSeluruh) {
		this.blnSeluruh = blnSeluruh;
	}

//	public int getBlnGolGaji() {
//		return this.blnGolGaji;
//	}
//
//	public void setBlnGolGaji(int blnGolGaji) {
//		this.blnGolGaji = blnGolGaji;
//	}

	public int getBlnMkg() {
		return this.blnMkg;
	}

	public void setBlnMkg(int blnMkg) {
		this.blnMkg = blnMkg;
	}

//	public int getBlnPangkatPertama() {
//		return this.blnPangkatPertama;
//	}
//
//	public void setBlnPangkatPertama(int blnPangkatPertama) {
//		this.blnPangkatPertama = blnPangkatPertama;
//	}

//	public int getBlnSeluruh() {
//		return this.blnSeluruh;
//	}
//
//	public void setBlnSeluruh(int blnSeluruh) {
//		this.blnSeluruh = blnSeluruh;
//	}

	public String getGolPangkatPertama() {
		return this.golPangkatPertama;
	}

	public void setGolPangkatPertama(String golPangkatPertama) {
		this.golPangkatPertama = golPangkatPertama;
	}

	public String getGolonganRuang() {
		return this.golonganRuang;
	}

	public void setGolonganRuang(String golonganRuang) {
		this.golonganRuang = golonganRuang;
	}

//	public String getGolonganRuang() {
//		return this.golonganRuang;
//	}
//
//	public void setGolonganRuang(String golonganRuang) {
//		this.golonganRuang = golonganRuang;
//	}

//	public String getGolPangkatPertama() {
//		return this.golPangkatPertama;
//	}
//
//	public void setGolPangkatPertama(String golPangkatPertama) {
//		this.golPangkatPertama = golPangkatPertama;
//	}

	public String getJabatan() {
		return this.jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getJenjangPendidikan() {
		return this.jenjangPendidikan;
	}

	public void setJenjangPendidikan(String jenjangPendidikan) {
		this.jenjangPendidikan = jenjangPendidikan;
	}

//	public String getJenjangPendidikan() {
//		return this.jenjangPendidikan;
//	}
//
//	public void setJenjangPendidikan(String jenjangPendidikan) {
//		this.jenjangPendidikan = jenjangPendidikan;
//	}

	public String getJurusanPendidikan() {
		return this.jurusanPendidikan;
	}

	public void setJurusanPendidikan(String jurusanPendidikan) {
		this.jurusanPendidikan = jurusanPendidikan;
	}

//	public String getJurusanPendidikan() {
//		return this.jurusanPendidikan;
//	}
//
//	public void setJurusanPendidikan(String jurusanPendidikan) {
//		this.jurusanPendidikan = jurusanPendidikan;
//	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getPangkat() {
		return this.pangkat;
	}

	public void setPangkat(String pangkat) {
		this.pangkat = pangkat;
	}

//	public Date getPangkatTmt() {
//		return this.pangkatTmt;
//	}
//
//	public void setPangkatTmt(Date pangkatTmt) {
//		this.pangkatTmt = pangkatTmt;
//	}

	public Date getPangkatTmt() {
		return this.pangkatTmt;
	}

	public void setPangkatTmt(Date pangkatTmt) {
		this.pangkatTmt = pangkatTmt;
	}

//	public String getTempatLahir() {
//		return this.tempatLahir;
//	}
//
//	public void setTempatLahir(String tempatLahir) {
//		this.tempatLahir = tempatLahir;
//	}

	public String getTempatLahir() {
		return this.tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

//	public Date getTglLahir() {
//		return this.tglLahir;
//	}
//
//	public void setTglLahir(Date tglLahir) {
//		this.tglLahir = tglLahir;
//	}

	public Date getTglLahir() {
		return this.tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

//	public int getThnGolGaji() {
//		return this.thnGolGaji;
//	}
//
//	public void setThnGolGaji(int thnGolGaji) {
//		this.thnGolGaji = thnGolGaji;
//	}

//	public int getThnMkg() {
//		return this.thnMkg;
//	}
//
//	public void setThnMkg(int thnMkg) {
//		this.thnMkg = thnMkg;
//	}

	public int getThnPangkatPertama() {
		return this.thnPangkatPertama;
	}

	public void setThnPangkatPertama(int thnPangkatPertama) {
		this.thnPangkatPertama = thnPangkatPertama;
	}

//	public int getThnPensiun() {
//		return this.thnPensiun;
//	}
//
//	public void setThnPensiun(int thnPensiun) {
//		this.thnPensiun = thnPensiun;
//	}

	public int getThnSeluruh() {
		return this.thnSeluruh;
	}

	public void setThnSeluruh(int thnSeluruh) {
		this.thnSeluruh = thnSeluruh;
	}

	public int getThnGolGaji() {
		return this.thnGolGaji;
	}

	public void setThnGolGaji(int thnGolGaji) {
		this.thnGolGaji = thnGolGaji;
	}

	public int getThnMkg() {
		return this.thnMkg;
	}

	public void setThnMkg(int thnMkg) {
		this.thnMkg = thnMkg;
	}

//	public int getThnPangkatPertama() {
//		return this.thnPangkatPertama;
//	}
//
//	public void setThnPangkatPertama(int thnPangkatPertama) {
//		this.thnPangkatPertama = thnPangkatPertama;
//	}

	public int getThnPensiun() {
		return this.thnPensiun;
	}

	public void setThnPensiun(int thnPensiun) {
		this.thnPensiun = thnPensiun;
	}

//	public int getThnSeluruh() {
//		return this.thnSeluruh;
//	}
//
//	public void setThnSeluruh(int thnSeluruh) {
//		this.thnSeluruh = thnSeluruh;
//	}

	public Date getTmtPangkatPertama() {
		return this.tmtPangkatPertama;
	}

	public void setTmtPangkatPertama(Date tmtPangkatPertama) {
		this.tmtPangkatPertama = tmtPangkatPertama;
	}

//	public Date getTmtPangkatPertama() {
//		return this.tmtPangkatPertama;
//	}
//
//	public void setTmtPangkatPertama(Date tmtPangkatPertama) {
//		this.tmtPangkatPertama = tmtPangkatPertama;
//	}

	public List<SuratTugas2> getSuratTugas() {
		return this.suratTugas;
	}

	public void setSuratTugas(List<SuratTugas2> suratTugas) {
		this.suratTugas = suratTugas;
	}

	public SuratTugas2 addSuratTuga(SuratTugas2 suratTugas) {
		getSuratTugas().add(suratTugas);
		suratTugas.setPegawai(this);

		return suratTugas;
	}

	public SuratTugas2 removeSuratTuga(SuratTugas2 suratTuga) {
		getSuratTugas().remove(suratTuga);
		suratTuga.setPegawai(null);

		return suratTuga;
	}

	public List<SuratTugasDtl2> getSuratTugasDtls() {
		return this.suratTugasDtls;
	}

	public void setSuratTugasDtls(List<SuratTugasDtl2> suratTugasDtls) {
		this.suratTugasDtls = suratTugasDtls;
	}

	public SuratTugasDtl2 addSuratTugasDtl(SuratTugasDtl2 suratTugasDtl) {
		getSuratTugasDtls().add(suratTugasDtl);
		suratTugasDtl.setPegawai(this);

		return suratTugasDtl;
	}

	public SuratTugasDtl2 removeSuratTugasDtl(SuratTugasDtl2 suratTugasDtl) {
		getSuratTugasDtls().remove(suratTugasDtl);
		suratTugasDtl.setPegawai(null);

		return suratTugasDtl;
	}

}