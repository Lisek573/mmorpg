package Lisek573.git;

public class Character {

	String Name;
	String Job;
	Integer Level;

	public Character(String Name, String Job, Integer Level) {
		this.Name = Name;
		this.Job = Job;
		this.Level = Level;
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
