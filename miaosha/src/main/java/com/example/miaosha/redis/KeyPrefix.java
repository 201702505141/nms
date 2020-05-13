package com.example.miaosha.redis;

public interface KeyPrefix {
    public int expireSecconds();
    public String getPrefix();
}
