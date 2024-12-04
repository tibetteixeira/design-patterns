package io.tibetteixeira.behavioral.state.headphone.state;

import io.tibetteixeira.behavioral.state.headphone.HeadPhone;
import lombok.Getter;

public class PlayingState implements HeadPhoneState {

    @Getter
    private static final HeadPhoneState instance = new PlayingState();

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(false);
        System.out.println("Paused");
        headPhone.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.isOn(false);
        System.out.println("Turning off...");
        headPhone.setState(OffState.getInstance());
    }
}
