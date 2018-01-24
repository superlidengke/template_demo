package com.pickshell.redis.main

import com.pickshell.redis.domain.User
import org.junit.Before
import org.junit.Test
import redis.clients.jedis.Jedis
import redis.clients.jedis.Transaction

class AtomicTest {
    Jedis jedis

    @Before
    void setup(){
        //Resis server needs to be running and not protected-mode
        jedis = new Jedis('10.35.16.119')
    }
    def atomic(Closure c) {
        def results = null
        def tx
        try {
            tx = jedis.multi()
            c.delegate = tx
            c.call()
            results = tx.exec()
        } catch(e) {
            if(tx){
                tx.discard()
            }
        }
        results
    }

    @Test
    void atomicTest() {
        def res = atomic {
            incr ('foo')
            incr ('bar')
        }
        println jedis.get('foo')
        assert '1' == jedis.get('bar')
        assert res == [1, 1]
    }
}
