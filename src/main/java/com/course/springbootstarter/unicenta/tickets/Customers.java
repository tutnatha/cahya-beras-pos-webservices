/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "customers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findById", query = "SELECT c FROM Customers c WHERE c.id = :id"),
    @NamedQuery(name = "Customers.findBySearchkey", query = "SELECT c FROM Customers c WHERE c.searchkey = :searchkey"),
    @NamedQuery(name = "Customers.findByTaxid", query = "SELECT c FROM Customers c WHERE c.taxid = :taxid"),
    @NamedQuery(name = "Customers.findByName", query = "SELECT c FROM Customers c WHERE c.name = :name"),
    @NamedQuery(name = "Customers.findByCard", query = "SELECT c FROM Customers c WHERE c.card = :card"),
    @NamedQuery(name = "Customers.findByMaxdebt", query = "SELECT c FROM Customers c WHERE c.maxdebt = :maxdebt"),
    @NamedQuery(name = "Customers.findByAddress", query = "SELECT c FROM Customers c WHERE c.address = :address"),
    @NamedQuery(name = "Customers.findByAddress2", query = "SELECT c FROM Customers c WHERE c.address2 = :address2"),
    @NamedQuery(name = "Customers.findByPostal", query = "SELECT c FROM Customers c WHERE c.postal = :postal"),
    @NamedQuery(name = "Customers.findByCity", query = "SELECT c FROM Customers c WHERE c.city = :city"),
    @NamedQuery(name = "Customers.findByRegion", query = "SELECT c FROM Customers c WHERE c.region = :region"),
    @NamedQuery(name = "Customers.findByCountry", query = "SELECT c FROM Customers c WHERE c.country = :country"),
    @NamedQuery(name = "Customers.findByFirstname", query = "SELECT c FROM Customers c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "Customers.findByLastname", query = "SELECT c FROM Customers c WHERE c.lastname = :lastname"),
    @NamedQuery(name = "Customers.findByEmail", query = "SELECT c FROM Customers c WHERE c.email = :email"),
    @NamedQuery(name = "Customers.findByPhone", query = "SELECT c FROM Customers c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customers.findByPhone2", query = "SELECT c FROM Customers c WHERE c.phone2 = :phone2"),
    @NamedQuery(name = "Customers.findByFax", query = "SELECT c FROM Customers c WHERE c.fax = :fax"),
    @NamedQuery(name = "Customers.findByNotes", query = "SELECT c FROM Customers c WHERE c.notes = :notes"),
    @NamedQuery(name = "Customers.findByVisible", query = "SELECT c FROM Customers c WHERE c.visible = :visible"),
    @NamedQuery(name = "Customers.findByCurdate", query = "SELECT c FROM Customers c WHERE c.curdate = :curdate"),
    @NamedQuery(name = "Customers.findByCurdebt", query = "SELECT c FROM Customers c WHERE c.curdebt = :curdebt"),
    @NamedQuery(name = "Customers.findByIsvip", query = "SELECT c FROM Customers c WHERE c.isvip = :isvip"),
    @NamedQuery(name = "Customers.findByDiscount", query = "SELECT c FROM Customers c WHERE c.discount = :discount"),
    @NamedQuery(name = "Customers.findByMemodate", query = "SELECT c FROM Customers c WHERE c.memodate = :memodate")})

public class Customers implements Serializable{
        @Lob
    @Column(name = "image")
    private byte[] image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<ReservationCustomers> reservationCustomersList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "searchkey")
    private String searchkey;
    @Column(name = "taxid")
    private String taxid;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "card")
    private String card;
    @Basic(optional = false)
    @Column(name = "maxdebt")
    private double maxdebt;
    @Column(name = "address")
    private String address;
    @Column(name = "address2")
    private String address2;
    @Column(name = "postal")
    private String postal;
    @Column(name = "city")
    private String city;
    @Column(name = "region")
    private String region;
    @Column(name = "country")
    private String country;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "fax")
    private String fax;
    @Column(name = "notes")
    private String notes;
    @Basic(optional = false)
    @Column(name = "visible")
    private boolean visible;
    @Column(name = "curdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date curdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "curdebt")
    private Double curdebt;
    @Basic(optional = false)
    @Column(name = "isvip")
    private boolean isvip;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "memodate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date memodate;
    @OneToMany(mappedBy = "customer")
    private List<Tickets> ticketsList;
    @JoinColumn(name = "taxcategory", referencedColumnName = "id")
    @ManyToOne
    private Taxcustcategories taxcategory;

    public Customers() {
    }

    public Customers(String id) {
        this.id = id;
    }

    public Customers(String id, String searchkey, String name, double maxdebt, boolean visible, boolean isvip) {
        this.id = id;
        this.searchkey = searchkey;
        this.name = name;
        this.maxdebt = maxdebt;
        this.visible = visible;
        this.isvip = isvip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getMaxdebt() {
        return maxdebt;
    }

    public void setMaxdebt(double maxdebt) {
        this.maxdebt = maxdebt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Date getCurdate() {
        return curdate;
    }

    public void setCurdate(Date curdate) {
        this.curdate = curdate;
    }

    public Double getCurdebt() {
        return curdebt;
    }

    public void setCurdebt(Double curdebt) {
        this.curdebt = curdebt;
    }


    public boolean getIsvip() {
        return isvip;
    }

    public void setIsvip(boolean isvip) {
        this.isvip = isvip;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getMemodate() {
        return memodate;
    }

    public void setMemodate(Date memodate) {
        this.memodate = memodate;
    }

    @XmlTransient
    public List<Tickets> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public Taxcustcategories getTaxcategory() {
        return taxcategory;
    }

    public void setTaxcategory(Taxcustcategories taxcategory) {
        this.taxcategory = taxcategory;
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
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Customers[ id=" + id + " ]";
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @XmlTransient
    public List<ReservationCustomers> getReservationCustomersList() {
        return reservationCustomersList;
    }

    public void setReservationCustomersList(List<ReservationCustomers> reservationCustomersList) {
        this.reservationCustomersList = reservationCustomersList;
    }

}
