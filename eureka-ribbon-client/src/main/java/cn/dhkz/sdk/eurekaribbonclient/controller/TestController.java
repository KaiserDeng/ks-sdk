package cn.dhkz.sdk.eurekaribbonclient.controller;

import cn.dhkz.sdk.eurekaribbonclient.Service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaiser·von·d
 * @version 2018/6/6
 */
@RestController
public class TestController {

    @Autowired
    RibbonService service;

    @GetMapping("/hi")
    public String hi() {
        System.out.println();
        return service.hi();
    }

}
