package io.tibetteixeira.behavioral.iterator.tvchannel;

import java.util.*;

import static java.lang.String.format;

public class TV implements Iterable<Integer> {
    private List<Integer> channels = new ArrayList<>();
    private Iterator<Integer> iterator;

    public TV() {
        searchAvailableChannels();
        iterator = new ChannelIterator(channels);
    }

    private void searchAvailableChannels() {
        Random random = new Random();
        for (var i = 0; i < 30; i++) {
            if (random.nextInt(2) == 1) {
                channels.add(i);
            }
        }

        System.out.println(format("Found %d channels", channels.size()));
    }


    @Override
    public Iterator<Integer> iterator() {
        return iterator;
    }

}
