package com.minisun.javautils.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author minisun
 */
@Controller
public class HelloWordController {
    private static Logger logger = LoggerFactory.getLogger(HelloWordController.class);
    @RequestMapping("/hello")
    public String index(){
        return "welcome to minisun's Java project";
    }
    @RequestMapping(value = "/minisun",method = RequestMethod.GET)
    public String minisun(){
        logger.info("go to minisun");
        return "minisun";
    }
}
