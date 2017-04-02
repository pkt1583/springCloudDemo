package com.pkt.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class AuthenticationController {
    protected Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    private Environment environment;

    @RequestMapping(path = "/authenticate/{userId}/{password}", method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "fallBackReturn")  //This need to be monitored for circuit breaker. The request forwared from Zuul
    public boolean isAllowed(@PathVariable("userId") String userId,@PathVariable("password")String password){
       logger.info("Found user id to authenticate "+userId+" annd password is "+password);
        String configuredPass=environment.getProperty(userId);
        if(password.equals(configuredPass)){
            return true;
        }
        return false;
    }

    public boolean fallBackReturn(String username,String password){
        logger.info("The service execution failed. PLease try again");
        return false;
    }
}
