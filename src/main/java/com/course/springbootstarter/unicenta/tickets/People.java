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
@Table(name = "people")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "People.findAll", query = "SELECT p FROM People p"),
    @NamedQuery(name = "People.findById", query = "SELECT p FROM People p WHERE p.id = :id"),
    @NamedQuery(name = "People.findByName", query = "SELECT p FROM People p WHERE p.name = :name"),
    @NamedQuery(name = "People.findByApppassword", query = "SELECT p FROM People p WHERE p.apppassword = :apppassword"),
    @NamedQuery(name = "People.findByCard", query = "SELECT p FROM People p WHERE p.card = :card"),
    @NamedQuery(name = "People.findByVisible", query = "SELECT p FROM People p WHERE p.visible = :visible")})
public class People implements Serializable {

    @Lob
    @Column(name = "image")
    private byte[] image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pplid")
    private List<Leaves> leavesList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "apppassword")
    private String apppassword;
    @Column(name = "card")
    private String card;
    @Basic(optional = false)
    @Column(name = "visible")
    private boolean visible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Tickets> ticketsList;
    @JoinColumn(name = "role", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Roles role;

    public People() {
    }

    public People(String id) {
        this.id = id;
    }

    public People(String id, String name, boolean visible) {
        this.id = id;
        this.name = name;
        this.visible = visible;
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

    public String getApppassword() {
        return apppassword;
    }

    public void setApppassword(String apppassword) {
        this.apppassword = apppassword;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    @XmlTransient
    public List<Tickets> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
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
        if (!(object instanceof People)) {
            return false;
        }
        People other = (People) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.People[ id=" + id + " ]";
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @XmlTransient
    public List<Leaves> getLeavesList() {
        return leavesList;
    }

    public void setLeavesList(List<Leaves> leavesList) {
        this.leavesList = leavesList;
    }
    
}
