package io.tibetteixeira.structural.adapter.device;

import io.tibetteixeira.structural.adapter.interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println("Old monitor image " + image);
    }
}
