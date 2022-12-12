package org.kira.lean.web.conf.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/10 22:34
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class RedisSessionConfig {
}