package peng.mou.kobron.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")//这是git上yml配置文件中的键值对
    String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){

        return  configInfo;
    }
}
