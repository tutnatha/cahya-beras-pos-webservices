/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.transformasi_satuan;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tutnatha
 */
@Service
public class TransformasiSatuanService {
    @Autowired
    private TransformasiSatuanRepository tsRepository;
    
    public List<TransformasiSatuan> getAllTransformasiSatuans() {
        List<TransformasiSatuan> tsList = new ArrayList<>();
        tsRepository.findAll().forEach(tsList::add);
        return tsList;
    }
}
