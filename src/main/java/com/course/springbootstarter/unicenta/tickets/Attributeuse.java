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
@Table(name = "attributeuse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attributeuse.findAll", query = "SELECT a FROM Attributeuse a"),
    @NamedQuery(name = "Attributeuse.findById", query = "SELECT a FROM Attributeuse a WHERE a.id = :id"),
    @NamedQuery(name = "Attributeuse.findByLineno", query = "SELECT a FROM Attributeuse a WHERE a.lineno = :lineno")})
public class Attributeuse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "lineno")
    private Integer lineno;
    @JoinColumn(name = "attribute_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Attribute attributeId;
    @JoinColumn(name = "attributeset_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Attributeset attributesetId;

    public Attributeuse() {
    }

    public Attributeuse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLineno() {
        return lineno;
    }

    public void setLineno(Integer lineno) {
        this.lineno = lineno;
    }

    public Attribute getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Attribute attributeId) {
        this.attributeId = attributeId;
    }

    public Attributeset getAttributesetId() {
        return attributesetId;
    }

    public void setAttributesetId(Attributeset attributesetId) {
        this.attributesetId = attributesetId;
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
        if (!(object instanceof Attributeuse)) {
            return false;
        }
        Attributeuse other = (Attributeuse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Attributeuse[ id=" + id + " ]";
    }
    
}
