package Lisek573.git;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Account {

	private PropertyConfigurator logConfig = new PropertyConfigurator();
	private Logger logger = Logger.getLogger(Account.class);

	public String Login;
	public String Surname;
	public Integer ID;
	
	List<Character> charaList = new ArrayList<Character>();

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
		for (Character g : charaList) {
			g.printCharacter();
		}

	}

	public void addCharacter(Character g) {
		charaList.add(g);
	    logConfig.configure("Log4J.properties");
	    logger.info("New character added.");
	}

	public void removeAllCharacter() {
		charaList.clear();
		logger.info("List cleared.");
	}

	public void editCharacter(String newName, String newClass, Integer newLevel) {
		charaList.set(0, new Character(newName, newClass, newLevel));
	    logger.info("Character edited.");
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

	// public List<...> searchAllCharacterByName(String Name) {
	// ...
	// }

	public void editName(String Name, String newName) {
		searchCharacterByName(Name).setName(newName);
	}

	public void editJob(String Name, String newJob) {
		searchCharacterByName(Name).setJob(newJob);
	}

	public void editLevel(String Name, Integer newLevel) {
		searchCharacterByName(Name).setLevel(newLevel);
	}

	public void removeCharacter(String Name) {
		charaList.remove(searchCharacterByName(Name));
	    logger.info("Character deleted.");
	}

}
