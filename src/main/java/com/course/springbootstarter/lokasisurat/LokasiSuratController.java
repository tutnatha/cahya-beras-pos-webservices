package com.course.springbootstarter.lokasisurat;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class LokasiSuratController {

    @Autowired
    private LokasiSuratService lokasiSuratService;

    @RequestMapping("/lokasisurats")	//ok
    public List<LokasiSurat> getAllLokasiSurats() {
        return lokasiSuratService.getAllLokasiSurats();
    }

    @RequestMapping("/lokasisurats/{no}")	//ok
    public LokasiSurat getLokasiSurat(@PathVariable String no) {
        return lokasiSuratService.getLokasiSurat(no);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lokasisurats")
    public void addLokasiSurat(@RequestBody LokasiSurat lokasiSurat) {
        lokasiSuratService.addLokasiSurat(lokasiSurat);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateLokasiSurat/{no}")
    public void updateLokasiSurat(@RequestBody LokasiSurat lokasiSurat, @PathVariable String no) {
        lokasiSuratService.updateLokasiSurat(no, lokasiSurat);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteLokasiSurat/{no}")
    public void deleteLokasiSurat(@PathVariable String no) {
        lokasiSuratService.deleteLokasiSurat(no);
    }

}
