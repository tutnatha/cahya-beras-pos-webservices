
//no_trx
//seq_no
//no_kamar
//nip

package com.course.springbootstarter.daftarhunianbad;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "daftarhunianbad")
public class Daftarhunianbad {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="no_trx")
    private int noTrx;
//    private String noTrx;          //catatan: pakai String dulu ya..
    @Column(name="seq_no")
    private int seqNo;
    @Column(name="no_kamar")
    private int noKamar;
    @Column(name="nip")
    private String nip;

    public Daftarhunianbad() {

    }

    //    public DaftarhunianHdr(int no, String noKamar, String regNo, String isUsed, Date startDate, Date endDate) {
    public Daftarhunianbad(int noTrx, int seqNo, int noKamar, String nip) {
        super();
        this.noTrx = noTrx;
        this.seqNo = seqNo;
        this.noKamar = noKamar;
        this.nip = nip;
        
    }

    public int getNoTrx() {
        return noTrx;
    }

    //    public void setNo(int no) {
//        this.no = no;
//    }

    public void setNoTrx(int noTrx) {
        this.noTrx = noTrx;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

}

