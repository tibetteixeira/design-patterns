package io.tibetteixeira.behavioral.state.pacman.state;

import io.tibetteixeira.behavioral.state.pacman.model.Ghost;

public interface GhostState {

    void pacmanEatPowerBoost(Ghost ghost);
    void losePacman(Ghost ghost);
    void spotPacman(Ghost ghost);
    void eatenByPacman(Ghost ghost);
    void powerBoostExpire(Ghost ghost);
    void reachCentralBase(Ghost ghost);
}
