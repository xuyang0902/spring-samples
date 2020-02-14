package com.my2.redis.up;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xu.qiang
 * @date 20/2/14
 */
@ConfigurationProperties(prefix = "my2.redis")
public class My2RedisProperties {


    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
