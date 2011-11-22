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
import Lisek573.git.exception.LevelTooLowException;
import Lisek573.git.exception.NameCannotBeSameException;

public class AccountTest {

	private Account Acc = new Account("lisek573", "Tomaszewski", 0001);
	private Character Cha = (new Character("Lisek", Jobs.Sniper, 94));
	private Character Cha1 = (new Character("Lisek2321", Jobs.Alchemist, 94));

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
	public void testAddCharacter() throws LevelTooLowException,
			NameCannotBeSameException {
		Acc.addCharacter(Cha);
		assertTrue(Acc.charaList.size() > 0);
	}

	@Test
	public void testRemoveAllCharacter() {
		Acc.removeAllCharacter();
		assertTrue(Acc.charaList.size() <= 0);
	}

	@Test
	public void testSearchCharacterByName() {
		Acc.searchCharacterByName("Lisek");
	}

	@Test
	public void testEditName() {
		Acc.editName("Lisek", "Lisek2");
		assertTrue(Cha.getName() == "Lisek2");
	}

	@Test
	public void testEditJob() {
		Acc.editJob("Lisek", Jobs.Alchemist);
		assertEquals(Cha.getJob(), Jobs.Alchemist);
	}

	@Test
	public void testEditLevel() throws LevelTooLowException {
		Acc.editLevel("Lisek", 5);
		Acc.editLevel("Lisek2321", 5);
		assertEquals(Cha.getLevel(), Cha1.getLevel());
	}

	@Test
	public void testRemoveCharacter() {
		Acc.removeCharacter(Cha);
		assertTrue(Cha.getName() != "Lisek");
	}

}
