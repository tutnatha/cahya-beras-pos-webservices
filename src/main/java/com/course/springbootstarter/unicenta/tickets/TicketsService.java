/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.course.springbootstarter.unicenta.ws;
package com.course.springbootstarter.unicenta.tickets;

import com.course.springbootstarter.unicenta.tickets.SelectedTicketsColumn;
import com.course.springbootstarter.unicenta.tickets.Tickets;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class TicketsService {
    @Autowired
    private TicketsRepository ticketsRepository;

    @PersistenceContext	
    private EntityManager entityManager;
    
//    public List<Tickets> getAllTickets() {
    public List<SelectedTicketsColumn> getAllTickets() {
//        List<Tickets> ticketsList = new ArrayList<>();
        List<SelectedTicketsColumn> ticketsList = new ArrayList<SelectedTicketsColumn>();
//        ticketsRepository.findAll().forEach(ticketsList::add);  //balik sini
        ticketsRepository.findAllPilihKolom().forEach(ticketsList::add);
        return ticketsList;
    }
    
    public List<Tickets> getAllTicketsAza() {
//        List<Tickets> ticketsList = new ArrayList<>();
        List<Tickets> ticketsList = new ArrayList<Tickets>();
//        ticketsRepository.findAll().forEach(ticketsList::add);  //balik sini
        ticketsRepository.findAllTickets().forEach(ticketsList::add);
        return ticketsList;
    }

    public List<SelectedTicketsColumn> getAllQueriSelectedTicketsColumn() {
        List<SelectedTicketsColumn> ticketsList = new ArrayList<>();
//        daftarhunianHdrRepository.findAll().forEach(daftarhunianHdrs::add);
        Query nativeQuery = entityManager.createNativeQuery("SELECT t.id, "+
            "t.tickettype, t.ticketid, t.status FROM SelectedTicketsColumn t");
//        return nativeQuery.getResultList();
        ticketsList = nativeQuery.getResultList();
//        daftarHunianAsramaRepository.findAll().forEach(daftarhunianHdrs::add);
        return ticketsList;
    }

    public List<TicketsSubselect> getAllTicketsSubselect() {
//        List<Tickets> ticketsList = new ArrayList<>();
        List<TicketsSubselect> ticketsList = new ArrayList<TicketsSubselect>();
//        ticketsRepository.findAll().forEach(ticketsList::add);  //balik sini
        ticketsRepository.findAllTicketsSubselect().forEach(ticketsList::add);
        return ticketsList;
    }
}
