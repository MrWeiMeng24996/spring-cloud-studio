package peng.mou.kobron.defaultpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import peng.mou.kobron.defaultpackage.service.MaoZedongService;

import javax.annotation.Resource;

@RestController
public class MaoZedongController {

    @Autowired
    MaoZedongService maoZedongService;
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/MaoZedongJMeterTest")
    public String MaoZedongJMeterTest() throws InterruptedException {

        Thread.sleep(3000);
        return "This is MaoZedongJMeterTest....";
    }

    @GetMapping("/MaoZedongControllerDefaultMethod")
    public String MaoZedongControllerDefaultMethod() {

        return maoZedongService.MaoZedongServiceDefaultMethod();
    }

    @GetMapping("/consumeRestTemplate")
    public String consumeRestTemplate() {
        String url = "http://192.168.1.9:8080/PengMouController";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        return forEntity.getBody();
    }

    @GetMapping("/consumeRestTemplateByServiceName")
    public String consumeRestTemplateByServiceName() {
        String url = "http://peng-mou/PengMouController";
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }
}
