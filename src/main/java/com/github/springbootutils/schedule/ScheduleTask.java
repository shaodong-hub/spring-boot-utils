package com.github.springbootutils.schedule;

import com.sun.javafx.runtime.SystemProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 15:54 2019-04-15
 * 项目名称 spring-boot-utils
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Component
@EnableScheduling
public class ScheduleTask {

    @Resource
    private RestTemplate restTemplate;

    @Scheduled(fixedRate = 1000)
    public void task() {

        String url = "www.baidu.com";
        String string = String.format("http://%s", url);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(string, String.class);
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());



    }

}
