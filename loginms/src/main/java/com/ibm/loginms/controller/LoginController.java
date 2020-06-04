package com.ibm.loginms.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibm.loginms.model.IAMResponse;
import com.ibm.loginms.model.LoginRequest;
import com.ibm.loginms.model.LoginResponse;

@RestController
@CrossOrigin
@RequestMapping("/groceryLogin")
public class LoginController {

	/*
	 * @Autowired private AuthenticationManager authenticationManager;
	 */

	/*
	 * @Autowired private JwtTokenUtil jwtTokenUtil;
	 */

	/*
	 * @Autowired private JwtUserDetailsService userDetailsService;
	 */


	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<LoginResponse> addConversionFactor(@RequestBody LoginRequest request) throws Exception {
		System.out.println("Request came for login");
		final String uri = "https://iam.cloud.ibm.com/identity/token";
	    LoginResponse response = new LoginResponse(); 
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

	    MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
	    map.add("grant_type", "urn:ibm:params:oauth:grant-type:apikey");
	    map.add("apikey", "wZu_fQXiVr1w4r417Gu-2x4V5CTcx-klnStYwLypySab");
	    
	    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(map, headers);

	    ResponseEntity<IAMResponse> result = restTemplate.exchange(uri, HttpMethod.POST, entity, IAMResponse.class);
	    System.out.println(result.getBody()); 

	    response.setUserToken(result.getBody().getAccess_token());
	    
		/*
		 * authenticate(request.getUsername(), request.getPassword());
		 * 
		 * final UserDetails userDetails = userDetailsService
		 * .loadUserByUsername(request.getUsername());
		 * 
		 * final String token = jwtTokenUtil.generateToken(userDetails);
		 * response.setTransactionToken(token);
		 */
	    
		return ResponseEntity.ok(response);
	} 
	
	/*
	 * private void authenticate(String username, String password) throws Exception
	 * { try { authenticationManager.authenticate(new
	 * UsernamePasswordAuthenticationToken(username, password)); } catch
	 * (DisabledException e) { throw new Exception("USER_DISABLED", e); } catch
	 * (BadCredentialsException e) { throw new Exception("INVALID_CREDENTIALS", e);
	 * } }
	 */
}
