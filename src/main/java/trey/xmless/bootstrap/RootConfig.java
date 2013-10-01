package trey.xmless.bootstrap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DatabaseConfig.class)
@ComponentScan(basePackages = { "trey.xmless.service", "trey.xmless.dao" })
public class RootConfig {

	// @Bean public SomeClass someClass() { return someInstance; }

}
