package Lisek573.git;

import Lisek573.git.exception.LevelTooLowException;

public class Character {

	String Name;
	String Job;
	Integer Level;

	public Character(String Name, String Job, Integer Level) {
		this.Name = Name;
		this.Job = Job;
		this.Level = Level;
	}
	
	public void addCharacter(String Name, String Job, Integer Level) throws LevelTooLowException {
		if (Level > 0) {
	//		character.add(new Character(Name, Job, Level);
	//		logger.info("Dodano nowy produkt " + Name + "||Cena: " + Level);
		}
		else
			throw new LevelTooLowException("blah");
	}

	public void printCharacter() {
		System.out.println("Name: " + this.Name + "\t** Level: " + this.Level
				+ "\t** Job: " + this.Job);
	}

	public String getName() {
		return Name;
	}

	public String getJob() {
		return Job;
	}

	public Integer getLevel() {
		return Level;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setJob(String Job) {
		this.Job = Job;
	}

	public void setLevel(Integer Level) {
		this.Level = Level;
	}

}
