package com.course.springbootstarter.surattugas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class SuratTugasController {

    @Autowired
    private SuratTugasService suratTugasService;

    @RequestMapping("/surattugass")	//ok
    public List<SuratTugas> getAllSuratTugass() {
        return suratTugasService.getAllSuratTugass();
    }

    @RequestMapping("/surattugass/{no}")	//ok
    public SuratTugas getSuratTugas(@PathVariable String no) {
        return suratTugasService.getSuratTugas(no);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/surattugass")
    public void addSuratTugas(@RequestBody SuratTugas suratTugas) {
        suratTugasService.addSuratTugas(suratTugas);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateSuratTugas/{no}")
    public void updateSuratTugas(@RequestBody SuratTugas suratTugas, @PathVariable String no) {
        suratTugasService.updateSuratTugas(no, suratTugas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteSuratTugas/{no}")
    public void deleteSuratTugas(@PathVariable String no) {
        suratTugasService.deleteSuratTugas(no);
    }

}
