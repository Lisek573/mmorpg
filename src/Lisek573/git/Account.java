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

	public static List<Character> charaList = new ArrayList<Character>();

	public Account(String Login, String Surname, Integer ID) {

		this.Login = Login;
		this.Surname = Surname;
		this.ID = ID;
		Account.charaList = new ArrayList<Character>();
	}

	public void printAccount() {
		spacja();
		System.out.println("Login: " + Login + "\tSurname: " + Surname
				+ "\tID: " + ID);
		spacja();
	}

	public void printCharacter() {
		for (Character cha : charaList) {
			cha.printCharacter();
		}

	}

	public void addCharacter(Character cha) throws LevelTooLowException,
			NameCannotBeSameException {
		int Level = cha.getLevel();
		if (Level > 0) {
			charaList.add(cha);
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

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public void setcharaList(List<Character> charaList) {
		Account.charaList = charaList;
	}

	public static void spacja() {
		for (int i = 0; i < 15; i++) {
			System.out.print("*");
		}
		System.out.println("*");
	}

	public List<Character> findAllCharacterByName(String Name) {
		List<Character> results = new ArrayList<Character>();
		for (Character character : charaList) {
			if (character.getName().equals(Name)) {
				results.add(character);
			}
		}
		return results;
	}

	public List<Character> findAllCharacterByJobs(Jobs jobs) {
		List<Character> results = new ArrayList<Character>();
		for (Character character : charaList) {
			if (character.getJob().equals(jobs)) {
				results.add(character);
			}
		}
		return results;
	}

	public List<Character> findAllCharacterByLevel(Integer Level) {
		List<Character> results = new ArrayList<Character>();
		for (Character character : charaList) {
			if (character.getLevel().equals(Level)) {
				results.add(character);
			}
		}
		return results;
	}

	public void editJob(List<Character> list, Jobs jobs) {
		for (Character character : list) {
			character.setJob(jobs);
			logger.info("Job changed for " + character.getName()
					+ "** new job: " + jobs);
		}
	}

	public void editLevel(List<Character> list, Integer Level)
			throws LevelTooLowException {
		if (Level > 0) {
			for (Character character : list) {
				character.setLevel(Level);
				logger.info("Level changed for " + character.getName()
						+ "** new level: " + Level);
			}
		}
		if (Level <= 0)
			throw new LevelTooLowException("Level cannot be lower than 0");
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

	public static List<Character> getCharaList() {
		return charaList;
	}

	public void setCharaList(List<Character> charaList) {
		Account.charaList = charaList;
	}

}
