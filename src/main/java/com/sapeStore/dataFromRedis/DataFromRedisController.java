package com.sapeStore.dataFromRedis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
public class DataFromRedisController {
	
	@GetMapping("/getISBN")
	public String getISBN() {
		Jedis jedis = connecttoRedis();
		String isbn1 = jedis.get("isbn1");
		return isbn1;
	}

	public Jedis connecttoRedis() {
		Jedis jedis = new Jedis("10.128.0.3");
		jedis.connect();
		jedis.auth("JyUHvS1V5nP8");
		return jedis;
	}
}