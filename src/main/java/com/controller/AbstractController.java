package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.ServiceDTO;

public abstract class AbstractController<DTO> {
	@Autowired
	private ServiceDTO<DTO> service;
	
	@GetMapping("/getall")
	public Iterable<DTO>getAll(){
		return service.getAll();
	}
@DeleteMapping("/delete")
public void delete (@RequestParam("id")long id) {
service.delete(id);
}
@PutMapping("/update")
public DTO update (@RequestBody DTO dto) {
	service.insert(dto);
	return dto;
}

@PostMapping("/insert")
public DTO insert (@RequestBody DTO dto) {
	service.insert(dto);
	return dto;
}
@GetMapping("/read")
public DTO read(long id) {
	return service.read(id);
	}
}