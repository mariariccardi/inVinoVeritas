package com.converter;

import java.util.List;

public interface Converter<Entity,DTO> {
	public Entity toEntity(DTO dto);
	public DTO toDto(Entity entity);
	public List<DTO> toDTOList(Iterable<Entity> entityList);
	public List<Entity> toEntityList(Iterable<DTO> dtoList);

}
