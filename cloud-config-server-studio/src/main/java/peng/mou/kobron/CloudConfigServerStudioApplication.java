package peng.mou.kobron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerStudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerStudioApplication.class, args);
    }

}
