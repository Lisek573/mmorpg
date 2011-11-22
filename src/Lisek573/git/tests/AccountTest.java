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

public class AccountTest {

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
	public void testAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCharacter() {
		assertSame(1, id0001.getCharaList().size());
	}

	@Test
	public void testRemoveAllCharacter() {
		id0001.removeAllCharacter();
		assertTrue(id0001.getCharaList().size() == 0);
	}

	@Test
	public void testGetLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSurname() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSurname() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetcharaList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetcharaList() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllGameByName() {
		assertSame(id0001.getCharaList().get(0),
				id0001.findAllGameByName("Lisek").get(0));
	}

	@Test
	public void testFindAllGameByJobs() {
		assertSame(id0001.getCharaList().get(0),
				id0001.findAllGameByJobs(Jobs.Sniper).get(0));
	}

	@Test
	public void testFindAllGameByLevel() {
		assertSame(id0001.getCharaList().get(0), id0001.findAllGameByLevel(94)
				.get(0));
	}

	@Test
	public void testEditJob() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditLevel() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCharacter() {
		id0001.removeCharacter(id0001.getCharaList().get(0));
		assertTrue(id0001.getCharaList().size() == 0);
	}

	@Test
	public void testGetCharaList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCharaList() {
		fail("Not yet implemented");
	}

}
