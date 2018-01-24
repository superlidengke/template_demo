package com.pickshell.redis.main

import org.junit.Before
import org.junit.Test
import redis.clients.jedis.Jedis

class BasicTest {
    Jedis jedis

    @Before
    void setup(){
        //Resis server needs to be running and not protected-mode
        jedis = new Jedis('10.35.16.119')
    }
    @Test
    void connectTest(){
        jedis.set('name', 'Tom')
        String value = jedis.get('name')
        assert value == 'Tom'
    }

    @Test
    void incrementTest(){
        jedis.set('counter', '1')
        jedis.incr('counter')
        jedis.incr('counter')
        assert jedis.get('counter') == '3'
    }
    @Test
    void expirationTest(){
        jedis.set('short lived', '10')
        assert jedis.exists('short lived')
        jedis.expire('short lived', 3)
        Thread.sleep(3000)
        assert jedis.exists('short lived') == false
    }
    @Test
    void listTest(){
        jedis.del('myList')
        jedis.rpush('myList', 'a', 'b', 'c')
        assert 3 == jedis.llen('myList')
        assert 'a' == jedis.lrange('myList', 0,0)[0]
        jedis.lpush('myList', '3', '2', '1')
        assert 6 == jedis.llen('myList')

        jedis.del('myQueue')
        jedis.lpush('myQueue', 'new york')
        jedis.lpush('myQueue', 'dallas')
        jedis.lpush('myQueue', 'tulsa')
        assert 'new york' == jedis.rpop('myQueue')
        assert 'dallas' == jedis.rpop('myQueue')
        assert 'tulsa' == jedis.rpop('myQueue')
    }
}
