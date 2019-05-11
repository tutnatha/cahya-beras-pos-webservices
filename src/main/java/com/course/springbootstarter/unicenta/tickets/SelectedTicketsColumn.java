/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
//@Table(name = "tickets")
@Table(name = "tmp_tickets")
@XmlRootElement
public class SelectedTicketsColumn implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id;
//    @Column(name = "tickettype")
    @Column(name = "ticket_type")
    private int ticketType;
//    @Column(name = "ticketid")
    @Column(name = "ticket_id")
    private int ticketId;
    @Column(name = "status")
    private int status;

    public SelectedTicketsColumn() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public int getTickettype() {
//        return tickettype;
//    }

    public int getTicketType() {
        return ticketType;
    }

//    public void setTickettype(int tickettype) {
//        this.tickettype = tickettype;
//    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

//    public int getTicketid() {
//        return ticketid;
//    }

    public int getTicketId() {
        return ticketId;
    }

//    public void setTicketid(int ticketid) {
//        this.ticketid = ticketid;
//    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
