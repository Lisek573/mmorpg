package Lisek573.git.events;

import java.util.EventObject;

import Lisek573.git.Character;

public class CharacterEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Character _character;

	public Character getCharacter() {
		return _character;
	}

	public CharacterEvent(Object source, Character character) {
		super(source);
		_character = character;

	}

}
