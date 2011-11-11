package Lisek573.git;

public class Main {

	public static void main(String[] args) {

		Account id0001 = new Account("lisek573", "Tomaszewski", 0001);
		id0001.addCharacter(new Character("Lisek", "Sniper", 94));
		id0001.addCharacter(new Character("Skybird", "Swordsman", 35));
		id0001.addCharacter(new Character("Rorona Frixell", "Alchemist", 64));

		id0001.printAccount();
		id0001.printCharacter();
	}
}