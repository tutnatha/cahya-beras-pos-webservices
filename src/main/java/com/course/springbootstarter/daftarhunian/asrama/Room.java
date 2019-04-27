package com.course.springbootstarter.daftarhunian.asrama;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

//import lpmpJpaEclipseLink.NamedQuery;

@Entity
@Table(name = "kamar")
@NamedQuery(name="Room.findAll", query="SELECT k FROM Room k")
public class Room implements Serializable{
    @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="no")
  private String no;
  @Column(name="lantai")
  private int lantai;
  @Column(name="jml_tt")
  private int jmlTt;
  @Column(name="url_picture")
  private String urlPicture;
  
  @OneToMany(mappedBy="room")
  @JsonBackReference
//  private Set<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> daftarHunianAsramaDtls = new HashSet<DaftarHunianAsramaDtl>();
  private List<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> daftarHunianAsramaDtls = new ArrayList<DaftarHunianAsramaDtl>();
	
  	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public int getLantai() {
		return lantai;
	}
	
	public void setLantai(int lantai) {
		this.lantai = lantai;
	}
	
	public int getJmlTt() {
		return jmlTt;
	}
	
	public void setJmlTt(int jmlTt) {
		this.jmlTt = jmlTt;
	}
	
	public String getUrlPicture() {
		return urlPicture;
	}
	
	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}
	
//	public Set<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> getDaftarHunianAsramaDtls() {
	public List<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> getDaftarHunianAsramaDtls() {
		return daftarHunianAsramaDtls;
	}
	
	public void setDaftarHunianAsramaDtls(
//			Set<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> daftarHunianAsramaDtls) {
			List<com.course.springbootstarter.daftarhunian.asrama.DaftarHunianAsramaDtl> daftarHunianAsramaDtls) {
		this.daftarHunianAsramaDtls = daftarHunianAsramaDtls;
	}
  
	public Room(){
		
	}
}
