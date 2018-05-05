package jp.takeshi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class UserInfoTest {

	@Test
	public void testGetId() {
		UserInfo ui = new UserInfo();
		ui.setId("hanage");
		assertEquals("hanage", ui.getId());
	}

	@Test
	public void testGetName() {
		UserInfo ui = new UserInfo();
		ui.setName("hanage");
		assertEquals("hanage", ui.getName());
		
	}

}
