package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/16.
 */

@RestController
@SpringBootApplication
@EnableConfigServer
@RequestMapping("/")
public class ConfigSreviceApplication {

    @RequestMapping("")
    public String index(){
        return "config server";
    }

    public static void main(String [] args){
        SpringApplication.run(ConfigSreviceApplication.class);
    }
}
