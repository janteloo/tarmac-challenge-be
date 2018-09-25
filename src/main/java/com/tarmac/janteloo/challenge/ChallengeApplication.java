package com.tarmac.janteloo.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication implements ApplicationRunner {

	@Autowired
	private DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		dataLoader.loadWorkerData();
	}
}
