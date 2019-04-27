package com.course.springbootstarter.penugasan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.course.springbootstarter.daftarhunian.DaftarhunianHdr;
//import com.course.springbootstarter.daftarhunian.DaftarhunianHdrService;

@RestController
@RequestMapping("user")	
public class LokasiSuratController2 {
	@Autowired
    private LokasiSuratService2 lokasiSuratService;

    @RequestMapping("/lokasiSurats")
    public List<LokasiSurat2> getAllLokasiSurats() {
        return lokasiSuratService.getAllLokasiSurats();
    }

}
