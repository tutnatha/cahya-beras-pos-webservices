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
@Table(name = "taxlines")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taxlines.findAll", query = "SELECT t FROM Taxlines t"),
    @NamedQuery(name = "Taxlines.findById", query = "SELECT t FROM Taxlines t WHERE t.id = :id"),
    @NamedQuery(name = "Taxlines.findByBase", query = "SELECT t FROM Taxlines t WHERE t.base = :base"),
    @NamedQuery(name = "Taxlines.findByAmount", query = "SELECT t FROM Taxlines t WHERE t.amount = :amount")})
public class Taxlines implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "base")
    private double base;
    @Basic(optional = false)
    @Column(name = "amount")
    private double amount;
    @JoinColumn(name = "receipt", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Receipts receipt;
    @JoinColumn(name = "taxid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Taxes taxid;

    public Taxlines() {
    }

    public Taxlines(String id) {
        this.id = id;
    }

    public Taxlines(String id, double base, double amount) {
        this.id = id;
        this.base = base;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Receipts getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipts receipt) {
        this.receipt = receipt;
    }

    public Taxes getTaxid() {
        return taxid;
    }

    public void setTaxid(Taxes taxid) {
        this.taxid = taxid;
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
        if (!(object instanceof Taxlines)) {
            return false;
        }
        Taxlines other = (Taxlines) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Taxlines[ id=" + id + " ]";
    }
    
}
