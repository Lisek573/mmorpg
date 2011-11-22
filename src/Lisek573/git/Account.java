package Lisek573.git;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import Lisek573.git.CharacterJobs.Jobs;
import Lisek573.git.exception.LevelTooLowException;
import Lisek573.git.exception.NameCannotBeSameException;

public class Account {

	private PropertyConfigurator logConfig = new PropertyConfigurator();
	private Logger logger = Logger.getLogger(Account.class);

	public String Login;
	public String Surname;
	public Integer ID;

	public List<Character> charaList = new ArrayList<Character>();

	public Account(String Login, String Surname, Integer ID) {

		this.Login = Login;
		this.Surname = Surname;
		this.ID = ID;
		this.charaList = new ArrayList<Character>();
	}

	public void printAccount() {
		spacja();
		System.out.println("Login: " + Login + "\tSurname: " + Surname
				+ "\tID: " + ID);
		spacja();
	}

	public void printCharacter() {
		for (Character Cha : charaList) {
			Cha.printCharacter();
		}

	}

	public void addCharacter(Character Cha) throws LevelTooLowException,
			NameCannotBeSameException {
		int Level = Cha.getLevel();
		if (Level > 0) {
			charaList.add(Cha);
			PropertyConfigurator.configure("Log4J.properties");
			logger.info("New character added.");
		} else {
			logger.info("Cannot add character with level below 0.");
			throw new LevelTooLowException(
					"Cannot add character. Level is too low. Please set above level 0.");
		}
	}

	public void removeAllCharacter() {
		charaList.clear();
		logger.info("List cleared.");
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String Surname) {
		this.Surname = Surname;
	}

	public String getID() {
		return Surname;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public List<Character> getcharaList() {
		return charaList;
	}

	public void setcharaList(List<Character> charaList) {
		this.charaList = charaList;
	}

	public static void spacja() {
		for (int i = 0; i < 15; i++) {
			System.out.print("*");
		}
		System.out.println("*");
	}

	public Character searchCharacterByName(String Name) {
		for (Character character : charaList) {
			if (character.getName().equals(Name)) {
				return character;
			}
		}
		return null;
	}

	/*
	 * public List searchAllCharacterByJobs(Jobs Job) { for (Character character
	 * : charaList) { if (character.getJob().equals(Job)){ return character; } }
	 * return null; }
	 */

	public void editName(String Name, String newName) {
		searchCharacterByName(Name).setName(newName);
	}

	public void editJob(String Name, Jobs newJob) {
		searchCharacterByName(Name).setJob(newJob);
	}

	public void editLevel(String Name, Integer newLevel)
			throws LevelTooLowException {
		if (newLevel > 0)
			searchCharacterByName(Name).setLevel(newLevel);
		else {
			logger.info("Level edit failed.");
			throw new LevelTooLowException(
					"Level is too low. Please set above level 0.");
		}
	}

	public void removeCharacter(Character c) {
		charaList.remove(c);
		logger.info("Character deleted.");
	}

	public PropertyConfigurator getLogConfig() {
		return logConfig;
	}

	public void setLogConfig(PropertyConfigurator logConfig) {
		this.logConfig = logConfig;
	}

}
