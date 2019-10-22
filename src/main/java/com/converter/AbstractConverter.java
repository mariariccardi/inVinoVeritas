package com.converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<Entity,DTO> implements Converter<Entity,DTO> {
public List<Entity> toEntityList (Iterable<DTO> listDTO){
	List<Entity> list = new ArrayList<Entity>();
	if (listDTO != null) {
		for(DTO dto:listDTO) {
		Entity entity = toEntity(dto);
		list.add(entity);
	}
  }
return list;
}

public List<DTO> toDTOList (Iterable<Entity> entityList){
	List<DTO> list = new ArrayList<DTO>();
	if(entityList != null) {
		for(Entity entity:entityList) {
			DTO dto = toDto (entity);
			list.add(dto);
		}
	}
	return list;
    }
}
