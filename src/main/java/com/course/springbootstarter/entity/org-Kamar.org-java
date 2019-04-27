package com.course.springbootstarter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "kamar")
public class Kamar {

    private static final long serialVersionUID = -3009157732242241606L;	//tdk kopatibel dgn rest security?
//	private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) //String tdk boleh auto generate
    @Column(name="no")
    private String no;
    @Column(name="lantai")
    private int lantai;
    @Column(name="jml_tt")
    private int jmlTt;
    @Column(name="url_picture")
    private String urlPicture;

    public Kamar() {

    }

    public Kamar(String no, int lantai, int jmlTt, String urlPicture) {
        super();
        this.no = no;
        this.lantai = lantai;
        this.jmlTt = jmlTt;
        this.urlPicture = urlPicture;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public void setJmlTt(int jmlTt) {
        this.jmlTt = jmlTt;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

}
