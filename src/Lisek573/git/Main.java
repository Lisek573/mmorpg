package Lisek573.git;

public class Main {

	public static void main(String[] args) {

		Account id0001 = new Account("lisek573", "Tomaszewski", 0001);
		id0001.addCharacter(new Character("Lisek", "Sniper", 94));
		id0001.addCharacter(new Character("Skybird", "Swordsman", 35));
		id0001.addCharacter(new Character("Rorona Frixell", "Alchemist", 64));
	//	id0001.editLevelJob("Lisek", "Sniper", 95);
	//	id0001.editName("Lisek", "Lisek2", "Sniper", 96);
		id0001.searchCharacter("Lisek");

		id0001.printAccount();
		id0001.printCharacter();

		Account id0002 = new Account("nusa", "Unknown", 0002);
		id0002.addCharacter(new Character("Czina", "High Priest", 93));
		id0002.addCharacter(new Character("Caramiya", "Gunslinger", 54));

		id0002.printAccount();
		id0002.printCharacter();
	}
}