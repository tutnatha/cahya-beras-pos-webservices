//nip
//nama
//tempat_lahir
//tgl_lahir
//pangkat
//golongan_ruang
//jabatan
//pangkat_tmt
//thn_mkg
//bln_mkg
//thn_gol_gaji
//thn_seluruh
//bln_seluruh
//tmt_pangkat_pertama
//gol_pangkat_pertama
//thn_pangkat_pertama
//bln_pangkat_pertama
//thn_pensiun
//jenjang_pendidikan
//jurusan_pendidikan
//bln_gol_gaji

package com.course.springbootstarter.pegawai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;

@Entity
@Table(name = "pegawai")
public class Pegawai {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nip")
    private String nip;     //nip
    @Column(name="name")
    private String name;    //nama
    @Column(name="tempat_lahir")
    private String tempatLahir; //tempat_lahir
    @Column(name="tgl_lahir")
    private Date tglLahir;   //tgl_lahir
    @Column(name="pangkat")
    private String pangkat;     //pangkat
    @Column(name="golongan_ruang")
    private String golonganRuang;  //golongan_ruang
    @Column(name="jabatan")
    private String jabatan;         //jabatan
    @Column(name="pangkat_tmt")
    private Date pangkatTmt;     //pangkat_tmt
    @Column(name="thn_mkg")
    private int thnMkg;         //thn_mkg
    @Column(name="bln_mkg")
    private int blnMkg;         //bln_mkg
    @Column(name="thn_gol_gaji")
    private int thnGolGaji;    //thn_gol_gaji
    @Column(name="thn_seluruh")
    private int thnSeluruh;     //thn_seluruh
    @Column(name="bln_seluruh")
    private int blnSeluruh;     //bln_seluruh
    @Column(name="tmt_pangkat_pertama")
    private Date tmtPangkatPertama; //tmt_pangkat_pertama
    @Column(name="gol_pangkat_pertama")
    private String golPangkatPertama; //gol_pangkat_pertama
    @Column(name="thn_pangkat_pertama")
    private int thnPangkatPertama; //thn_pangkat_pertama
    @Column(name="bln_pangkat_pertama")
    private int blnPangkatPertama; //bln_pangkat_pertama
    @Column(name="thn_pensiun")
    private int thnPensiun;         //thn_pensiun
    @Column(name="jenjang_pendidikan")
    private String jenjangPendidikan;  //jenjang_pendidikan
    @Column(name="jurusan_pendidikan")
    private String jurusanPendidikan;  //jurusan_pendidikan
    @Column(name="bln_gol_gaji")
    private int blnGolGaji;        //bln_gol_gaji
    @Column(name="nama")
    private String nama;

    public Pegawai() {

    }

    public Pegawai(String nip,
                   String nama,
                   String tempatLahir,
                   Date tglLahir,
                   String pangkat,
                   String golonganRuang,
                   String jabatan,
                   Date pangkatTmt,
                   int thnMkg,
                   int blnMkg,
                   int thnGolGaji,
                   int blnGolGaji,
                   int thnSeluruh,
                   int blnSeluruh,
                   Date tmtPangkatPertama,
                   String golPangkatPertama,
                   int thnPangkatPertama,
                   int blnPangkatPertama,
                   int thnPensiun,
                   String jenjangPendidikan,
                   String jurusanPendidikan,
                   String name) {

        super();
        this.nip     = nip;
        this.name   = name; //url
        this.tempatLahir    = tempatLahir;
        this.tglLahir       = tglLahir;
        this.pangkat        = pangkat;
        this.golonganRuang  = golonganRuang;
        this.jabatan    = jabatan;
        this.pangkatTmt = pangkatTmt;
        this.thnMkg     = thnMkg;
        this.blnMkg     = blnMkg;
        this.thnGolGaji = thnGolGaji;
        this.blnGolGaji = blnGolGaji;
        this.thnSeluruh = thnSeluruh;
        this.blnSeluruh = blnSeluruh;
        this.tmtPangkatPertama  = tmtPangkatPertama;
        this.golPangkatPertama  = golPangkatPertama;
        this.thnPangkatPertama  = thnPangkatPertama;
        this.blnPangkatPertama  = blnPangkatPertama;
        this.thnPensiun = thnPensiun  ;
        this.jenjangPendidikan  = jenjangPendidikan  ;
        this.jurusanPendidikan  = jurusanPendidikan  ;
        this.blnGolGaji = blnGolGaji  ;
	this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setId(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {return tglLahir;}

    public void setTglLahir(Date tglLahir) {this.tglLahir = tglLahir;}

    public String getPangkat()  {return pangkat;}

    public void setPangkat(String pangkat)    {this.pangkat = pangkat;}

    public String getGolonganRuang()    {return golonganRuang;}

    public void setGolonganRuang(String golonganRuang) {this.golonganRuang  = golonganRuang;}

    public String getJabatan()  {return jabatan;}

    public void setJabatan(String jabatan)    {this.jabatan    = jabatan;}

    public Date getPangkatTmt()  {return pangkatTmt;}

    public void setPangkatTmt(Date pangkatTmt) {this.pangkatTmt = pangkatTmt;}

    public int getThnMkg(){return thnMkg;}

    public void setThnMkg(int thnMkg) {this.thnMkg = thnMkg;}

    public int getBlnMkg()  {return blnMkg;}

    public void setBlnMkg(int blnMkg) {this.blnMkg = blnMkg;}

    public int getThnGolGaji(){return thnGolGaji;}

    public void setThnGolGaji(int thnGolGaji) {this.thnGolGaji = thnGolGaji;}

    public int getBlnGolGaji()  {return blnGolGaji;}

    public void setBlnGolGaji(int blnGolGaji) {this.blnGolGaji = blnGolGaji;}

    public int getThnSeluruh()  {return thnSeluruh;}

    public void setThnSeluruh(int thnSeluruh)   {this.thnSeluruh = thnSeluruh;}

    public int getBlnSeluruh()  {return blnSeluruh;}

    public void setBlnSeluruh(int blnSeluruh)   {this.blnSeluruh = blnSeluruh;}

    public Date getTmtPangkatPertama() {return tmtPangkatPertama;}

    public void setTmtPangkatPertama(Date tmtPangkatPertama)    {this.tmtPangkatPertama  = tmtPangkatPertama;}

    public String getGolPangkatPertama()  {return golPangkatPertama;}

    public void setGolPangkatPertama(String golPangkatPertama) {this.golPangkatPertama  = golPangkatPertama;}

    public int getThnPangkatPertama()   {return thnPangkatPertama;}

    public void setThnPangkatPertama(int thnPangkatPertama) {this.thnPangkatPertama  = thnPangkatPertama;}

    public int getBlnPangkatPertama() {return blnPangkatPertama;}

    public void setBlnPangkatPertama(int blnPangkatPertama) {this.blnPangkatPertama = blnPangkatPertama;}

    public int getThnPensiun()  {return thnPensiun;}

    public void setThnPensiun(int thnPensiun) {this.thnPensiun = thnPensiun;}

    public String getJenjangPendidikan()  {return jenjangPendidikan;}

    public void setJenjangPendidikan(String jenjangPendidikan)  {this.jenjangPendidikan  = jenjangPendidikan;}

    public String getJurusanPendidikan() {
        return jurusanPendidikan;
    }

    public void setJurusanPendidikan(String jurusanPendidikan) {this.jurusanPendidikan  = jurusanPendidikan;}
	
	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
}	

