package com.course.springbootstarter.badroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "badroom")
public class Badroom {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="no")
    ///private int no;
    private String no;
    @Column(name="no_kamar")
    private String noKamar;
    @Column(name="reg_no")
    private String regNo;
    @Column(name="is_used")
    private String isUsed;
    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;

    public Badroom() {

    }

//    public Badroom(int no, String noKamar, String regNo, String isUsed, Date startDate, Date endDate) {
    public Badroom(String no, String noKamar, String regNo, String isUsed, Date startDate, Date endDate) {
        super();
        this.no = no;
        this.noKamar = noKamar;
        this.regNo = regNo;
        this.isUsed = isUsed;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public Date getStartDate() {return startDate;}

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
