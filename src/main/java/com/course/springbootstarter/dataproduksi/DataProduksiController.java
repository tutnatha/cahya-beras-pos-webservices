/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.dataproduksi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author tutnatha
 */
@RestController
@RequestMapping("user")
public class DataProduksiController {
    
    @Autowired
    private DataProduksiService dataProduksiService;
    
    @RequestMapping("/dataProduksi")
    public List<DataProduksi> getAllDataProduksis() {
        return dataProduksiService.getAllDataProduksis();
    }    
}
