package com.example.demo.xyqq;

import com.xyqq.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: HelloController
 * Package: com.example.demo.xyqq
 * description:
 *
 * @author lzq
 * @version 1.0
 * @date 2023/5/8 14:52
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    HelloService helloService;
    @PostMapping (value = "/test")
    public void test(){
        System.out.println(helloService.sayHello("xyqq"));
    }

}
