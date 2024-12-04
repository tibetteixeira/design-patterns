package io.tibetteixeira.behavioral.state.headphone;

public class App {

    public static void main(String[] args) {
        HeadPhone headPhone = new HeadPhone();

        headPhone.onClick();
        headPhone.onLongClick();
        headPhone.onClick();
        headPhone.onClick();
        headPhone.onLongClick();
    }
}
