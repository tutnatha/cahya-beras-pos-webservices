package com.course.springbootstarter.daftarhunian;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DaftarhunianHdrRepository extends CrudRepository<DaftarhunianHdr, String> {

    //Query penyelenggara
    @Query ("select d from DaftarhunianHdr d where d.penyelenggara = ?1")     //Simple as that
    public List<DaftarhunianHdr> findByPenyelenggara(String penyelenggara);

    //Query kodeKegiatan
    @Query ("select e from DaftarhunianHdr e where e.kodeKegiatan = ?1")
    public List<DaftarhunianHdr> findByKegiatan(String kodeKegiatan);

//20-Jan-19
    //Query nomor trx
    @Query ("select max(no) from DaftarhunianHdr e where e.userAppId = ?1") //hbQl ya! bukan Sql
    public long findMaxNoTrxByUserAppId(String userAppId);
//20-Jan-19
}
