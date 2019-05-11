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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "receipts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receipts.findAll", query = "SELECT r FROM Receipts r"),
    @NamedQuery(name = "Receipts.findById", query = "SELECT r FROM Receipts r WHERE r.id = :id"),
    @NamedQuery(name = "Receipts.findByDatenew", query = "SELECT r FROM Receipts r WHERE r.datenew = :datenew"),
    @NamedQuery(name = "Receipts.findByPerson", query = "SELECT r FROM Receipts r WHERE r.person = :person")})
public class Receipts implements Serializable {

    @Lob
    @Column(name = "attributes")
    private byte[] attributes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receipt")
    private List<Payments> paymentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receipt")
    private List<Taxlines> taxlinesList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "datenew")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datenew;
    @Column(name = "person")
    private String person;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "receipts")
    private Tickets tickets;
    @JoinColumn(name = "money", referencedColumnName = "money")
    @ManyToOne(optional = false)
    private Closedcash money;

    public Receipts() {
    }

    public Receipts(String id) {
        this.id = id;
    }

    public Receipts(String id, Date datenew) {
        this.id = id;
        this.datenew = datenew;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDatenew() {
        return datenew;
    }

    public void setDatenew(Date datenew) {
        this.datenew = datenew;
    }


    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public Closedcash getMoney() {
        return money;
    }

    public void setMoney(Closedcash money) {
        this.money = money;
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
        if (!(object instanceof Receipts)) {
            return false;
        }
        Receipts other = (Receipts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Receipts[ id=" + id + " ]";
    }

    public byte[] getAttributes() {
        return attributes;
    }

    public void setAttributes(byte[] attributes) {
        this.attributes = attributes;
    }

    @XmlTransient
    public List<Payments> getPaymentsList() {
        return paymentsList;
    }

    public void setPaymentsList(List<Payments> paymentsList) {
        this.paymentsList = paymentsList;
    }

    @XmlTransient
    public List<Taxlines> getTaxlinesList() {
        return taxlinesList;
    }

    public void setTaxlinesList(List<Taxlines> taxlinesList) {
        this.taxlinesList = taxlinesList;
    }
    
}
