package hello.aop;

import hello.aop.order.aop.AspectV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(AspectV1.class)
//@Import(AspectV2.class)
@Import(AspectV3.class)
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

}
