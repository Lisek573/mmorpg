package Lisek573.git;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Lisek573.*;
import Lisek573.git.exception.LevelTooLowException;

public class AccountTest {

	private Account l = new Account("lisek573", "Tomaszewski", 0001);
	private Character a = (new Character("Lisek", "Sniper", 94));
	private Character b = (new Character("Lisek2", "Sniper2", 94));

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
	public void testAddCharacter() throws LevelTooLowException {
		l.addCharacter(a);
		assertTrue(l.charaList.size() > 0);
	}

	@Test
	public void testRemoveAllCharacter() {
		l.removeAllCharacter();
		assertTrue(l.charaList.size()<=0);
	}

	@Test
	public void testSearchCharacterByName() {
		l.searchCharacterByName("Lisek");
	}

	@Test
	public void testEditName() {
		l.editName("Lisek", "Lisek2");
		assertTrue(a.getName() == "Lisek2");
	}

	@Test
	public void testEditJob() {
		l.editJob("Lisek", "Sniper5");
		assertTrue(a.getJob() == "Sniper5");
	}

	@Test
	public void testEditLevel() throws LevelTooLowException {
		l.editLevel("Lisek", 5);
		assertTrue(a.getLevel() == 5);
	}

	@Test
	public void testRemoveCharacter() {
		l.removeCharacter("Lisek");
		assertTrue(a.getName()!="Lisek");
	}

}
