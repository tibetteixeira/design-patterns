package io.tibetteixeira.behavioral.iterator.tvchannel;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.List;

import static java.util.Objects.isNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ChannelIterator implements Iterator<Integer> {

    private List<Integer> channels;
    private Integer index;

    public ChannelIterator(List<Integer> channels) {
        this.channels = channels;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (isNull(channels)) {
            return false;
        }

        return index < channels.size();
    }

    @Override
    public Integer next() {
        return channels.get(index++);
    }
}
