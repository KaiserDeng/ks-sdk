package cn.dhkz.sdk.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaiser·von·d
 * @version 2018/6/6
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi() {
        return "hi ! i am from port:" + port;
    }
}
