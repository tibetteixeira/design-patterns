package io.tibetteixeira.behavioral.iterator.tvchannel;

import static java.lang.String.format;

public class App {

    public static void main(String[] args) {
        TV tv = new TV();

        for (var channel : tv) {
            System.out.println(format("Zapping at channel #%d", channel));
        }
    }
}
