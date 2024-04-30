package peng.mou.kobron.hystrixtest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @HystrixCommand(fallbackMethod = "fallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
            , @HystrixProperty(name = "execution.isolation.semaphore.maxConcurrentRequests", value = "2000")
            , @HystrixProperty(name = "circuitBreaker.enabled", value = "false")
    })
    @GetMapping("/normalMethod")
    public String normalMethod() throws InterruptedException {
//        int i = 7/0;
        Thread.sleep(300);
        return "现在是正常的方法返回";
    }

    @HystrixCommand(fallbackMethod = "fallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
            , @HystrixProperty(name = "execution.isolation.semaphore.maxConcurrentRequests", value = "2000")
//            ,@HystrixProperty(name = "circuitBreaker.enabled",value = "true")
    })
    @GetMapping("/circuitBreakerEnabled")
    public String circuitBreakerEnabled() throws InterruptedException {
//        int i = 7/0;
        Thread.sleep(300);
        return "This is circuitBreakerEnabled 属于正常方法返回";
    }

    public String fallBack() {
        return "卧槽现在服务降级啦！！！";
    }
}
