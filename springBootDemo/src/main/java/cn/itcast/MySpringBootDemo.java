package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class MySpringBootDemo {
	
	public static void main(String[] args) {
		//项目入库
		SpringApplication.run(MySpringBootDemo.class, args);
	}

}
