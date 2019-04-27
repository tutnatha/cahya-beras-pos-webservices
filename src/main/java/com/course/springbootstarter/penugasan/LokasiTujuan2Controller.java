package com.course.springbootstarter.penugasan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class LokasiTujuan2Controller {
	@Autowired
    private LokasiTujuan2Service lokasiTujuan2Service;

    @RequestMapping("/lokasiTujuan2s")
    public List<LokasiTujuan2> getAllLokasiTujuan2s() {
        return lokasiTujuan2Service.getAllLokasiTujuan2s();
    }

}
