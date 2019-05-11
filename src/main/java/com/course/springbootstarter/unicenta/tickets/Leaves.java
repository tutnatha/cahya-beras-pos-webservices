/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "leaves")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leaves.findAll", query = "SELECT l FROM Leaves l"),
    @NamedQuery(name = "Leaves.findById", query = "SELECT l FROM Leaves l WHERE l.id = :id"),
    @NamedQuery(name = "Leaves.findByName", query = "SELECT l FROM Leaves l WHERE l.name = :name"),
    @NamedQuery(name = "Leaves.findByStartdate", query = "SELECT l FROM Leaves l WHERE l.startdate = :startdate"),
    @NamedQuery(name = "Leaves.findByEnddate", query = "SELECT l FROM Leaves l WHERE l.enddate = :enddate"),
    @NamedQuery(name = "Leaves.findByNotes", query = "SELECT l FROM Leaves l WHERE l.notes = :notes")})
public class Leaves implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "startdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Basic(optional = false)
    @Column(name = "enddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @Column(name = "notes")
    private String notes;
    @JoinColumn(name = "pplid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private People pplid;

    public Leaves() {
    }

    public Leaves(String id) {
        this.id = id;
    }

    public Leaves(String id, String name, Date startdate, Date enddate) {
        this.id = id;
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public People getPplid() {
        return pplid;
    }

    public void setPplid(People pplid) {
        this.pplid = pplid;
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
        if (!(object instanceof Leaves)) {
            return false;
        }
        Leaves other = (Leaves) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Leaves[ id=" + id + " ]";
    }
    
}
