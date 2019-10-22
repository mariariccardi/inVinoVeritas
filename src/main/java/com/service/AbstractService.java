package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.converter.Converter;

public abstract class AbstractService<Entity,DTO> implements ServiceDTO<DTO>{

	@Autowired
	protected CrudRepository<Entity,Long> repository;
	@Autowired
	protected Converter <Entity, DTO> converter;
	
	@Override
	public DTO insert(DTO dto) {
		return converter.toDto(repository.save(converter.toEntity(dto)));
		}
	@Override
	public Iterable<DTO> getAll(){
		return converter.toDTOList(repository.findAll());
	}
	@Override 
	public DTO read(long id) {
		return converter.toDto(repository.findById(id).get());
		}
	@Override
	public DTO update(DTO dto) {
		return converter.toDto(repository.save(converter.toEntity(dto)));
		}
	@Override 
	public void delete (long id) {
		repository.deleteById(id);
		
	}
}
