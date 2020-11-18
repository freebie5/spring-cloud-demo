package org.sy.springclouddemo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套  客户端   负载均衡  的工具。
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
//        return new RetryRule();
        return new RandomRule();
    }

}
