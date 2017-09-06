package com.alexis.rest.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperFactory {
	 
    private static ObjectMapper mapper;
    static {
    	mapper = new ObjectMapper();
    }
 
    public static ObjectMapper getContext() {
      return mapper;
    }
    
}
