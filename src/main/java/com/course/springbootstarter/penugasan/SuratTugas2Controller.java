package com.course.springbootstarter.penugasan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.course.springbootstarter.surattugas.SuratTugas;
//import com.course.springbootstarter.surattugas.SuratTugasService;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class SuratTugas2Controller {
    @Autowired
    private SuratTugas2Service suratTugas2Service;

    @RequestMapping("/surattugas2s")	//ok
    public List<SuratTugas2> getAllSuratTugas2s() {
        return suratTugas2Service.getAllSuratTugas2s();
    }

}
