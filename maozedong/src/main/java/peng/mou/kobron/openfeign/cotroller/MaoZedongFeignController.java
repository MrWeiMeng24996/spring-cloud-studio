package peng.mou.kobron.openfeign.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import peng.mou.kobron.openfeign.service.MaoZedongFeignService;

import javax.annotation.Resource;

@RestController
public class MaoZedongFeignController {

    @Resource
    MaoZedongFeignService maoZedongFeignService;

    @GetMapping("/maoZedongFeignController")
    public String maoZedongFeignController() {
        System.out.println("fuyfikujh");
        return maoZedongFeignService.defaultMethodTT();
    }
}
