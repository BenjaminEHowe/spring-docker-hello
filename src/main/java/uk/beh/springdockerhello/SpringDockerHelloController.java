package uk.beh.springdockerhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SpringDockerHelloController {

    Logger logger = LoggerFactory.getLogger(SpringDockerHelloController.class);

    @RequestMapping("/hello/{name}")
    public String helloDocker(@PathVariable(value = "name") String name) {
        String response = "Hello " + name + "! (response sent " + new Date() + ")";
        logger.info(response);
        return response;
    }
}
