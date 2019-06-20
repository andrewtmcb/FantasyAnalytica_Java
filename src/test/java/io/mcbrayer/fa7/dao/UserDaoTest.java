package io.mcbrayer.fa7.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.mcbrayer.fa7.model.User;
import io.mcbrayer.fa7.model.UserDTO;
import io.mcbrayer.fa7.service.JwtUserDetailsService;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserDaoTest {

	@Autowired
	private JwtUserDetailsService jwtUserDetialsService;
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void testSave() {
		UserDTO userDTO = new UserDTO();
		userDTO.setEmail("SecurityGuru@gmail.com");
		userDTO.setPassword("SuperSecurePassword123!$");
		jwtUserDetialsService.save(userDTO);
		User user = userDao.findByEmail("SecurityGuru@gmail.com");
		assertThat(user.getEmail()).isEqualTo(userDTO.getEmail());
		assertThat(user.getPassword()).isNotEqualTo(userDTO.getPassword());
		userDao.deleteById(user.getId());
		assertThat(userDao.findByEmail("SecurityGuru@gmail.com")).isNull();
	}
	
}
