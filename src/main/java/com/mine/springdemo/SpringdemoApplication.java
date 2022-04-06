package com.mine.springdemo;

import com.mine.springdemo.game.GameRunner;
import com.mine.springdemo.game.GamingConsole;
import com.mine.springdemo.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);

		//GamingConsole game = context.getBean(MarioGame.class);

		GameRunner runner = context.getBean(GameRunner.class);

		runner.runGame();
	}

}
