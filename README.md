# jnosql-redis-example

jnosql-redis-example has sample code with integration between Redis and JNoSQL framework.


## Redis
![Redis Project](https://jnosql.github.io/img/logos/redis.png)


**Redis**: Redis is a software project that implements data structure servers. It is open-source, networked, in-memory, and stores keys with optional durability.

### How To Install

Once this is a communication layer to Redis, we're using integration test, so you need to install Redis. The recommended way is using Docker.

![Docker](https://www.docker.com/sites/default/files/horizontal_large.png)


1. Install docker: https://www.docker.com/
1. https://store.docker.com/images/redis
1. Run docker command
1. `docker run --name redis-instance -p 6379:6379 -d redis`


#### Demo code


* Main sample using KeyValueTemplate
* Main2 sample using Repository
* Main3 sample with List
* Main4 sample with Set
* Main5 sample with Queue
* Main6 sample with Map
 
 