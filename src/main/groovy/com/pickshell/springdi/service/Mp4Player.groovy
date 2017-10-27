package com.pickshell.springdi.service

import org.springframework.stereotype.Component

/**
 * Created by uc212310 on 10/27/2017.
 */
@Component
@groovy.util.logging.Log
class Mp4Player implements MediaPlayer{
    @Override
    void play() {
        log.info("Start play")
        println('This is MP4 player')
    }
}
