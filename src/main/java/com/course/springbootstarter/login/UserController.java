package com.course.springbootstarter.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.course.springbootstarter.user.User;

//import com.course.springbootstarter.user.UserService;

@RestController
@RequestMapping("user")		//auth login user:mukesh/m123
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
/*
    @RequestMapping("/users/{no}")
    public Users getUser(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return userService.getUser(iNo);
    }
*/
    @RequestMapping("/users/{username}")
    public Users getUserByName(@PathVariable String username){
       return userService.getUser(username);
    }

    //versi 2 return : array
    @RequestMapping("/users2/{username}")
    public List<Users> getUserByName2(@PathVariable String username){
       return userService.getArrayUser(username);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{no}")
    public void updateTopic(@RequestBody Users user, @PathVariable String no) {
        int iNo = Integer.valueOf(no);
        userService.updateUser(iNo, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{no}")
    public void deleteUser(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        userService.deleteUser(iNo);
    }

}
