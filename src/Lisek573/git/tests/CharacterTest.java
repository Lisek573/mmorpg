package Lisek573.git.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Lisek573.*;
import Lisek573.git.Account;
import Lisek573.git.Character;
import Lisek573.git.exception.LevelTooLowException;

public class CharacterTest {
	
	private Account l = new Account("lisek573", "Tomaszewski", 0001);
	private Character a = (new Character("Lisek", "Sniper", 94));
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		assertTrue(a.getName().equals("Lisek"));
	}

	@Test
	public void testGetJob() {
		assertTrue(a.getJob().equals("Sniper"));
	}

	@Test
	public void testGetLevel() {
		assertTrue(a.getLevel().equals(94));
	}

	@Test
	public void testSetName() {
		a.setName("Abc");
		assertTrue(a.getName().equals("Abc"));
	}

	@Test
	public void testSetJob() {
		a.setJob("Abc");
		assertTrue(a.getJob().equals("Abc"));
	}

	@Test
	public void testSetLevel() {
		a.setLevel(55);
		assertTrue(a.getLevel().equals(55));
	}

}
