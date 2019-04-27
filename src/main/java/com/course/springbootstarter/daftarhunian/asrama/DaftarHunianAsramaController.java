package com.course.springbootstarter.daftarhunian.asrama;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


//import com.gigy.model.Party;
//import com.gigy.repository.PartyRepository;

@RestController
@RequestMapping("user")
public class DaftarHunianAsramaController {
	@Autowired
    private DaftarHunianAsramaService dhaService;

	@Autowired
	private RoomsUsedService ruService;	//coba ini dulu

//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<Collection<Party>> getParties() {
//		return new ResponseEntity<>(partyRepo.findAll(), HttpStatus.OK);
//	}

	
    @RequestMapping("/getAllQueriDfrtHunianHdrDtls")
    public List<QueriDfrtHunianHdrDtl> getAllQueriDfrtHunianHdrDtls() {
        return dhaService.getAllQueriDfrtHunianHdrDtls();
    }
    
    @RequestMapping("/gsonAllQueriDfrtHunianHdrDtls")
    public String gsonQueryDftrHunianHdrDtls() {
        return dhaService.gsonQueryDftrHunianHdrDtls();
    }
    
    @RequestMapping("/getAllDaftarHunianAsramas")
    public List<DaftarHunianAsrama> getAllDaftarhunianAsramas(){
    	return dhaService.getAllDaftarhunianAsramas();
    }
    
    @RequestMapping("/getAllRoomsUsed")
    public List<Room> getAllRoomsUsed(){
    	return ruService.getAllRoomsUsed();
    }
	
    //buatkan web service method retrieve per noTrx
    @RequestMapping("/daftarHunianAsrama/{no}")
    public DaftarHunianAsrama getDaftarHunianAsrama(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        return dhaService.getDaftarHunianAsrama(iNo);
    }
    
    //buatkan web service method retrieve per noTrx
    @RequestMapping("/daftarHunianAsrama2/{no}")
    public List<DaftarHunianAsrama> getDaftarHunianAsrama2(@PathVariable String no) {
        int iNo = Integer.valueOf(no);
        DaftarHunianAsrama dha = dhaService.getDaftarHunianAsrama(iNo);
        List<DaftarHunianAsrama> listDha = new ArrayList<DaftarHunianAsrama>(); 
        listDha.add(dha);
        return listDha;
    }
}
