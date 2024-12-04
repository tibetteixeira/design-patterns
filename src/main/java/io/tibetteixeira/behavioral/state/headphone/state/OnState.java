package io.tibetteixeira.behavioral.state.headphone.state;

import io.tibetteixeira.behavioral.state.headphone.HeadPhone;
import lombok.Getter;

public class OnState implements HeadPhoneState {

    @Getter
    private static final HeadPhoneState instance = new OnState();

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(true);
        System.out.println("Playing...");
        headPhone.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.isOn(false);
        System.out.println("Turning off...");
        headPhone.setState(OffState.getInstance());
    }
}
