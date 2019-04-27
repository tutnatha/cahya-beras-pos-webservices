package com.course.springbootstarter.surattugas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "surat_tugas")
public class SuratTugas {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nomor_surat")
    private String nomorSurat;
    @Column(name="isi_surat")
    private String isiSurat;
    @Column(name="nip_pemberi_tugas")
    private String nipPemberiTugas;
    @Column(name="txt_hdr")
    private String txtHdr;
    @Column(name="txt_penutup")
    private String txtPenutup;
    @Column(name="url_logo_hdr1")
    private String urlLogoHdr1;
    @Column(name="url_logo_hdr2")
    private String urlLogoHdr2;
    @Column(name="create_date")
    private Date createDate;
    @Column(name="create_location")
    private String createLocation;
    @Column(name="template_modul")
    private int templateModul;

    public SuratTugas() {

    }

    public SuratTugas(String nomorSurat, String isiSurat, String nipPemberiTugas, String txtHdr,
        String txtPenutup, String urlLogoHdr, String urlLogoHdr2, Date createDate, String createLocation,
        int templateModul) {
        super();
        this.nomorSurat = nomorSurat;
        this.isiSurat = isiSurat;
	this.nipPemberiTugas = nipPemberiTugas;
        this.txtHdr = txtHdr;
        this.txtPenutup = txtPenutup;
        this.urlLogoHdr2 = urlLogoHdr2;
        this.createDate = createDate;
        this.createLocation = createLocation;
        this.templateModul = templateModul;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getIsiSurat() {
        return isiSurat;
    }

    public void setIsiSurat(String isiSurat) {
        this.isiSurat = isiSurat;
    }

    public String getNipPemberiTugas() {
        return nipPemberiTugas;
    }

    public void setNipPemberiTugas(String nipPemberiTugas) {
        this.nipPemberiTugas = nipPemberiTugas;
    }
    
    public String getTxtHdr() {
	return txtHdr;
    }

    public void setTxtHdr(String txtHdr){
        this.txtHdr = txtHdr;
    }

    public String getTxtPenutup(){
        return txtPenutup;
    }

    public void setTxtPenutup(String txtPenutup){
        this.txtPenutup = txtPenutup;
    }

    public String getUrlLogoHdr1(){
        return urlLogoHdr1;
    }

    public void setUrlLogoHdr1(String urlLogoHdr1){
        this.urlLogoHdr1 = urlLogoHdr1;
    }

    public String getUrlLogoHdr2(){
        return urlLogoHdr2;
    }

    public void setUrlLogoHdr2(String urlLogoHdr2){
        this.urlLogoHdr2 = urlLogoHdr2;
    }

    public Date getCreateDate(){
        return createDate;
    }

    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }

    public String getCreateLocation(){
        return createLocation;
    }

    public void setCreateLocation(String createLocation){
        this.createLocation = createLocation;
    }

    public int getTemplateModul(){
        return templateModul;
    }

    public void setTemplateModul(int templateModul){
        this.templateModul = templateModul;
    }
}
