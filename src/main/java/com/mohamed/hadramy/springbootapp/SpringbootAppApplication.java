package com.mohamed.hadramy.springbootapp;

import javax.annotation.Resource;

import com.mohamed.hadramy.springbootapp.service.FilesStorageService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAppApplication implements CommandLineRunner {
	
	@Resource
	FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
	}

	@Override
  public void run(String... arg) throws Exception {
    storageService.deleteAll();
    storageService.init();
  }

}
