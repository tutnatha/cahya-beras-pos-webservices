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
@Table(name = "products_bundle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsBundle.findAll", query = "SELECT p FROM ProductsBundle p"),
    @NamedQuery(name = "ProductsBundle.findById", query = "SELECT p FROM ProductsBundle p WHERE p.id = :id"),
    @NamedQuery(name = "ProductsBundle.findByQuantity", query = "SELECT p FROM ProductsBundle p WHERE p.quantity = :quantity")})
public class ProductsBundle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "quantity")
    private double quantity;
    @JoinColumn(name = "product", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products product;
    @JoinColumn(name = "product_bundle", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products productBundle;

    public ProductsBundle() {
    }

    public ProductsBundle(String id) {
        this.id = id;
    }

    public ProductsBundle(String id, double quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getProductBundle() {
        return productBundle;
    }

    public void setProductBundle(Products productBundle) {
        this.productBundle = productBundle;
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
        if (!(object instanceof ProductsBundle)) {
            return false;
        }
        ProductsBundle other = (ProductsBundle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.ProductsBundle[ id=" + id + " ]";
    }
    
}
