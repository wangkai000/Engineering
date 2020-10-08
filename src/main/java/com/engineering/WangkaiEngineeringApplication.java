package com.engineering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//SpringBootApplication 标注类是一个spring boot 应用 启动类下面所有资源被倒入 开启自动配置
@SpringBootApplication
public class WangkaiEngineeringApplication {


	public static void main(String[] args) {
		System.out.println("______start");

		//将springboot 应用启动 参数1 传入入口类 参数2 mian 函数主题
		SpringApplication.run(WangkaiEngineeringApplication.class, args);
	}

}
