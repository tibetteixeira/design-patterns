package io.tibetteixeira.behavioral.state.pacman.state;

import io.tibetteixeira.behavioral.state.pacman.model.Ghost;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FleePacmanState implements GhostState {

    @Getter
    private static final FleePacmanState instance = new FleePacmanState();

    @Override
    public void pacmanEatPowerBoost(Ghost ghost) {
        ghost.setPacmanBoosted(true);
        ghost.setSpotPacman(false);
        ghost.setState(instance);
    }

    @Override
    public void losePacman(Ghost ghost) {
        // Nothing to do
    }

    @Override
    public void spotPacman(Ghost ghost) {
        // Nothing to do
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        ghost.setSpotPacman(false);
        ghost.setEatenByPacman(true);
        ghost.setState(ReturnBaseState.getInstance());
    }

    @Override
    public void powerBoostExpire(Ghost ghost) {
        ghost.setPacmanBoosted(false);
        ghost.setState(WanderMazeState.getInstance());
    }

    @Override
    public void reachCentralBase(Ghost ghost) {
        // Nothing to do
    }
}
