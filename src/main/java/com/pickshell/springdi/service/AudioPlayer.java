package com.pickshell.springdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by uc212310 on 10/26/2017.
 */
@Component
public class AudioPlayer implements MediaPlayer {
    private CDPlayer cd;
    @Autowired
    public AudioPlayer(CDPlayer cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
