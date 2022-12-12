package org.kira.lean.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/10 20:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KiraWebApplicationTest {


    @Resource
    private RedisTemplate<String, String> stringRedisTemplate;

    @Test
    public void contextLoads() throws Exception {
    }


}