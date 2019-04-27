/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.transformasi_satuan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tutnatha
 */
@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class TransformasiSatuanController {
    @Autowired
    private TransformasiSatuanService tsService;

    @RequestMapping("/transformasiSatuan")
    public List<TransformasiSatuan> getAllTransformasiSatuans() {
        return tsService.getAllTransformasiSatuans();
    }
    
}
