package com.bjit.gymsystem.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    public boolean set(String key,Object value){
        ValueOperations<String,Object> vo=redisTemplate.opsForValue();
        vo.set(key,value);
        return true;
    }
    public Object get(String key){
        ValueOperations<String,Object> vo=redisTemplate.opsForValue();
        return vo.get(key);
    }
}
