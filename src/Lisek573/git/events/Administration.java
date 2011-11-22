package Lisek573.git.events;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lisek573.git.exception.LevelTooLowException;
import Lisek573.git.Character;

public class Administration {

	private Character character;

	private List<iCharacterProcesses> processes = new ArrayList<iCharacterProcesses>();

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public synchronized void addProcess(iCharacterProcesses process) {
		processes.add(process);

	}

	public synchronized void removeProcess(iCharacterProcesses process) {
		processes.remove(process);

	}

	public synchronized void executeProcesses() throws LevelTooLowException {

		CharacterEvent Event = new CharacterEvent(this, character);

		Iterator<iCharacterProcesses> proc = processes.iterator();
		while (proc.hasNext()) {
			((iCharacterProcesses) proc.next()).processCharacter(Event);
		}

	}

	public static class RemoveCharacterBuffs implements iCharacterProcesses {

		public void processCharacter(CharacterEvent Event) {
			System.out.println(Event.getCharacter().getName()
					+ " character buffs has been removed.");
		}

	}

	public static class ChangeVipStatus implements iCharacterProcesses {

		public void processCharacter(CharacterEvent Event) {

			if (Event.getCharacter().getVip(false))
				System.out.println(Event.getCharacter().getName()
						+ " vip status changed.");
		}

	}

	public static class BonusLevel implements iCharacterProcesses {

		public void processCharacter(CharacterEvent Event)
				throws LevelTooLowException {
			System.out.println(Event.getCharacter().getName()
					+ " level changed.");
			int l = Event.getCharacter().getLevel();
			l = 2 * l;
			Event.getCharacter().setLevel(l);
		}
	}

	public static class BonusLevelRollback implements iCharacterProcesses {

		public void processCharacter(CharacterEvent Event)
				throws LevelTooLowException {
			System.out.println(Event.getCharacter().getName()
					+ " level changed.");
			int l = Event.getCharacter().getLevel();
			l = l / 2;
			Event.getCharacter().setLevel(l);
		}
	}

}
