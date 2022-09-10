package com.cdn.udemyphotoappapiaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UdemyPhotoAppApiAccountssApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyPhotoAppApiAccountssApplication.class, args);
    }

}
