package com.example.jnosql.redis;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.jnosql.diana.api.key.BucketManager;
import org.jnosql.diana.api.key.BucketManagerFactory;
import org.jnosql.diana.api.key.KeyValueConfiguration;
import org.jnosql.diana.redis.key.RedisConfiguration;

@ApplicationScoped
public class RedisProducer {

    private static final String BUCKET = "users";

    private KeyValueConfiguration configuration;

    private BucketManagerFactory managerFactory;

    @PostConstruct
    public void init () {
        configuration = new RedisConfiguration();
        managerFactory = configuration.get();
    }

    @Produces
    public BucketManager getManager () {
        return managerFactory.getBucketManager(BUCKET);
    }

}
