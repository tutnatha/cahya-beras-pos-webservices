package com.course.springbootstarter.daftarhunianbad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class DaftarhunianbadController {

    @Autowired
    private DaftarhunianbadService daftarhunianbadService;

    @RequestMapping("/daftarhunianbads")
    public List<Daftarhunianbad> getAllDaftarhunianbads() {
        return daftarhunianbadService.getAllDaftarhunianbads();
    }

    @RequestMapping("/daftarhunianbads/{no}")
    public Daftarhunianbad getDaftarhunianbad(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return daftarhunianbadService.getDaftarhunianbad(iNo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/daftarhunianbads")
    public void addDaftarhunianbad(@RequestBody Daftarhunianbad daftarhunianbad) {
        daftarhunianbadService.addDaftarhunianbad(daftarhunianbad);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/daftarhunianbads/{no}")
    public void updateTopic(@RequestBody Daftarhunianbad daftarhunianbad, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianbadService.updateDaftarhunianbad(iNo, daftarhunianbad);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/daftarhunianbads/{no}")
    public void deleteDaftarhunianbad(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        daftarhunianbadService.deleteDaftarhunianbad(iNo);
    }

}
