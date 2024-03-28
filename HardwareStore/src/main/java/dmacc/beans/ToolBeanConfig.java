package dmacc.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.model.Tool;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Mar 26, 2024
 */

@Configuration
public class ToolBeanConfig {
	
	@Bean
	public Tool tool() {
		
		Tool t = new Tool();
		
		return t;
		
	}


}
