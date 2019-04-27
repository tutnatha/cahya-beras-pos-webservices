package com.course.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.course.springbootstarter.entity.Kamar;
import com.course.springbootstarter.service.IKamarService;

//class tambahan
//import showcase.Message;
//import showcase.ResponseBody;

@Controller
@RequestMapping("user")
public class KamarController {
	@Autowired
	private IKamarService kamarService;
	@GetMapping("kamar/{id}")
	public ResponseEntity<Kamar> getKamarById(@PathVariable("id") String no) {
		Kamar kamar = kamarService.getKamar(no);
		return new ResponseEntity<Kamar>(kamar, HttpStatus.OK);
	}
	@GetMapping("kamars")
	public ResponseEntity<List<Kamar>> getAllKamars() {
		List<Kamar> list = kamarService.getAllKamars();
		return new ResponseEntity<List<Kamar>>(list, HttpStatus.OK);
	}
	
	@PostMapping("kamar")
	public ResponseEntity<Void> addKamar(@RequestBody Kamar kamar, UriComponentsBuilder builder) {
//Remark dulu ya..
        boolean flag = kamarService.addKamar(kamar);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
		System.out.println("Lihat Info Kamar: "+kamar.getNo());
//		kamarService.addKamar(kamar);  //insert sekali aja
		
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/kamar/{id}").buildAndExpand(kamar.getNo()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("kamar")
	public ResponseEntity<Kamar> updateKamar(@RequestBody Kamar kamar) {
		kamarService.updateKamar(kamar);
		return new ResponseEntity<Kamar>(kamar, HttpStatus.OK);
	}
	@DeleteMapping("kamar/{id}")
	public ResponseEntity<Void> deleteKamar(@PathVariable("id") String id) {
		kamarService.deleteKamar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);		
	}	
	
	//Contoh Authenticate user
//	@RequestMapping(value = "/getmessage", method = RequestMethod.GET, produces = "application/json")
//	public @ResponseBody Message getMessage() {
//		logger.info("Accessing protected resource");
//		return new Message(100, "Congratulations!", "You have accessed a Basic Auth protected resource.");
//	}
	
	@PutMapping("hapus-kamar")
	public ResponseEntity<Kamar> deleteKamar(@RequestBody Kamar kamar) {
		String no = kamar.getNo();
		
		kamarService.deleteKamar(no);
		return new ResponseEntity<Kamar>(kamar, HttpStatus.OK);
	}
} 