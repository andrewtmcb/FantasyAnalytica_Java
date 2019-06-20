package io.mcbrayer.fa7.controller;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import io.mcbrayer.fa7.config.JwtAuthenticationEntryPoint;
import io.mcbrayer.fa7.config.JwtTokenUtil;
import io.mcbrayer.fa7.dao.UserDao;
import io.mcbrayer.fa7.service.JwtUserDetailsService;


@RunWith(SpringRunner.class)
@WebMvcTest(value = JWTAuthenticationController.class)
public class JWTAuthenticationControllerTest{
	// the following testing code is pure garbage and will most likely be deleted soon
	/*
	
	MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@MockBean
	JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	
	@MockBean
	JwtTokenUtil jwtTokenUtil;
	
	@MockBean
	AuthenticationManager authenticationManager;
	
	@MockBean
	JwtUserDetailsService jwtUserDetailsService;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		
	}
	
	@Test 
	public void conextLoads() throws Exception {
		UserDetails peterDetails = new org.springframework.security.core.userdetails.User("Peter Parker", "password",
				new ArrayList<>());
		
		Mockito.when(jwtUserDetailsService.loadUserByUsername(Mockito.anyString())).thenReturn(peterDetails);
		
		Mockito.when(jwtTokenUtil.generateToken(peterDetails)).thenReturn("someHash");
		
		MvcResult mvcResult = mockMvc.perform(  
				MockMvcRequestBuilders.get("/authenticate")
					.accept(MediaType.APPLICATION_JSON)
		).andReturn();
		
		System.out.println(mvcResult.getResponse());
		
		Mockito.verify(jwtUserDetailsService).loadUserByUsername(Mockito.anyString());
		
		Mockito.verify(jwtTokenUtil).generateToken(Mockito.any(UserDetails.class));
	}
	*/
}
