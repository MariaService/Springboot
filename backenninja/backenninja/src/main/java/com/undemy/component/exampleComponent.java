package com.undemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ExampleComponent")
public class exampleComponent {

	public static final  Log LOG= LogFactory.getLog(exampleComponent.class);
	
	public void sayHello() {
		LOG.info("HELLO FROM EXAMPLECOMPONENT");
	}

}
