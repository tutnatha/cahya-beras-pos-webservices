package com.course.springbootstarter.penugasan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.springbootstarter.penugasan.LokasiTujuan2;
import com.course.springbootstarter.penugasan.LokasiTujuan2Repository;

@Service
public class LokasiTujuan2Service {

	@Autowired
    private LokasiTujuan2Repository lokasiTujuan2Repository;

	public List<LokasiTujuan2> getAllLokasiTujuan2s() {
		List<LokasiTujuan2> lokasiTujuan2s = new ArrayList<>();
        lokasiTujuan2Repository.findAll().forEach(lokasiTujuan2s::add);
        return lokasiTujuan2s;		
	}

}
