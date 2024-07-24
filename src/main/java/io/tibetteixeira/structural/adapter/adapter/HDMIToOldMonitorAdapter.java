package io.tibetteixeira.structural.adapter.adapter;

import io.tibetteixeira.structural.adapter.device.OldMonitor;
import io.tibetteixeira.structural.adapter.interfaces.HDMI;

// This class is an example of Class Adapter
public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interface with HDMI Adapter");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }
}
