package io.tibetteixeira.behavioral.state.headphone.state;

import io.tibetteixeira.behavioral.state.headphone.HeadPhone;

public interface HeadPhoneState {

    void click(HeadPhone headPhone);
    void longClick(HeadPhone headPhone);
}
