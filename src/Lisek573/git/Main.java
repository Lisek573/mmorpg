package Lisek573.git;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import Lisek573.git.CharacterJobs.Jobs;
import Lisek573.git.exception.LevelTooLowException;
import Lisek573.git.exception.NameCannotBeSameException;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws LevelTooLowException,
			NameCannotBeSameException {

		PropertyConfigurator.configure("Log4J.properties");

		Account id0001 = new Account("lisek573", "Tomaszewski", 0001);
		id0001.addCharacter(new Character("Lisek", Jobs.Sniper, 94));
		id0001.addCharacter(new Character("Skybird", Jobs.Swordsman, 35));
		id0001.addCharacter(new Character("Rorona Frixell", Jobs.Alchemist, 64));

		id0001.printAccount();
		id0001.printCharacter();
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		Main.logger = logger;
	}
}