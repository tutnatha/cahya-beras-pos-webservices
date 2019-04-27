package com.course.springbootstarter.daftarhuniandtl;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface DaftarhunianDtlRepository extends CrudRepository<DaftarhunianDtl, String>, CustomizedFindAll {
public interface DaftarhunianDtlRepository extends CrudRepository<DaftarhunianDtl, DaftarhunianDtl.MyCompositePK>, CustomizedFindAll {
    public List<DaftarhunianDtl> findAll(String[] s);
//    public Object findAll(String[] s);

    public List<DaftarhunianDtl> findByNoTrx(String[] as);
    public List<DaftarhunianDtl> findByNoTrx(String no);
    
//contoh    
//    List<Customer> findByLastName(String lastName);
}
