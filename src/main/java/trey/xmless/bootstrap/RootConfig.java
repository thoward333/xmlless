package trey.xmless.bootstrap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "trey.xmless.service", "trey.xmless.repositories.dao" })
public class RootConfig {

	// @Bean public SomeClass someClass() { return someInstance; }

}
