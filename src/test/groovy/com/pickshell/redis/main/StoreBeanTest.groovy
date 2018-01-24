package com.pickshell.redis.main

import com.pickshell.redis.domain.User
import junit.extensions.TestSetup
import org.junit.Before
import org.junit.Test
import redis.clients.jedis.Jedis

class StoreBeanTest {
    Jedis jedis

    @Before
    void setup(){
        //Resis server needs to be running and not protected-mode
        jedis = new Jedis('10.35.16.119')
    }
    @Test
    void storeUseTest(){
        User u = new User(userid:2001,username:'John',password:'12345')
        jedis.hmset(
                "user:$u.userid",
                u.properties.findAll {
                    !['class', 'userid'].contains(it.key)
                }.collectEntries { k,v ->
                    [k, v.toString()]
                }
        )
        def resultMap = jedis.hgetAll("user:$u.userid")
        u.with {
            assert username == resultMap.username
            assert password == resultMap.password
        }
    }

    @Test
    void tempTest(){
        User u = new User(userid:2001,username:'John',password:'12345')
        def result = u.properties.findAll {
            !['class', 'userid'].contains(it.key)
        }.collectEntries { k,v ->
            [k, v.toString()]
        }
        println(result.class)
        println(result)
    }

}
