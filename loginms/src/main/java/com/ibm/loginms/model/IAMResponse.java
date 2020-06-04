package com.ibm.loginms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IAMResponse {

	public String access_token;
	public String referesh_token;
	public String token_type;
	public String expires_in;
	public String expiration;
	public String scope;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getReferesh_token() {
		return referesh_token;
	}
	public void setReferesh_token(String referesh_token) {
		this.referesh_token = referesh_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "IAMResponse [access_token=" + access_token + ", referesh_token=" + referesh_token + ", token_type="
				+ token_type + ", expires_in=" + expires_in + ", expiration=" + expiration + ", scope=" + scope + "]";
	}
	
}
