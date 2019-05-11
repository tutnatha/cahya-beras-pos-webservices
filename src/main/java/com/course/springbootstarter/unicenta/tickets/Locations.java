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
@Table(name = "locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locations.findAll", query = "SELECT l FROM Locations l"),
    @NamedQuery(name = "Locations.findById", query = "SELECT l FROM Locations l WHERE l.id = :id"),
    @NamedQuery(name = "Locations.findByName", query = "SELECT l FROM Locations l WHERE l.name = :name"),
    @NamedQuery(name = "Locations.findByAddress", query = "SELECT l FROM Locations l WHERE l.address = :address")})
public class Locations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "location")
    private List<Stocklevel> stocklevelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "location")
    private List<Stockdiary> stockdiaryList;

    public Locations() {
    }

    public Locations(String id) {
        this.id = id;
    }

    public Locations(String id, String name) {
        this.id = id;
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlTransient
    public List<Stocklevel> getStocklevelList() {
        return stocklevelList;
    }

    public void setStocklevelList(List<Stocklevel> stocklevelList) {
        this.stocklevelList = stocklevelList;
    }

    @XmlTransient
    public List<Stockdiary> getStockdiaryList() {
        return stockdiaryList;
    }

    public void setStockdiaryList(List<Stockdiary> stockdiaryList) {
        this.stockdiaryList = stockdiaryList;
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
        if (!(object instanceof Locations)) {
            return false;
        }
        Locations other = (Locations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Locations[ id=" + id + " ]";
    }
    
}
