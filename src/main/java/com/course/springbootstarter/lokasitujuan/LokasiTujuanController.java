package com.course.springbootstarter.lokasitujuan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class LokasiTujuanController {

    @Autowired
    private LokasiTujuanService lokasiTujuanService;

    @RequestMapping("/lokasitujuans")	//ok
    public List<LokasiTujuan> getAllLokasiTujuans() {
        return lokasiTujuanService.getAllLokasiTujuans();
    }

    @RequestMapping("/lokasitujuans/{no}")	//ok
    public LokasiTujuan getLokasiTujuan(@PathVariable String no) {
        return lokasiTujuanService.getLokasiTujuan(no);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lokasitujuans")
    public void addLokasiTujuan(@RequestBody LokasiTujuan lokasiTujuan) {
        lokasiTujuanService.addLokasiTujuan(lokasiTujuan);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateLokasiTujuan/{no}")
    public void updateLokasiTujuan(@RequestBody LokasiTujuan lokasiTujuan, @PathVariable String no) {
        lokasiTujuanService.updateLokasiTujuan(no, lokasiTujuan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteLokasiTujuan/{no}")
    public void deleteLokasiTujuan(@PathVariable String no) {
        lokasiTujuanService.deleteLokasiTujuan(no);
    }

}
