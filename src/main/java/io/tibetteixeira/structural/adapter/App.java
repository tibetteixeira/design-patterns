package io.tibetteixeira.structural.adapter;

import io.tibetteixeira.structural.adapter.adapter.HDMIToOldMonitorAdapter;
import io.tibetteixeira.structural.adapter.adapter.HDMIToVGAAdapter;
import io.tibetteixeira.structural.adapter.device.OldMonitor;
import io.tibetteixeira.structural.adapter.device.PC;
import io.tibetteixeira.structural.adapter.device.TV;

public class App {

    public static void main(String[] args) {
        objectAdapter();
        classAdapter();
    }

    private static void objectAdapter() {
        System.out.println("## OBJECT ADAPTER");
        PC pc = new PC();

        System.out.println("----- First example - PC -> TV -----");
        pc.connectPort(new TV());
        pc.setImageAndSound("image 1", "sound 1");
        System.out.println("------------------------------------\n");

        System.out.println("----- First example - PC -> Old monitor -----");
        pc.connectPort(new HDMIToVGAAdapter(new OldMonitor()));
        pc.setImageAndSound("image 2", "sound 2");
        System.out.println("---------------------------------------------\n");
    }

    private static void classAdapter() {
        System.out.println("\n## CLASS ADAPTER");
        PC pc = new PC();

        System.out.println("----- First example - PC -> TV -----");
        pc.connectPort(new TV());
        pc.setImageAndSound("image 1", "sound 1");
        System.out.println("------------------------------------\n");

        System.out.println("----- First example - PC -> Old monitor -----");
        pc.connectPort(new HDMIToOldMonitorAdapter());
        pc.setImageAndSound("image 2", "sound 2");
        System.out.println("---------------------------------------------\n");
    }
}
