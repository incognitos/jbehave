package org.incognitos.jbehave_demo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WithdrawCashFromBank extends BaseStory {
	private final Logger logger = LoggerFactory.getLogger(WithdrawCashFromBank.class);
	
	@Given("I\u2019m a <user_type>")
	public void setUserType(@Named("user_type") String user){
		logger.info("Setting user type: {}",user);
	}
	@Given("I have a valid account type <yes/no>")
	public void isValidAccountType(@Named("yes/no") String isValid ){
	  logger.info("isValid: {}",isValid);
	}
}
