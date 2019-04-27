package com.course.springbootstarter.pegawai;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class PegawaiController {

    @Autowired
    private PegawaiService pegawaiService;

    @RequestMapping("/pegawais")
    public List<Pegawai> getAllPegawais() {
        return pegawaiService.getAllPegawais();
    }

    @RequestMapping("/pegawais/{nip}")
    public Pegawai getPegawai(@PathVariable String nip) {
        return pegawaiService.getPegawai(nip);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pegawais")
    public void addPegawai(@RequestBody Pegawai pegawai) {
        pegawaiService.addPegawai(pegawai);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/pegawais/{nip}")
    public void updateTopic(@RequestBody Pegawai pegawai, @PathVariable String nip) {
        pegawaiService.updatePegawai(nip, pegawai);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/pegawais/{nip}")
    public void deletePegawai(@PathVariable String nip) {
        pegawaiService.deletePegawai(nip);
    }

}
