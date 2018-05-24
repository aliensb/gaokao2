package ku6.tv.gaokao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ku6.tv.gaokao.mapper")
public class GaokaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaokaoApplication.class, args);
	}
}
