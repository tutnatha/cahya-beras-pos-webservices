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
@Table(name = "stocklevel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stocklevel.findAll", query = "SELECT s FROM Stocklevel s"),
    @NamedQuery(name = "Stocklevel.findById", query = "SELECT s FROM Stocklevel s WHERE s.id = :id"),
    @NamedQuery(name = "Stocklevel.findByStocksecurity", query = "SELECT s FROM Stocklevel s WHERE s.stocksecurity = :stocksecurity"),
    @NamedQuery(name = "Stocklevel.findByStockmaximum", query = "SELECT s FROM Stocklevel s WHERE s.stockmaximum = :stockmaximum")})
public class Stocklevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stocksecurity")
    private Double stocksecurity;
    @Column(name = "stockmaximum")
    private Double stockmaximum;
    @JoinColumn(name = "location", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Locations location;
    @JoinColumn(name = "product", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products product;

    public Stocklevel() {
    }

    public Stocklevel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getStocksecurity() {
        return stocksecurity;
    }

    public void setStocksecurity(Double stocksecurity) {
        this.stocksecurity = stocksecurity;
    }

    public Double getStockmaximum() {
        return stockmaximum;
    }

    public void setStockmaximum(Double stockmaximum) {
        this.stockmaximum = stockmaximum;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
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
        if (!(object instanceof Stocklevel)) {
            return false;
        }
        Stocklevel other = (Stocklevel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Stocklevel[ id=" + id + " ]";
    }
    
}
