package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class FortyLoveState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new GameState(player));
		} else {
			game.setState(new FortyFifteenState());
		}
	}

	@Override
	public String toString() {
		return "Forty Love";
	}

}
