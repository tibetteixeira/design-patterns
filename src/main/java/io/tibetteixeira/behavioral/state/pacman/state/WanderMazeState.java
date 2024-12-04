package io.tibetteixeira.behavioral.state.pacman.state;

import io.tibetteixeira.behavioral.state.pacman.model.Ghost;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WanderMazeState implements GhostState {

    @Getter
    private static final GhostState instance = new WanderMazeState();

    @Override
    public void pacmanEatPowerBoost(Ghost ghost) {
        ghost.setPacmanBoosted(true);
        ghost.setSpotPacman(false);
        ghost.setState(FleePacmanState.getInstance());
    }

    @Override
    public void losePacman(Ghost ghost) {
        // Nothing to do
    }

    @Override
    public void spotPacman(Ghost ghost) {
        ghost.setSpotPacman(true);
        ghost.setState(ChasePacmanState.getInstance());
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        // Nothing to do
    }

    @Override
    public void powerBoostExpire(Ghost ghost) {
        // Nothing to do
    }

    @Override
    public void reachCentralBase(Ghost ghost) {
        // Nothing to do
    }

}
