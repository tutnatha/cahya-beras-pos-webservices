/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "taxes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taxes.findAll", query = "SELECT t FROM Taxes t"),
    @NamedQuery(name = "Taxes.findById", query = "SELECT t FROM Taxes t WHERE t.id = :id"),
    @NamedQuery(name = "Taxes.findByName", query = "SELECT t FROM Taxes t WHERE t.name = :name"),
    @NamedQuery(name = "Taxes.findByRate", query = "SELECT t FROM Taxes t WHERE t.rate = :rate"),
    @NamedQuery(name = "Taxes.findByRatecascade", query = "SELECT t FROM Taxes t WHERE t.ratecascade = :ratecascade"),
    @NamedQuery(name = "Taxes.findByRateorder", query = "SELECT t FROM Taxes t WHERE t.rateorder = :rateorder")})
public class Taxes implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxid")
    private List<Taxlines> taxlinesList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "rate")
    private double rate;
    @Basic(optional = false)
    @Column(name = "ratecascade")
    private boolean ratecascade;
    @Column(name = "rateorder")
    private Integer rateorder;
    @JoinColumn(name = "category", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Taxcategories category;
    @JoinColumn(name = "custcategory", referencedColumnName = "id")
    @ManyToOne
    private Taxcustcategories custcategory;
    @OneToMany(mappedBy = "parentid")
    private List<Taxes> taxesList;
    @JoinColumn(name = "parentid", referencedColumnName = "id")
    @ManyToOne
    private Taxes parentid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxid")
    private List<Ticketlines> ticketlinesList;

    public Taxes() {
    }

    public Taxes(String id) {
        this.id = id;
    }

    public Taxes(String id, String name, double rate, boolean ratecascade) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.ratecascade = ratecascade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean getRatecascade() {
        return ratecascade;
    }

    public void setRatecascade(boolean ratecascade) {
        this.ratecascade = ratecascade;
    }

    public Integer getRateorder() {
        return rateorder;
    }

    public void setRateorder(Integer rateorder) {
        this.rateorder = rateorder;
    }

    public Taxcategories getCategory() {
        return category;
    }

    public void setCategory(Taxcategories category) {
        this.category = category;
    }

    public Taxcustcategories getCustcategory() {
        return custcategory;
    }

    public void setCustcategory(Taxcustcategories custcategory) {
        this.custcategory = custcategory;
    }

    @XmlTransient
    public List<Taxes> getTaxesList() {
        return taxesList;
    }

    public void setTaxesList(List<Taxes> taxesList) {
        this.taxesList = taxesList;
    }

    public Taxes getParentid() {
        return parentid;
    }

    public void setParentid(Taxes parentid) {
        this.parentid = parentid;
    }

    @XmlTransient
    public List<Ticketlines> getTicketlinesList() {
        return ticketlinesList;
    }

    public void setTicketlinesList(List<Ticketlines> ticketlinesList) {
        this.ticketlinesList = ticketlinesList;
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
        if (!(object instanceof Taxes)) {
            return false;
        }
        Taxes other = (Taxes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Taxes[ id=" + id + " ]";
    }

    @XmlTransient
    public List<Taxlines> getTaxlinesList() {
        return taxlinesList;
    }

    public void setTaxlinesList(List<Taxlines> taxlinesList) {
        this.taxlinesList = taxlinesList;
    }
    
}
