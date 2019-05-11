/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.course.springbootstarter.unicenta.ws;
package com.course.springbootstarter.unicenta.tickets;

import com.course.springbootstarter.daftarhunian.DaftarhunianHdr;
import com.course.springbootstarter.unicenta.tickets.SelectedTicketsColumn;
import com.course.springbootstarter.unicenta.tickets.Tickets;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tutnatha
 */
public interface TicketsRepository extends CrudRepository<Tickets, String>{
//    @Query ("SELECT t.id, t.tickettype, t.ticketid, t.status FROM Tickets t")

//    @Query ("SELECT t.id as id, t.ticketType as ticketType, " + 
//            "t.ticketId as ticketId, t.status as status FROM SelectedTicketsColumn t")
    @Query ("SELECT t FROM SelectedTicketsColumn t")
    public List<SelectedTicketsColumn> findAllPilihKolom();
    
    @Query ("SELECT t FROM Tickets t")
    public List<Tickets> findAllTickets();

    @Query ("SELECT t FROM TicketsSubselect t")
    public List<TicketsSubselect> findAllTicketsSubselect();
}
