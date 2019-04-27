/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.dataproduksi;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author tutnatha
 */
@Service
public class DataProduksiService {
    @Autowired
    private DataProduksiRepository dataProduksiRepository;
    
    public List<DataProduksi> getAllDataProduksis() {
        List<DataProduksi> dataProduksis = new ArrayList<>();
        dataProduksiRepository.findAll().forEach(dataProduksis::add);
        return dataProduksis;
    }
}
