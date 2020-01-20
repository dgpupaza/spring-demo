package ro.appvalue.patterns.springdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "text/plain")
    public String hello() {
        String hostname = null;
        try {
            hostname = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            hostname = "unknown";
        }
        
        return "Spring Boot, hello from " + hostname;
    }
    
}
