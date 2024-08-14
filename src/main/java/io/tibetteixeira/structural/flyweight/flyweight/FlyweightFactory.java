package io.tibetteixeira.structural.flyweight.flyweight;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FlyweightFactory {

    @Getter
    private static final FlyweightFactory instance = new FlyweightFactory();
    private static final Map<String, MusicFlyweight> musicRepository = new HashMap<>();

    public MusicFlyweight getMusic(String desc) {
        MusicFlyweight mf = musicRepository.get(desc);
        if(mf == null) {
            System.out.println("Creating new Flyweight for " + desc);
            mf = getMusicByString(desc);
            musicRepository.put(desc, mf);
        }
        return mf;
    }

    private MusicFlyweight getMusicByString(String desc) {
        String[] musicData = desc.split(";");
        return new MusicFlyweight(musicData[0], musicData[1], Integer.parseInt(musicData[2]));
    }

    public Integer getSize() {
        return musicRepository.size();
    }
}
