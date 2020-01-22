package info.pritish.utils.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
public class MyServiceTest {

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() {
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}
