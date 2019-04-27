/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.daftarhuniandtl;

/**
 *
 * @author myssd
 * @param <T>
 */
public class CustomizedFindAllImpl<T, ID>  implements CustomizedFindAll<T, ID>{

    /**
     *
     * @param itrbl
     * @return
     */
    @Override
    public Iterable<T> findAll(Iterable<ID> itrbl){
        return null;        
    }
}
