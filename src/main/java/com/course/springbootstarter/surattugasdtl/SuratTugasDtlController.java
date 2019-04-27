package com.course.springbootstarter.surattugasdtl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class SuratTugasDtlController {

    @Autowired
    private SuratTugasDtlService suratTugasDtlService;

    @RequestMapping("/surattugasdtls")	//ok
    public List<SuratTugasDtl> getAllSuratTugasDtls() {
        return suratTugasDtlService.getAllSuratTugasDtls();
    }

    @RequestMapping("/surattugasdtls/{no}")	//ok
    public SuratTugasDtl getSuratTugasDtl(@PathVariable String no) {
        return suratTugasDtlService.getSuratTugasDtl(no);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/surattugasdtls")
    public void addSuratTugasDtl(@RequestBody SuratTugasDtl suratTugasDtl) {
        suratTugasDtlService.addSuratTugasDtl(suratTugasDtl);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateSuratTugasDtl/{no}")
    public void updateSuratTugasDtl(@RequestBody SuratTugasDtl suratTugasDtl, @PathVariable String no) {
        suratTugasDtlService.updateSuratTugasDtl(no, suratTugasDtl);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteSuratTugasDtl/{no}")
    public void deleteSuratTugasDtl(@PathVariable String no) {
        suratTugasDtlService.deleteSuratTugasDtl(no);
    }

}
