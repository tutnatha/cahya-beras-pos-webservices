package com.course.springbootstarter.daftarhunian.asrama;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomsUsedService {
	@Autowired
	RoomsUsedRepository roomsUsedRepository; 

    public List<Room> getAllRoomsUsed() {
        List<Room> roomsUsed = new ArrayList<>();
        roomsUsedRepository.findAll().forEach(roomsUsed::add);
        return roomsUsed;
    }
}
