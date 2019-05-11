/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "closedcash")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Closedcash.findAll", query = "SELECT c FROM Closedcash c"),
    @NamedQuery(name = "Closedcash.findByMoney", query = "SELECT c FROM Closedcash c WHERE c.money = :money"),
    @NamedQuery(name = "Closedcash.findByHost", query = "SELECT c FROM Closedcash c WHERE c.host = :host"),
    @NamedQuery(name = "Closedcash.findByHostsequence", query = "SELECT c FROM Closedcash c WHERE c.hostsequence = :hostsequence"),
    @NamedQuery(name = "Closedcash.findByDatestart", query = "SELECT c FROM Closedcash c WHERE c.datestart = :datestart"),
    @NamedQuery(name = "Closedcash.findByDateend", query = "SELECT c FROM Closedcash c WHERE c.dateend = :dateend"),
    @NamedQuery(name = "Closedcash.findByNosales", query = "SELECT c FROM Closedcash c WHERE c.nosales = :nosales")})
public class Closedcash implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "money")
    private String money;
    @Basic(optional = false)
    @Column(name = "host")
    private String host;
    @Basic(optional = false)
    @Column(name = "hostsequence")
    private int hostsequence;
    @Basic(optional = false)
    @Column(name = "datestart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datestart;
    @Column(name = "dateend")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateend;
    @Basic(optional = false)
    @Column(name = "nosales")
    private int nosales;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "money")
    private List<Receipts> receiptsList;

    public Closedcash() {
    }

    public Closedcash(String money) {
        this.money = money;
    }

    public Closedcash(String money, String host, int hostsequence, Date datestart, int nosales) {
        this.money = money;
        this.host = host;
        this.hostsequence = hostsequence;
        this.datestart = datestart;
        this.nosales = nosales;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getHostsequence() {
        return hostsequence;
    }

    public void setHostsequence(int hostsequence) {
        this.hostsequence = hostsequence;
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public int getNosales() {
        return nosales;
    }

    public void setNosales(int nosales) {
        this.nosales = nosales;
    }

    @XmlTransient
    public List<Receipts> getReceiptsList() {
        return receiptsList;
    }

    public void setReceiptsList(List<Receipts> receiptsList) {
        this.receiptsList = receiptsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (money != null ? money.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Closedcash)) {
            return false;
        }
        Closedcash other = (Closedcash) object;
        if ((this.money == null && other.money != null) || (this.money != null && !this.money.equals(other.money))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Closedcash[ money=" + money + " ]";
    }
    
}
