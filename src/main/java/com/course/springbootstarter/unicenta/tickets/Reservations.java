/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "reservations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservations.findAll", query = "SELECT r FROM Reservations r"),
    @NamedQuery(name = "Reservations.findById", query = "SELECT r FROM Reservations r WHERE r.id = :id"),
    @NamedQuery(name = "Reservations.findByCreated", query = "SELECT r FROM Reservations r WHERE r.created = :created"),
    @NamedQuery(name = "Reservations.findByDatenew", query = "SELECT r FROM Reservations r WHERE r.datenew = :datenew"),
    @NamedQuery(name = "Reservations.findByTitle", query = "SELECT r FROM Reservations r WHERE r.title = :title"),
    @NamedQuery(name = "Reservations.findByChairs", query = "SELECT r FROM Reservations r WHERE r.chairs = :chairs"),
    @NamedQuery(name = "Reservations.findByIsdone", query = "SELECT r FROM Reservations r WHERE r.isdone = :isdone"),
    @NamedQuery(name = "Reservations.findByDescription", query = "SELECT r FROM Reservations r WHERE r.description = :description")})
public class Reservations implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "datenew")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datenew;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "chairs")
    private int chairs;
    @Basic(optional = false)
    @Column(name = "isdone")
    private boolean isdone;
    @Column(name = "description")
    private String description;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "reservations")
    private ReservationCustomers reservationCustomers;

    public Reservations() {
    }

    public Reservations(String id) {
        this.id = id;
    }

    public Reservations(String id, Date created, Date datenew, String title, int chairs, boolean isdone) {
        this.id = id;
        this.created = created;
        this.datenew = datenew;
        this.title = title;
        this.chairs = chairs;
        this.isdone = isdone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDatenew() {
        return datenew;
    }

    public void setDatenew(Date datenew) {
        this.datenew = datenew;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public boolean getIsdone() {
        return isdone;
    }

    public void setIsdone(boolean isdone) {
        this.isdone = isdone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReservationCustomers getReservationCustomers() {
        return reservationCustomers;
    }

    public void setReservationCustomers(ReservationCustomers reservationCustomers) {
        this.reservationCustomers = reservationCustomers;
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
        if (!(object instanceof Reservations)) {
            return false;
        }
        Reservations other = (Reservations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Reservations[ id=" + id + " ]";
    }
}
