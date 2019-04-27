/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.dataproduksi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
/**
 *
 * @author tutnatha
 */
public interface DataProduksiRepository extends CrudRepository<DataProduksi, String>{
    
    @Query ("select d from DataProduksi d ")
    public List<DataProduksi> findAll();
}
