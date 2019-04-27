
//no_trx
//nama kegiatan
//penyelenggara
//tgl mulai
//tgl selesai
//jml peserta
//kode kegiatan

package com.course.springbootstarter.daftarhunian;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "daftarhunian_hdr")
public class DaftarhunianHdr {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="no_trx")
    ///private int no;
    private String no;          //catatan: pakai String dulu ya..
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
//    @Column(name="kode_kegiatan") //bikin error: hibernate
//    private int kodeKegiatan;     //type data asli di DB nya
    private String kodeKegiatan;    //type data tipuan coba-cobi
    
//20-Jan-19
    @Column(name="user_app_id")
    private String userAppId;
//20-Jan-19

    public DaftarhunianHdr() {

    }

    //    public DaftarhunianHdr(int no, String noKamar, String regNo, String isUsed, Date startDate, Date endDate) {
    public DaftarhunianHdr(String no, String penyelenggara, int jmlPeserta, Date tglMulai, Date tglSelesai, 
	String sudahSelesai, String kodeKegiatan) {     //balikkan lagi ke String
//        String sudahSelesai, int kodeKegiatan) {        //int bikin error di @Query
        super();
        this.no = no;
        this.penyelenggara = penyelenggara;
        this.jmlPeserta = jmlPeserta;
        this.tglMulai = tglMulai;
        this.tglSelesai = tglSelesai;
        this.sudahSelesai = sudahSelesai;
	this.kodeKegiatan = kodeKegiatan;
    }

    //    public int getNo() {
    public String getNo() {
        return no;
    }

    //    public void setNo(int no) {
//        this.no = no;
//    }
    public void setNo(String no) {
        this.no = no;
    }

    public String getPenyelenggara() {
        return penyelenggara;
    }

    public void setPenyelenggara(String penyelenggara) {
        this.penyelenggara = penyelenggara;
    }

    public String getSudahSelesai() {
        return sudahSelesai;
    }

    public void setSudahSelesai(String sudahSelesai) {
        this.sudahSelesai = sudahSelesai;
    }

    public int getJmlPeserta() {
        return jmlPeserta;
    }

    public void setJmlPeserta(int jmlPeserta) {
        this.jmlPeserta = jmlPeserta;
    }

    public Date getTglMulai() {return tglMulai;}

    public void setTglMulai(Date tglMulai) {
        this.tglMulai = tglMulai;
    }

    public Date getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(Date tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

	public String getKodeKegiatan(){    //coba pake String
//    public int getKodeKegiatan(){         //int bikin bug di @Query
		return kodeKegiatan;
	}

	public void setKodeKegiatan(String kodeKegiatan){   //balikkan lagi ke String
//    public void setKodeKegiatan(int kodeKegiatan){        //int bikin bug di @Query
		this.kodeKegiatan = kodeKegiatan;
	}

//20-Jan-19
    public String getUserAppId(){
        return userAppId;
    }

    public void setUserAppId(String userAppId){
        this.userAppId = userAppId;
    }
//20-Jan-19
}
