package Lisek573.git.events;

import java.util.EventObject;

import Lisek573.git.Account;
import Lisek573.git.Character;

public class CharacterEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	private Character _character;

	public Character getCharacter() {
		return _character;
	}

	public CharacterEvent(Object source, Character character) {
		super(source);
		_character = character;

	}

	public static class RemoveCharacterBuffs implements iCharacterProcesses {

		public void processCharacter(CharacterEvent Event) {
			System.out.println(Event.getCharacter().getName()
					+ " character buffs has been removed.");
		}

	}

	public static class ChangeVipStatus implements iCharacterProcesses {

		public void processCharacter(CharacterEvent Event) {

			if (Event.getCharacter().getVip() == true) {
				Account.getCharaList().get(0).setVip(false);
				System.out.println(Event.getCharacter().getName()
						+ " vip status changed to false.");
			} else {
				Account.getCharaList().get(0).setVip(true);
				System.out.println(Event.getCharacter().getName()
						+ " vip status changed to true.");
			}

		}

	}

}
