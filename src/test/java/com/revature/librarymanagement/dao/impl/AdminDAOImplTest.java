package com.revature.librarymanagement.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.librarymanagement.dao.AdminDAO;
import com.revature.librarymanagement.model.Admin;

public class AdminDAOImplTest {

	AdminDAO adminDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		adminDAO=new AdminDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		adminDAO=null;
	}

	@Test
	public void testGetAdminById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdminByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdminByRole() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsAdminExists() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllAdmins() {
		Long IdToTest = (long) -999;
		List<Admin> admins1 = adminDAO.getAllAdmins();
		adminDAO.addAdmin(new Admin(IdToTest, "demoName","adminrole ","demoName@com", "demo123"));
		List<Admin> admins2 = adminDAO.getAllAdmins();

		assertEquals(admins2.size(), admins1.size() + 1);

		adminDAO.deleteAdminById(IdToTest);
	}

	@Test
	public void testDeleteAdminById() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAdmin() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAdmin() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdminLogin() {
		fail("Not yet implemented");
	}

}
