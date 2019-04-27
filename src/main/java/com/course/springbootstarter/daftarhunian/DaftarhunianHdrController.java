package com.course.springbootstarter.daftarhunian;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class DaftarhunianHdrController {

    @Autowired
    private DaftarhunianHdrService daftarhunianHdrService;

    @RequestMapping("/daftarhunianHdrs")
    public List<DaftarhunianHdr> getAllDaftarhunianHdrs() {
        return daftarhunianHdrService.getAllDaftarhunianHdrs();
    }

    @RequestMapping("/daftarhunianHdrs/{no}")
    public DaftarhunianHdr getDaftarhunianHdr(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return daftarhunianHdrService.getDaftarhunianHdr(iNo);
    }

    //by Kegiatan
    @RequestMapping("/daftarhunianHdrs2/{no}")
    public List<DaftarhunianHdr> getDaftarhunianHdr2(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
//        return daftarhunianHdrService.getDaftarhunianHdr2(iNo);  //remark
        return daftarhunianHdrService.getDaftarhunianHdr2(no);    //open
    }

    //by Penyelenggara
    @RequestMapping("/daftarhunianHdrs3/{no}")
    public List<DaftarhunianHdr> getDaftarhunianHdr3(@PathVariable String no) {
//        int iNo = Integer.valueOf(no);
        return daftarhunianHdrService.getDaftarhunianHdr3(no);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianHdrs")
    public void addDaftarhunianHdr(@RequestBody DaftarhunianHdr daftarhunianHdr) {
        daftarhunianHdrService.addDaftarhunianHdr(daftarhunianHdr);
    }

    //Contoh 1:
    //diambil dari :https://stackoverflow.com/questions/24292373/spring-boot-rest-controller-how-to-return-different-http-status-codes
    /*
    @RequestMapping(value="/rawdata/", method = RequestMethod.PUT)

    public ResponseEntity<?> create(@RequestBody String data) {

    if(everything_fine)
        return new ResponseEntity<>(RestModel, HttpStatus.OK);
    else
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

    }
    */    
    
    //daftarhunianHdrs2
    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianHdrs2")
    public ResponseEntity<?> addDaftarhunianHdr2(@RequestBody DaftarhunianHdr daftarhunianHdr) {
        DaftarhunianHdr ret = daftarhunianHdrService.addDaftarhunianHdr2(daftarhunianHdr);
        if (ret.getNo() != null){
            return new ResponseEntity<>(ret, HttpStatus.OK);}
        else{
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/daftarhunianHdrs/{no}")
    public void updateTopic(@RequestBody DaftarhunianHdr daftarhunianHdr, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianHdrService.updateDaftarhunianHdr(iNo, daftarhunianHdr);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianHdrs/{no}")
    public void deleteDaftarhunianHdr(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianHdrService.deleteDaftarhunianHdr(iNo);
    }

//20-Jan-19
    @RequestMapping(method = RequestMethod.GET, value = "/findMaxNoTrxByUserAppId/{user}")
    public long findMaxNoTrxByUserAppId(@PathVariable String user) {
//        int iNo = Integer.valueOf(no);
        return daftarhunianHdrService.findMaxNoTrxByUserAppId(user);
    }
//20-Jan-19
}
