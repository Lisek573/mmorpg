package Lisek573.git.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Lisek573.git.Account;
import Lisek573.git.Character;
import Lisek573.git.CharacterJobs.Jobs;

public class CharacterTest {

	Account id0001 = new Account("lisek573", "Tomaszewski", 0001);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		id0001.addCharacter(new Character("Lisek", Jobs.Sniper, 94));
	}

	@After
	public void tearDown() throws Exception {
		id0001.removeAllCharacter();
	}

	@Test
	public void testCharacter() {
		assertTrue(Account.getCharaList().size() > 0);
	}

	@Test
	public void testGetName() {
		assertTrue(Account.getCharaList().get(0).getName() == "Lisek");
	}

	@Test
	public void testGetJob() {
		assertTrue(Account.getCharaList().get(0).getJob() == Jobs.Sniper);
	}

	@Test
	public void testGetLevel() {
		assertSame(Account.getCharaList().get(0).getLevel(), 94);
	}

	@Test
	public void testSetName() {
		Account.getCharaList().get(0).setName("Lisek2");
		assertTrue(Account.getCharaList().get(0).getName() == "Lisek2");
	}

	@Test
	public void testSetJob() {
		Account.getCharaList().get(0).setJob(Jobs.Priest);
		assertEquals(Account.getCharaList().get(0).getJob(), Jobs.Priest);
	}

	@Test
	public void testSetLevel() {
		Account.getCharaList().get(0).setLevel(2);
		assertSame(Account.getCharaList().get(0).getLevel(), 2);
	}

	@Test
	public void testSetVip() {
		Account.getCharaList().get(0).setVip(true);
		assertSame(Account.getCharaList().get(0).getVip(), true);
	}

	@Test
	public void testGetVip() {
		assertSame(Account.getCharaList().get(0).getVip(), false);
	}

}
