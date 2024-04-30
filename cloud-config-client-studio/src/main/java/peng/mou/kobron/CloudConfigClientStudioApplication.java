package peng.mou.kobron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigClientStudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientStudioApplication.class, args);
    }

}
