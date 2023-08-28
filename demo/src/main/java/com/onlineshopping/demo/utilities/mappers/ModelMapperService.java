package com.onlineshopping.demo.utilities.mappers;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;

public interface ModelMapperService {

	ModelMapper forRequest();
	ModelMapper forResponse();
}
