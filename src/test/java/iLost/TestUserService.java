package iLost;

import static org.junit.Assert.*;
import me.second_life.ilost.service.impl.UserServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestUserService {

	@Autowired
	private UserServiceImpl userService = null;

	@Test
	public void hasMatchUser() {
		boolean b1 = userService.findUser("dev_user1", "password");
		boolean b2 = userService.findUser("kevin", "111");
		assertTrue(b1);
		assertTrue(b2);
	}

}