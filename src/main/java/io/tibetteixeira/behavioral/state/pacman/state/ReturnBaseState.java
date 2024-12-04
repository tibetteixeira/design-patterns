package io.tibetteixeira.behavioral.state.pacman.state;

import io.tibetteixeira.behavioral.state.pacman.model.Ghost;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReturnBaseState implements GhostState {

    @Getter
    private static final ReturnBaseState instance = new ReturnBaseState();

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
        // Nothing to do
    }

    @Override
    public void powerBoostExpire(Ghost ghost) {
        ghost.setPacmanBoosted(false);
        ghost.setState(instance);
    }

    @Override
    public void reachCentralBase(Ghost ghost) {
        ghost.setEatenByPacman(false);
        ghost.setState(instance);
    }
}
