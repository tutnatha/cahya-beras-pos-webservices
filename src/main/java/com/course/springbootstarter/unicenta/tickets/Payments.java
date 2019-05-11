/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "payments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p"),
    @NamedQuery(name = "Payments.findById", query = "SELECT p FROM Payments p WHERE p.id = :id"),
    @NamedQuery(name = "Payments.findByPayment", query = "SELECT p FROM Payments p WHERE p.payment = :payment"),
    @NamedQuery(name = "Payments.findByTotal", query = "SELECT p FROM Payments p WHERE p.total = :total"),
    @NamedQuery(name = "Payments.findByTip", query = "SELECT p FROM Payments p WHERE p.tip = :tip"),
    @NamedQuery(name = "Payments.findByTransid", query = "SELECT p FROM Payments p WHERE p.transid = :transid"),
    @NamedQuery(name = "Payments.findByIsprocessed", query = "SELECT p FROM Payments p WHERE p.isprocessed = :isprocessed"),
    @NamedQuery(name = "Payments.findByNotes", query = "SELECT p FROM Payments p WHERE p.notes = :notes"),
    @NamedQuery(name = "Payments.findByTendered", query = "SELECT p FROM Payments p WHERE p.tendered = :tendered"),
    @NamedQuery(name = "Payments.findByCardname", query = "SELECT p FROM Payments p WHERE p.cardname = :cardname"),
    @NamedQuery(name = "Payments.findByVoucher", query = "SELECT p FROM Payments p WHERE p.voucher = :voucher")})
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tip")
    private Double tip;
    @Column(name = "transid")
    private String transid;
    @Column(name = "isprocessed")
    private Boolean isprocessed;
    @Lob
    @Column(name = "returnmsg")
    private byte[] returnmsg;
    @Column(name = "notes")
    private String notes;
    @Column(name = "tendered")
    private Double tendered;
    @Column(name = "cardname")
    private String cardname;
    @Column(name = "voucher")
    private String voucher;
    @JoinColumn(name = "receipt", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Receipts receipt;

    public Payments() {
    }

    public Payments(String id) {
        this.id = id;
    }

    public Payments(String id, String payment, double total) {
        this.id = id;
        this.payment = payment;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid;
    }

    public Boolean getIsprocessed() {
        return isprocessed;
    }

    public void setIsprocessed(Boolean isprocessed) {
        this.isprocessed = isprocessed;
    }

    public byte[] getReturnmsg() {
        return returnmsg;
    }

    public void setReturnmsg(byte[] returnmsg) {
        this.returnmsg = returnmsg;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getTendered() {
        return tendered;
    }

    public void setTendered(Double tendered) {
        this.tendered = tendered;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public Receipts getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipts receipt) {
        this.receipt = receipt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Payments[ id=" + id + " ]";
    }
    
}
