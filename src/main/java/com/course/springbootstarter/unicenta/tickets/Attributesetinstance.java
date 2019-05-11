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
@Table(name = "attributesetinstance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attributesetinstance.findAll", query = "SELECT a FROM Attributesetinstance a"),
    @NamedQuery(name = "Attributesetinstance.findById", query = "SELECT a FROM Attributesetinstance a WHERE a.id = :id"),
    @NamedQuery(name = "Attributesetinstance.findByDescription", query = "SELECT a FROM Attributesetinstance a WHERE a.description = :description")})
public class Attributesetinstance implements Serializable {

    @OneToMany(mappedBy = "attributesetinstanceId")
    private List<Stockdiary> stockdiaryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attributesetinstanceId")
    private List<Attributeinstance> attributeinstanceList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "attributeset_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Attributeset attributesetId;
    @OneToMany(mappedBy = "attributesetinstanceId")
    private List<Ticketlines> ticketlinesList;

    public Attributesetinstance() {
    }

    public Attributesetinstance(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Attributeset getAttributesetId() {
        return attributesetId;
    }

    public void setAttributesetId(Attributeset attributesetId) {
        this.attributesetId = attributesetId;
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
        if (!(object instanceof Attributesetinstance)) {
            return false;
        }
        Attributesetinstance other = (Attributesetinstance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Attributesetinstance[ id=" + id + " ]";
    }

    @XmlTransient
    public List<Stockdiary> getStockdiaryList() {
        return stockdiaryList;
    }

    public void setStockdiaryList(List<Stockdiary> stockdiaryList) {
        this.stockdiaryList = stockdiaryList;
    }

    @XmlTransient
    public List<Attributeinstance> getAttributeinstanceList() {
        return attributeinstanceList;
    }

    public void setAttributeinstanceList(List<Attributeinstance> attributeinstanceList) {
        this.attributeinstanceList = attributeinstanceList;
    }
    
}
