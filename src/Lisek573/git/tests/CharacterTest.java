package Lisek573.git.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Lisek573.git.Character;
import Lisek573.git.CharacterJobs.Jobs;

public class CharacterTest {

	// private Account Acc = new Account("lisek573", "Tomaszewski", 0001);
	private Character Cha = (new Character("Lisek", Jobs.Sniper, 94));

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
		assertTrue(Cha.getName().equals("Lisek"));
	}

	@Test
	public void testGetJob() {
		assertTrue(Cha.getJob().equals(Jobs.Sniper));
	}

	@Test
	public void testGetLevel() {
		assertTrue(Cha.getLevel().equals(94));
	}

	@Test
	public void testSetName() {
		Cha.setName("Abc");
		assertTrue(Cha.getName().equals("Abc"));
	}

	@Test
	public void testSetJob() {
		Cha.setJob(Jobs.Alchemist);
		assertTrue(Cha.getJob().equals(Jobs.Alchemist));
	}

	@Test
	public void testSetLevel() {
		Cha.setLevel(55);
		assertTrue(Cha.getLevel().equals(55));
	}

}
