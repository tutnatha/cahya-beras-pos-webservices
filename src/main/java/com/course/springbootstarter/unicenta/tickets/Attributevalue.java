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
@Table(name = "attributevalue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attributevalue.findAll", query = "SELECT a FROM Attributevalue a"),
    @NamedQuery(name = "Attributevalue.findById", query = "SELECT a FROM Attributevalue a WHERE a.id = :id"),
    @NamedQuery(name = "Attributevalue.findByValue", query = "SELECT a FROM Attributevalue a WHERE a.value = :value")})
public class Attributevalue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "value")
    private String value;
    @JoinColumn(name = "attribute_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Attribute attributeId;

    public Attributevalue() {
    }

    public Attributevalue(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Attribute getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Attribute attributeId) {
        this.attributeId = attributeId;
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
        if (!(object instanceof Attributevalue)) {
            return false;
        }
        Attributevalue other = (Attributevalue) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Attributevalue[ id=" + id + " ]";
    }
    
}
