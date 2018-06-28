package cn.dhkz.sdk.eurekaribbonclient.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author kaiser·von·d
 * @version 2018/6/6
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hi() {
        return restTemplate.getForObject("http://eureka-client/hi", String.class);
    }
}
