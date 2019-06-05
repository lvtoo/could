package com.oouul.calculate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        logger.info("Compute " + a + " + " + b + " = " + r);
        return r;
    }
}
