package com.course.springbootstarter.penugasan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuratTugas2Service {
	@Autowired
    private SuratTugas2Repository suratTugas2Repository;

	public List<SuratTugas2> getAllSuratTugas2s() {
		List<SuratTugas2> suratTugas2s = new ArrayList<>();
		suratTugas2Repository.findAll().forEach(suratTugas2s::add);
        return suratTugas2s;		
	}

}
