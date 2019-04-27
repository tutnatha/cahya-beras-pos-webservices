/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.daftarhuniandtl;

import java.io.Serializable;

/**
 *
 * @author myssd
 */
public interface CustomizedFindAll <T, ID> {
    Iterable<T> findAll(Iterable<ID> itrbl);
}
