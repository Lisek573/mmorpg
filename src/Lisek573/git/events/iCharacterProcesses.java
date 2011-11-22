package Lisek573.git.events;

import Lisek573.git.exception.LevelTooLowException;

public interface iCharacterProcesses {

	public void processCharacter(CharacterEvent characterEvent)
			throws LevelTooLowException;
}
