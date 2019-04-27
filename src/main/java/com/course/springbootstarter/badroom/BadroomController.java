package com.course.springbootstarter.badroom;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class BadroomController {

    @Autowired
    private BadroomService badroomService;

    @RequestMapping("/badrooms")
    public List<Badroom> getAllBadrooms() {
        return badroomService.getAllBadrooms();
    }

    @RequestMapping("/badrooms/{no}")
    public Badroom getBadroom(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return badroomService.getBadroom(iNo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/badrooms")
    public void addBadroom(@RequestBody Badroom badroom) {
        badroomService.addBadroom(badroom);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/badrooms/{no}")
    public void updateTopic(@RequestBody Badroom badroom, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        badroomService.updateBadroom(iNo, badroom);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/badrooms/{no}")
    public void deleteBadroom(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        badroomService.deleteBadroom(iNo);
    }

}
