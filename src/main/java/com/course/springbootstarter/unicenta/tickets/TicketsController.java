/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.course.springbootstarter.unicenta.ws;
package com.course.springbootstarter.unicenta.tickets;

import com.course.springbootstarter.unicenta.tickets.SelectedTicketsColumn;
import com.course.springbootstarter.unicenta.tickets.Tickets;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class TicketsController {
    @Autowired
    private TicketsService ticketsService;
    
    @RequestMapping("/tickets")
//    public List<Tickets> getAllDaftarhunianHdrs() {
    public List<SelectedTicketsColumn> getAllTickets() {
        return ticketsService.getAllTickets();
//        return ticketsService.getAllQueriSelectedTicketsColumn();        
    }

    @RequestMapping("/tickets-aza")
//    public List<Tickets> getAllDaftarhunianHdrs() {
    public List<Tickets> getAllTicketsAza() {
        return ticketsService.getAllTicketsAza();
//        return ticketsService.getAllQueriSelectedTicketsColumn();        
    }

    @RequestMapping("/tickets-subselect")
    public List<TicketsSubselect> getAllTicketsSubselect() {
        return ticketsService.getAllTicketsSubselect();
//        return ticketsService.getAllQueriSelectedTicketsColumn();        
    }
}
