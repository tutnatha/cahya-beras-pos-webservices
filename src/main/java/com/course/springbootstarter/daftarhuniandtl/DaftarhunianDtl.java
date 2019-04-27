//no_trx
//seq_no
//no_kamar

package com.course.springbootstarter.daftarhuniandtl;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "daftarhunian_dtl")
@NamedQueries({
@NamedQuery(name="DaftarhunianDtl.findAll", 
        query="SELECT d FROM DaftarhunianDtl d"),
@NamedQuery(name="DaftarhunianDtl.findByNoTrx", 
        query="SELECT d FROM DaftarhunianDtl d WHERE d.id.noTrx = ?1")
})
public class DaftarhunianDtl implements Serializable{

    private static final long serialVersionUID = -3009157732242241606L;
    
    @EmbeddedId
    private MyCompositePK id; //= new DaftarHunianAsramaDtl().new MyCompositePK();
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="no_trx")
    ///private int no;
//    private String no;          //catatan: pakai String dulu ya..
    @Column(name="seq_no")
    private int seqNo;
//    @Column(name="no_kamar")
//    private int noKamar;

        @Embeddable
//    public class MyCompositePK implements Serializable{ 
//
//	However, I found that if I change class Id to static. Everything will be fine.
//	I am just curious about how all these stuff can happen.
//	https://stackoverflow.com/questions/6805143/no-default-constructor-for-entity-for-inner-class-in-hibernate
//
    //harus static : sumber stackoverflow.com/questions/6805143
    public static class MyCompositePK implements Serializable{ 
        @Column(name="no_trx")
        private int noTrx;

        @Column(name="no_kamar")
        private String noKamar;
        
//        public MyCompositePK(){
        protected MyCompositePK(){
        	
        }
        
    	public String getNoKamar() {
    		return noKamar;
    	}

    	public void setNoKamar(String noKamar) {
    		this.noKamar = noKamar;
    	}

        public int getNoTrx() {
                return noTrx;
        }

        public void setNoTrx(int noTrx) {
                this.noTrx = noTrx;
        }

    }

    public DaftarhunianDtl() {

    }

    //    public DaftarhunianHdr(int no, String noKamar, String regNo, String isUsed, Date startDate, Date endDate) {
    public DaftarhunianDtl(String no, int seqNo, int noKamar) {
        super();
//        this.no = no;
        this.seqNo = seqNo;
//        this.noKamar = noKamar;
    }

    //    public int getNo() {
//    public String getNo() {
//        return no;
//    }

    //    public void setNo(int no) {
//        this.no = no;
//    }
//    public void setNo(String no) {
//        this.no = no;
//    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

//    public int getNoKamar() {
//        return noKamar;
//    }

//    public void setNoKamar(int noKamar) {
//        this.noKamar = noKamar;
//    }

    public MyCompositePK getId() {
        return id;
    }

    public void setId(MyCompositePK id) {
        this.id = id;
    }

//22-Jan-19
    @Column(name="nip")
    private String nip;

    @Column(name="nama")
    private String nama;

    public String getNip(){
        return nip;
    }
	
    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }
	
    public void setNama(String nama){
        this.nama = nama;
    }
//end 22-Jan-19    
}
