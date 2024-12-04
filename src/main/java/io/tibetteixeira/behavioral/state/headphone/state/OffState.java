package io.tibetteixeira.behavioral.state.headphone.state;

import io.tibetteixeira.behavioral.state.headphone.HeadPhone;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OffState implements HeadPhoneState {

    @Getter
    private static final HeadPhoneState instance = new OffState();

    @Override
    public void click(HeadPhone headPhone) {
        // Nothing to do
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.isOn(true);
        System.out.println("Turning on...");
        headPhone.setState(OnState.getInstance());
    }

}
