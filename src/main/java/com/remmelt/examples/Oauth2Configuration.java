package com.remmelt.examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import io.dropwizard.Configuration;
import lombok.Getter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

@Getter
public class Oauth2Configuration extends Configuration {
	public ImmutableList<String> getAllowedGrantTypes() {
		return allowedGrantTypes;
	}

	public void setAllowedGrantTypes(ImmutableList<String> allowedGrantTypes) {
		this.allowedGrantTypes = allowedGrantTypes;
	}

	public String getBearerRealm() {
		return bearerRealm;
	}

	public void setBearerRealm(String bearerRealm) {
		this.bearerRealm = bearerRealm;
	}

	@Valid
	@JsonProperty
	private ImmutableList<String> allowedGrantTypes;

	@Valid
	@JsonProperty
	@NotEmpty
	private String bearerRealm;
}
