package app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/16.
 */

@RestController
@SpringBootApplication
@RequestMapping("/")
public class ConfigClientApplication {

    @Value("${test.demo.name}")
    private String testDemoName;

    @RequestMapping("")
    public String index(){
        return "config clicent testDemoName="+this.testDemoName+"#";
    }

    public static void main(String [] args){
        SpringApplication.run(ConfigClientApplication.class);
    }
}
