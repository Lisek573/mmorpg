package Lisek573.git;

import java.util.ArrayList;
import java.util.List;

public class Account {

	String Login;
	String Surname;
	Integer ID;
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
	}

	public void removeAllCharacter() {
		charaList.clear();
	}

	public void editCharacter(String newName, String newClass, Integer newLevel) {
		charaList.set(0, new Character(newName, newClass, newLevel));
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

	public void editLevelJob(String Name, String Job, Integer Level) {
		int order = 0;
		int found = 0;
		for (Character character : charaList) {
			if (character.getName().equals(Name)) {
				charaList.set(order, new Character(Name, Job, Level));
				found++;
			}
			order++;
		}
		{
			if (found == 0)
				System.out.println("Character " + Name + " not found.");
		}
	}

	public void editName(String Name, String newName, String Job, Integer Level) {
		int order = 0;
		int found = 0;
		for (Character character : charaList) {
			if (character.getName().equals(Name)) {
				charaList.set(order, new Character(newName, Job, Level));
				found++;
			}
			order++;
		}
		{
			if (found == 0)
				System.out.println("Character " + Name + " not found.");
		}
	}

	public void searchCharacter(String Name) {
		int order = 0;
		int found = 0;
		for (Character character : charaList) {
			if (character.getName().equals(Name)) {
				System.out.println("Character " + character.getName()
						+ " ID is = " + order);
				found++;
			}
			order++;
		}
		{
			if (found == 0)
				System.out.println("Character " + Name + " not found.");
		}
	}
	
	public void removeCharacter(String Name) {
		int order = 0;
		int found = 0;
		for (Character character : charaList) {
			if (character.getName().equals(Name)) {
				charaList.remove(order);
				found++;
				break;
			}
			order++;
		}
		{
			if (found == 0)
				System.out.println("Character " + Name + " not found.");	
		}
	}
}
