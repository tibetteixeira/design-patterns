package io.tibetteixeira.structural.flyweight.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MusicFlyweight {

    private String name;
    private String artist;
    private Integer durationInSeconds;

    @Override
    public String toString() {
        return "MusicFly [name=" + name + ", artist=" + artist
                + ", durationInSeconds=" + durationInSeconds + "]";
    }
}
