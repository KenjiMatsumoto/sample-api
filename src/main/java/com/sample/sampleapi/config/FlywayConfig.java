package com.sample.sampleapi.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.*;

@Configuration
public class FlywayConfig {

	@Bean
	public FlywayMigrationStrategy strategy() {
		return flyway -> {
			flyway.clean();
			flyway.migrate();
		};
	}
}
