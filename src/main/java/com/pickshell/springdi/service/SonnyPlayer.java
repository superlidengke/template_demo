package com.pickshell.springdi.service;
import org.springframework.stereotype.Component;
/**
 * Created by uc212310 on 10/26/2017.
 */
@Component
public class SonnyPlayer implements CDPlayer{
    private String title = "Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
