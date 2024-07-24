package io.tibetteixeira.structural.adapter.adapter;

import io.tibetteixeira.structural.adapter.interfaces.HDMI;
import io.tibetteixeira.structural.adapter.interfaces.VGA;

// This class is an example of Object Adapter
public class HDMIToVGAAdapter implements HDMI {
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }
}
