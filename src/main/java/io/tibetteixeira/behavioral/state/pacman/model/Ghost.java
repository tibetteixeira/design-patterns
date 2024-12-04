package io.tibetteixeira.behavioral.state.pacman.model;

import io.tibetteixeira.behavioral.state.pacman.state.GhostState;
import io.tibetteixeira.behavioral.state.pacman.state.WanderMazeState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ghost {

    private GhostState state = WanderMazeState.getInstance();
    private boolean spotPacman = false;
    private boolean eatenByPacman = false;
    private boolean pacmanBoosted = false;

}
