package peng.mou.kobron.openfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "peng-mou")
@Component
public interface MaoZedongFeignService {

    @GetMapping("/OpenFeignControllerProviderMethod")
    String defaultMethodTT();
}
