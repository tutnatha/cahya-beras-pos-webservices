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
import javax.persistence.Lob;
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
@Table(name = "categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categories.findAll", query = "SELECT c FROM Categories c"),
    @NamedQuery(name = "Categories.findById", query = "SELECT c FROM Categories c WHERE c.id = :id"),
    @NamedQuery(name = "Categories.findByName", query = "SELECT c FROM Categories c WHERE c.name = :name"),
    @NamedQuery(name = "Categories.findByTexttip", query = "SELECT c FROM Categories c WHERE c.texttip = :texttip"),
    @NamedQuery(name = "Categories.findByCatshowname", query = "SELECT c FROM Categories c WHERE c.catshowname = :catshowname"),
    @NamedQuery(name = "Categories.findByCatorder", query = "SELECT c FROM Categories c WHERE c.catorder = :catorder")})
public class Categories implements Serializable {

    @Lob
    @Column(name = "image")
    private byte[] image;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "texttip")
    private String texttip;
    @Basic(optional = false)
    @Column(name = "catshowname")
    private short catshowname;
    @Column(name = "catorder")
    private String catorder;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Products> productsList;
    @OneToMany(mappedBy = "parentid")
    private List<Categories> categoriesList;
    @JoinColumn(name = "parentid", referencedColumnName = "id")
    @ManyToOne
    private Categories parentid;

    public Categories() {
    }

    public Categories(String id) {
        this.id = id;
    }

    public Categories(String id, String name, short catshowname) {
        this.id = id;
        this.name = name;
        this.catshowname = catshowname;
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


    public String getTexttip() {
        return texttip;
    }

    public void setTexttip(String texttip) {
        this.texttip = texttip;
    }

    public short getCatshowname() {
        return catshowname;
    }

    public void setCatshowname(short catshowname) {
        this.catshowname = catshowname;
    }

    public String getCatorder() {
        return catorder;
    }

    public void setCatorder(String catorder) {
        this.catorder = catorder;
    }

    @XmlTransient
    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @XmlTransient
    public List<Categories> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<Categories> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public Categories getParentid() {
        return parentid;
    }

    public void setParentid(Categories parentid) {
        this.parentid = parentid;
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
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Categories[ id=" + id + " ]";
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
}
