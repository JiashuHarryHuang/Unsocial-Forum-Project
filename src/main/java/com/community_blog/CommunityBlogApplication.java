package com.community_blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CommunityBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityBlogApplication.class, args);
		log.info("项目启动");
	}

}
