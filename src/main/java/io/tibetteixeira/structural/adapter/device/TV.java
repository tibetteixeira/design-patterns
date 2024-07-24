package io.tibetteixeira.structural.adapter.device;

import io.tibetteixeira.structural.adapter.interfaces.HDMI;

public class TV implements HDMI {

    @Override
    public void setImage(String image) {
        System.out.println("TV image " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("TV sound " + sound);

    }
}
