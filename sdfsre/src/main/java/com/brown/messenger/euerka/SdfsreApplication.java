package com.brown.messenger.euerka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.brown.messenger.dto.UserDTO;

import com.brown.messenger.entity.User;
import com.brown.messenger.service.UserService;

@SpringBootApplication(scanBasePackageClasses = {UserService.class})
@PropertySource("classpath:message.properties")
@EntityScan(basePackageClasses = User.class)
@EnableJpaRepositories("com.brown.messenger.repo")
public class SdfsreApplication implements CommandLineRunner{

	@Autowired
	Environment environment;
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SdfsreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
		List<UserDTO> userlist = userService.getUsers();
		for(UserDTO user : userlist) {
			System.out.println(user.getName());
		}
	}

	
}
