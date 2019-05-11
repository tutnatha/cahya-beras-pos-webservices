/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import javax.persistence.Entity;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;
/**
 *
 * @author tutnatha
 */
@Entity
@Immutable
@Subselect("SELECT id, tickettype, ticketid, person, customer, status FROM tickets")
public class TicketsSubselect implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "tickettype")
    private int tickettype;
    @Basic(optional = false)
    @Column(name = "ticketid")
    private int ticketid;
    @Basic(optional = false)
    @Column(name = "person")
    private String person;
    @Basic(optional = false)
    @Column(name = "customer")
    private String customer;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;

    public TicketsSubselect(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTickettype() {
        return tickettype;
    }

    public void setTickettype(int tickettype) {
        this.tickettype = tickettype;
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

//    public Customers getCustomer() {
    public String getCustomer() {
        return customer;
    }

//    public void setCustomer(Customers customer) {
    public void setCustomer(String customer) {
        this.customer = customer;
    }

//    public People getPerson() {
    public String getPerson() {
        return person;
    }

//    public void setPerson(People person) {
    public void setPerson(String person) {
        this.person = person;
    }
}
