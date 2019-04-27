package com.course.springbootstarter.penugasan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the surat_tugas database table.
 * 
 */
@Entity
@Table(name="surat_tugas")
@NamedQuery(name="SuratTugas2.findAll", query="SELECT s FROM SuratTugas2 s")
public class SuratTugas2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nomor_surat")
	private String nomorSurat;

	//bi-directional many-to-one association to SuratTuga
	@OneToMany(mappedBy="id.nomorSurat")
	private List<SuratTugasDtl2> suratTugasDtl;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_location")
	private String createLocation;

//	@Temporal(TemporalType.DATE)
//	@Column(name="created_date")
//	private Date createdDate;

//	@Temporal(TemporalType.TIMESTAMP)
//	private Date createDate;

//	private String createLocation;

	@Column(name="isi_surat")
	private String isiSurat;

//	private String nipPemberiTugas;

//	private String nomorSurat;

	@Column(name="template_model")
	private int templateModel;

	@Column(name="template_modul")
	private int templateModul;

//	private int templateModul;

	@Column(name="txt_hdr")
	private String txtHdr;

	@Column(name="txt_penutup")
	private String txtPenutup;

//	private String txtHdr;

//	private String txtPenutup;

	@Column(name="url_logo_hdr1")
	private String urlLogoHdr1;

	@Column(name="url_logo_hdr2")
	private String urlLogoHdr2;

//	private String urlLogoHdr1;

//	private String urlLogoHdr2;

	//bi-directional many-to-one association to LokasiSurat
	/* Buat Ngetest Aja apakah Query menjadi Benar??? */
	@ManyToOne
	@JoinColumn(name="created_location")
	private LokasiSurat2 lokasiSurat;

	//bi-directional many-to-one association to Pegawai
	@ManyToOne
	@JoinColumn(name="nip_pemberi_tugas")
	private Pegawai2 pegawai;

	public SuratTugas2() {
	}

	public String getNomorSurat() {
		return this.nomorSurat;
	}

	public void setNomorSurat(String nomorSurat) {
		this.nomorSurat = nomorSurat;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateLocation() {
		return this.createLocation;
	}

	public void setCreateLocation(String createLocation) {
		this.createLocation = createLocation;
	}

//	public Date getCreatedDate() {
//		return this.createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}

//	public Date getCreateDate() {
//		return this.createDate;
//	}
//
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}

//	public String getCreateLocation() {
//		return this.createLocation;
//	}
//
//	public void setCreateLocation(String createLocation) {
//		this.createLocation = createLocation;
//	}

	public String getIsiSurat() {
		return this.isiSurat;
	}

	public void setIsiSurat(String isiSurat) {
		this.isiSurat = isiSurat;
	}

//	public String getNipPemberiTugas() {
//		return this.nipPemberiTugas;
//	}
//
//	public void setNipPemberiTugas(String nipPemberiTugas) {
//		this.nipPemberiTugas = nipPemberiTugas;
//	}

//	public String getNomorSurat() {
//		return this.nomorSurat;
//	}
//
//	public void setNomorSurat(String nomorSurat) {
//		this.nomorSurat = nomorSurat;
//	}

	public int getTemplateModel() {
		return this.templateModel;
	}

	public void setTemplateModel(int templateModel) {
		this.templateModel = templateModel;
	}

//	public int getTemplateModul() {
//		return this.templateModul;
//	}
//
//	public void setTemplateModul(int templateModul) {
//		this.templateModul = templateModul;
//	}

	public int getTemplateModul() {
		return this.templateModul;
	}

	public void setTemplateModul(int templateModul) {
		this.templateModul = templateModul;
	}

	public String getTxtHdr() {
		return this.txtHdr;
	}

	public void setTxtHdr(String txtHdr) {
		this.txtHdr = txtHdr;
	}

	public String getTxtPenutup() {
		return this.txtPenutup;
	}

	public void setTxtPenutup(String txtPenutup) {
		this.txtPenutup = txtPenutup;
	}

//	public String getTxtHdr() {
//		return this.txtHdr;
//	}
//
//	public void setTxtHdr(String txtHdr) {
//		this.txtHdr = txtHdr;
//	}

//	public String getTxtPenutup() {
//		return this.txtPenutup;
//	}
//
//	public void setTxtPenutup(String txtPenutup) {
//		this.txtPenutup = txtPenutup;
//	}

	public String getUrlLogoHdr1() {
		return this.urlLogoHdr1;
	}

	public void setUrlLogoHdr1(String urlLogoHdr1) {
		this.urlLogoHdr1 = urlLogoHdr1;
	}

	public String getUrlLogoHdr2() {
		return this.urlLogoHdr2;
	}

	public void setUrlLogoHdr2(String urlLogoHdr2) {
		this.urlLogoHdr2 = urlLogoHdr2;
	}

//	public String getUrlLogoHdr1() {
//		return this.urlLogoHdr1;
//	}
//
//	public void setUrlLogoHdr1(String urlLogoHdr1) {
//		this.urlLogoHdr1 = urlLogoHdr1;
//	}

//	public String getUrlLogoHdr2() {
//		return this.urlLogoHdr2;
//	}
//
//	public void setUrlLogoHdr2(String urlLogoHdr2) {
//		this.urlLogoHdr2 = urlLogoHdr2;
//	}

/**/	
	public LokasiSurat2 getLokasiSurat() {
		return this.lokasiSurat;
	}

	public void setLokasiSurat(LokasiSurat2 lokasiSurat) {
		this.lokasiSurat = lokasiSurat;
	}
/**/
	public Pegawai2 getPegawai() {
		return this.pegawai;
	}

	public void setPegawai(Pegawai2 pegawai) {
		this.pegawai = pegawai;
	}

	public List<SuratTugasDtl2> getSuratTugasDtl() {
		return suratTugasDtl;
	}

	public void setSuratTugasDtl(List<SuratTugasDtl2> suratTugasDtl) {
		this.suratTugasDtl = suratTugasDtl;
	}

	
}