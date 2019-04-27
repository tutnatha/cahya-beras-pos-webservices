package com.concretepage.client;


import java.net.URI;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.course.springbootstarter.kamar.Kamar;

public class JavaRestClient {
    private HttpHeaders getHeaders() {
    	String credential="mukesh:m123";
    	//String credential="tarun:t123";
//    	String credential="user:concretepage";
    	String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
     	headers.add("Authorization", "Basic " + encodedCredential);
     	System.out.println("encodedCredential: " +encodedCredential);
    	return headers;
    }
    
    public void addKamarDemo() {
    	HttpHeaders headers = getHeaders();  //remark dulu..
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/user/kamar";
	    Kamar objKamar = new Kamar();
//	    objArticle.setTitle("Spring REST Security using Hibernate");
//	    objArticle.setCategory("Spring");
	    objKamar.setJmlTt(2);
	    objKamar.setLantai(2);
	    objKamar.setNo("264");	//244
	    objKamar.setUrlPicture("www.lpmp-prov-bali.com");
        HttpEntity<Kamar> requestEntity = new HttpEntity<Kamar>(objKamar, headers);	//remark dulu..
//	    HttpEntity<Kamar> requestEntity = new HttpEntity<Kamar>(objKamar);
        URI uri = restTemplate.postForLocation(url, requestEntity);
        System.out.println(uri.getPath());
    }

    public void getAllKamarsDemo() {	
    	HttpHeaders headers = getHeaders();  //remark dulu..
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/kamars";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);	//rem dulu..
        ResponseEntity<Kamar[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Kamar[].class);	//rem dulu..
        Kamar[] articles = responseEntity.getBody();
        for(Kamar article : articles) {
              System.out.println("Jml T. Tidur:"+article.getJmlTt()+", Lanta:"+article.getLantai()
                      +", No Kamar: "+article.getNo());
        }
    }    
    
    public JavaRestClient(){}
    
    public static void main(String args[]){
    	JavaRestClient jrs = new JavaRestClient();
    	jrs.addKamarDemo();	//masih error 401 null
//    	jrs.getAllKamarsDemo();	//menampilkan tabel kamar ok sukses muncul
    }
}
