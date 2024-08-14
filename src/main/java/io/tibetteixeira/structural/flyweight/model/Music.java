package io.tibetteixeira.structural.flyweight.model;


import io.tibetteixeira.structural.flyweight.flyweight.MusicFlyweight;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music {

    private MusicFlyweight musicFlyweight;
    private Integer playerQty;

    public Music(MusicFlyweight musicFlyweight) {
        this.musicFlyweight = musicFlyweight;
        this.playerQty = 0;
    }

    public void listenning() {
        playerQty++;
    }

    @Override
    public String toString() {
        return "Music [musicFlyweight=" + musicFlyweight + ", playerQty=" + playerQty + "]";
    }
}
