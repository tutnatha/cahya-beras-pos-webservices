package com.course.springbootstarter.kegiatan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class KegiatanController {

    @Autowired
    private KegiatanService kegiatanService;

    @RequestMapping("/kegiatans")
    public List<Kegiatan> getAllKegiatans() {
        return kegiatanService.getAllKegiatans();
    }

    @RequestMapping("/kegiatans/{kode}")
    public Kegiatan getKegiatan(@PathVariable String kode) {
        return kegiatanService.getKegiatan(kode);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/kegiatans")
    public void addKegiatan(@RequestBody Kegiatan kegiatan) {
        kegiatanService.addKegiatan(kegiatan);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/kegiatans/{kode}")
    public void updateTopic(@RequestBody Kegiatan kegiatan, @PathVariable String kode) {
        kegiatanService.updateKegiatan(kode, kegiatan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/kegiatans/{kode}")
    public void deleteKegiatan(@PathVariable String kode) {
        kegiatanService.deleteKegiatan(kode);
    }

}
