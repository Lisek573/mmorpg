package Lisek573.git.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Lisek573.git.Account;
import Lisek573.git.Character;
import Lisek573.git.CharacterJobs.Jobs;
import Lisek573.git.exception.LevelTooLowException;
import Lisek573.git.exception.NameCannotBeSameException;

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
	public void testAccount() throws LevelTooLowException,
			NameCannotBeSameException {
		Account id0002 = new Account("lisek5734", "Tomaszewskii", 0002);
		id0002.addCharacter(new Character("Lisek", Jobs.Sniper, 94));
		assertTrue(Account.getCharaList().size() == 1);
		assertTrue(id0002.getLogin().equals("lisek5734"));
	}

	@Test
	public void testAddCharacter() {
		assertSame(1, Account.getCharaList().size());
	}

	@Test
	public void testRemoveAllCharacter() {
		id0001.removeAllCharacter();
		assertTrue(Account.getCharaList().size() == 0);
	}

	@Test
	public void testGetLogin() {
		assertTrue(id0001.getLogin() == "lisek573");
	}

	@Test
	public void testSetLogin() {
		id0001.setLogin("lisek574");
		assertTrue(id0001.getLogin() == "lisek574");
	}

	@Test
	public void testGetSurname() {
		assertTrue(id0001.getSurname() == "Tomaszewski");
	}

	@Test
	public void testSetSurname() {
		id0001.setSurname("lisek574");
		assertTrue(id0001.getSurname() == "lisek574");
	}

	@Test
	public void testGetID() {
		assertSame(id0001.getID(), 1);
	}

	@Test
	public void testSetID() {
		id0001.setID(2);
		assertSame(id0001.getID(), 2);
	}

	@Test
	public void testGetCharaList() {
		assertNotNull(Account.getCharaList());
	}

	@Test
	public void testSetCharaList() {
		List<Character> list = new ArrayList<Character>();
		list.add(new Character("Lisek", Jobs.Sniper, 94));
		id0001.setCharaList(list);
		assertTrue(list.size() == 1);
	}

	@Test
	public void testFindAllCharacterByName() {
		assertSame(Account.getCharaList().get(0), id0001
				.findAllCharacterByName("Lisek").get(0));
	}

	@Test
	public void testFindAllCharacterByJobs() {
		assertSame(Account.getCharaList().get(0), id0001
				.findAllCharacterByJobs(Jobs.Sniper).get(0));
	}

	@Test
	public void testFindAllGameByLevel() {
		assertSame(Account.getCharaList().get(0), id0001
				.findAllCharacterByLevel(94).get(0));
	}

	@Test
	public void testEditJob() {
		id0001.editJob(id0001.findAllCharacterByJobs(Jobs.Sniper),
				Jobs.Alchemist);
		assertTrue(Account.getCharaList().get(0).getJob() == Jobs.Alchemist);
	}

	@Test
	public void testEditLevel() throws LevelTooLowException {
		id0001.editLevel(id0001.findAllCharacterByLevel(94), 95);
		assertTrue(Account.getCharaList().get(0).getLevel() == 95);
	}

	@Test
	public void testRemoveCharacter() {
		id0001.removeCharacter(Account.getCharaList().get(0));
		assertTrue(Account.getCharaList().size() == 0);
	}

}
