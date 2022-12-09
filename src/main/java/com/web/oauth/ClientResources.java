package com.web.oauth;

import org.springframework.boot.autoconfigure.security.oauth2.resource.
        ResourceServerProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.security.oauth2.client.token.grant.code.
        AuthorizationCodeResourceDetails;


public interface ClientResources {

    @NestedConfigurationProperty
    private AuthorizationCodeResourceDetails client =
            new AuthorizationCodeResourceDetails();

    @NestedConfigurationProperty
    private ResourceServerProperty
    private ResourceServerPorperties resource = new ResourceServerProperties();

    public AuthorizationCodeResourceDetails getClient() {
        return resource;
    }
}
