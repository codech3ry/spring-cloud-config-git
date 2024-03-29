package com.example.springcloudconfiggit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigGitApplication.class, args);
    }

}
