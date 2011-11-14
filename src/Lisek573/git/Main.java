package Lisek573.git;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import Lisek573.git.exception.LevelTooLowException;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws LevelTooLowException {

		PropertyConfigurator.configure("Log4J.properties");
		
		Account id0001 = new Account("lisek573", "Tomaszewski", 0001);
		id0001.addCharacter(new Character("Lisek", "Sniper", 94));
		id0001.addCharacter(new Character("Skybird", "Swordsman", 35));
		id0001.addCharacter(new Character("Rorona Frixell", "Alchemist", 64));
		
		id0001.printAccount();
		id0001.printCharacter();
	}
}