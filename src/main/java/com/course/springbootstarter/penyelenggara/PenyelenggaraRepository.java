/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.penyelenggara;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author myssd
 */
//public interface PenyelenggaraRepository extends CrudRepository<Penyelenggara, String>{
public interface PenyelenggaraRepository extends JpaRepository<Penyelenggara, String>{    
}
