package com.course.springbootstarter.daftarhuniandtl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class DaftarhunianDtlController {

    @Autowired
    private DaftarhunianDtlService daftarhunianDtlService;

    //tanpa parameter
    @RequestMapping("/daftarhunianDtls")
    public List<DaftarhunianDtl> getAllDaftarhunianDtls() {
        return daftarhunianDtlService.getAllDaftarhunianDtls();
    }

    //dgn parameter: noTrx
    @RequestMapping("/daftarhunianDtls/{no}")
    public List<DaftarhunianDtl> getDaftarhunianDtl(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return daftarhunianDtlService.getDaftarhunianDtl(iNo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianDtls")
    public void addDaftarhunianDtl(@RequestBody DaftarhunianDtl daftarhunianDtl) {
        daftarhunianDtlService.addDaftarhunianDtl(daftarhunianDtl);
    }

    //Buat insert method baru yg dapat memberi informasi balik - return value
    //konsentrasi setengah2 - tlg di cek lagi nanti nya
    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianDtls2")
    public ResponseEntity<?> addDaftarhunianDtl2(@RequestBody DaftarhunianDtl daftarhunianDtl) {
        DaftarhunianDtl ret = daftarhunianDtlService.addDaftarhunianDtl2(daftarhunianDtl);
        if (ret.getId().getNoKamar() != null){
            return new ResponseEntity<>(ret, HttpStatus.OK);}
        else{
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/daftarhunianDtls/{no}")
    public void updateTopic(@RequestBody DaftarhunianDtl daftarhunianDtl, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianDtlService.updateDaftarhunianDtl(iNo, daftarhunianDtl);
    }

    //test PUT
    @RequestMapping(value = "/daftarhunianDtls", method = RequestMethod.PUT)
    public ResponseEntity<?> putDaftarhunianDtls(@RequestBody DaftarhunianDtl body){
//        FooBarId id = new FooBarId();
//        id.setEmail(body.getEmail());
//        id.setName(body.getName());
        
        DaftarhunianDtl.MyCompositePK myPK = new DaftarhunianDtl.MyCompositePK();
        myPK.setNoTrx(body.getId().getNoTrx());
        myPK.setNoKamar(body.getId().getNoKamar());

//        FooBar fooBar = new FooBar();
//        fooBar.setId(id);
//        fooBar.setAddress(body.getAddress());
//        fooBar.setColor(body.getColor());
//        repo.save(fooBar);

        DaftarhunianDtl dhDtl = new DaftarhunianDtl(); 
        dhDtl.setId(myPK);
        dhDtl.setSeqNo(body.getSeqNo());
//        daftarhunianDtlService.updateDaftarhunianDtl(myPK, dhDtl); //harus by Primary Key
        dhDtl.setNip(body.getNip());
        dhDtl.setNama(body.getNama());

        return new ResponseEntity<>(HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianDtls/{no}")
//    public void deleteDaftarhunianDtl(@PathVariable String no) {
//        int iNo = Integer.valueOf(no);
//        daftarhunianDtlService.deleteDaftarhunianDtl(iNo);
//    }

    /**
     * Method menghapus transaksi detail
     * @param noTrxnoKamar
     */
//    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianDtls/{no_trx_no_kamar}")
    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianDtls/{no_trx}/{no_kamar}")
//    public void deleteDaftarhunianDtl(@PathVariable String no_trx_no_kamar){
    public void deleteDaftarhunianDtl(@PathVariable String no_trx, @PathVariable String no_kamar) {
        Pattern word = Pattern.compile("|");
//        Matcher match = word.matcher(no_trx_no_kamar);    //remark dulu
        int start =0;
        int end =0;
        
        //Start remark
//        while (match.find()) {    //jgn diloop
//        if(match.find()){
//             System.out.println("Found love at index "+ match.start() +" - "+ (match.end()-1));
//             start = match.start(); //3
//             end = (match.end());   //3
//        }
//        
//        String noTrx = no_trx_no_kamar.substring(0,start-1); //"114";
//        int iNo = Integer.valueOf(noTrx);
//        String noKamar = no_trx_no_kamar.substring(end+1); //"244";
        
        String noTrx = no_trx;
        int iNo = Integer.valueOf(noTrx);
        String noKamar = no_kamar;
        
        DaftarhunianDtl.MyCompositePK myPK = new DaftarhunianDtl.MyCompositePK();
        myPK.setNoKamar(noKamar);
        myPK.setNoTrx(iNo);
        
        daftarhunianDtlService.deleteDaftarhunianDtl(myPK);
    } 
        
    /*
    
String text = "I love you so much";
String wordToFind = "love";
Pattern word = Pattern.compile(wordToFind);
Matcher match = word.matcher(text);

while (match.find()) {
     System.out.println("Found love at index "+ match.start() +" - "+ (match.end()-1));
}    
    
public class SubStringExample{
   public static void main(String args[]) {
       String str= new String("quick brown fox jumps over the lazy dog");
       System.out.println("Substring starting from index 15:");
       System.out.println(str.substring(15));
       System.out.println("Substring starting from index 15 and ending at 20:");
       System.out.println(str.substring(15, 20));
   }
}
    
    @Autowired
    private FooBarRepository repo;

    // test FooBar
    @RequestMapping(value = "/foo", method = RequestMethod.POST)
    public ResponseEntity<?> postFoo(@RequestBody FooBarDTO body){
        FooBarId id = new FooBarId();
        id.setEmail(body.getEmail());
        id.setName(body.getName());

        FooBar fooBar = new FooBar();
        fooBar.setId(id);
        fooBar.setAddress(body.getAddress());
        fooBar.setColor(body.getColor());
        repo.save(fooBar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //test PUT
    @RequestMapping(value = "/foo", method = RequestMethod.PUT)
    public ResponseEntity<?> putFoo(@RequestBody FooBarDTO body){
        FooBarId id = new FooBarId();
        id.setEmail(body.getEmail());
        id.setName(body.getName());

        FooBar fooBar = new FooBar();
        fooBar.setId(id);
        fooBar.setAddress(body.getAddress());
        fooBar.setColor(body.getColor());
        repo.save(fooBar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //test Delete FooBar
    @RequestMapping(value = "/foo", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteFoo(@RequestBody FooBarIdDTO body){
        FooBarId id = new FooBarId();
        id.setEmail(body.getEmail());
        id.setName(body.getName());
        repo.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // test FooBar
        @RequestMapping(value = "/getFoo", method = RequestMethod.POST)
        public ResponseEntity<?> getFoo(@RequestBody FooBarIdDTO body){
            FooBarId id = new FooBarId();
            id.setEmail(body.getEmail());
            id.setName(body.getName());
            FooBar result = repo.findOne(id);
            return ResponseEntity.ok(result);
        }
     */
}
