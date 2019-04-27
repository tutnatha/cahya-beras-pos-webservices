package com.course.springbootstarter.penugasan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.course.springbootstarter.surattugas.SuratTugas;

@Repository
public interface SuratTugas2Repository extends JpaRepository<SuratTugas2, String>{

}
