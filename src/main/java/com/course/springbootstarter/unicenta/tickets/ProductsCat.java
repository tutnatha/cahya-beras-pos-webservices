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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "products_cat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsCat.findAll", query = "SELECT p FROM ProductsCat p"),
    @NamedQuery(name = "ProductsCat.findByProduct", query = "SELECT p FROM ProductsCat p WHERE p.product = :product"),
    @NamedQuery(name = "ProductsCat.findByCatorder", query = "SELECT p FROM ProductsCat p WHERE p.catorder = :catorder")})
public class ProductsCat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "product")
    private String product;
    @Column(name = "catorder")
    private Integer catorder;
    @JoinColumn(name = "product", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Products products;

    public ProductsCat() {
    }

    public ProductsCat(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getCatorder() {
        return catorder;
    }

    public void setCatorder(Integer catorder) {
        this.catorder = catorder;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (product != null ? product.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductsCat)) {
            return false;
        }
        ProductsCat other = (ProductsCat) object;
        if ((this.product == null && other.product != null) || (this.product != null && !this.product.equals(other.product))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.ProductsCat[ product=" + product + " ]";
    }
    
}
