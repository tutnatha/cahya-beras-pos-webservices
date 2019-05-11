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
@Table(name = "taxcategories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taxcategories.findAll", query = "SELECT t FROM Taxcategories t"),
    @NamedQuery(name = "Taxcategories.findById", query = "SELECT t FROM Taxcategories t WHERE t.id = :id"),
    @NamedQuery(name = "Taxcategories.findByName", query = "SELECT t FROM Taxcategories t WHERE t.name = :name")})
public class Taxcategories implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Taxes> taxesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxcat")
    private List<Products> productsList;

    public Taxcategories() {
    }

    public Taxcategories(String id) {
        this.id = id;
    }

    public Taxcategories(String id, String name) {
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

    @XmlTransient
    public List<Taxes> getTaxesList() {
        return taxesList;
    }

    public void setTaxesList(List<Taxes> taxesList) {
        this.taxesList = taxesList;
    }

    @XmlTransient
    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
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
        if (!(object instanceof Taxcategories)) {
            return false;
        }
        Taxcategories other = (Taxcategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Taxcategories[ id=" + id + " ]";
    }
}
