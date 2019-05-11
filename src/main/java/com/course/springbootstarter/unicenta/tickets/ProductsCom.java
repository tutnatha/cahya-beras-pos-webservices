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
@Table(name = "products_com")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsCom.findAll", query = "SELECT p FROM ProductsCom p"),
    @NamedQuery(name = "ProductsCom.findById", query = "SELECT p FROM ProductsCom p WHERE p.id = :id")})
public class ProductsCom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @JoinColumn(name = "product", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products product;
    @JoinColumn(name = "product2", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products product2;

    public ProductsCom() {
    }

    public ProductsCom(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getProduct2() {
        return product2;
    }

    public void setProduct2(Products product2) {
        this.product2 = product2;
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
        if (!(object instanceof ProductsCom)) {
            return false;
        }
        ProductsCom other = (ProductsCom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.ProductsCom[ id=" + id + " ]";
    }
    
}
