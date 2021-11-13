package com.brentaronsen.section4Methods;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperTemp = summer ? 45 : 35;
        int lowerTemp = 25;

        return (temperature >= lowerTemp && temperature <= upperTemp);
    }
}
