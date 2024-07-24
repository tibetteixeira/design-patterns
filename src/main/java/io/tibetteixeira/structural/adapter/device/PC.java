package io.tibetteixeira.structural.adapter.device;

import io.tibetteixeira.structural.adapter.interfaces.HDMI;

import static java.util.Objects.isNull;

public class PC {

    private HDMI port;

    public void connectPort(HDMI screen) {
        System.out.println("Connecting on HDMI port...");
        port = screen;
    }

    public void setImageAndSound(String image, String sound) {
        if (isNull(port)) {
            System.out.println("Connect a HDMI cable first");
        } else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
