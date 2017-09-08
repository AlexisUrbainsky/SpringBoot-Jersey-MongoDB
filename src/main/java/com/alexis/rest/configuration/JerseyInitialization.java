package com.alexis.rest.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import com.alexis.rest.resources.AppResource;
import com.alexis.rest.resources.PersonResource;
import com.alexis.rest.resources.TravelResource;


public class JerseyInitialization extends ResourceConfig {

	public JerseyInitialization() {
		this.register(RequestContextFilter.class);
		this.register(PersonResource.class);
		this.register(TravelResource.class);
		this.register(AppResource.class);
		this.property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
		this.property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
    }

}
