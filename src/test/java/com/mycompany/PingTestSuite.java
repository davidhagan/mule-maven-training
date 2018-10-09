package com.mycompany;

import org.mule.tck.junit4.FunctionalTestCase;
import org.junit.Assert;
import org.junit.Test;

public class PingTestSuite extends FunctionalTestCase {
	@Test
	public void testThatPingReturnsPong() throws Exception {
		runFlowAndExpect("ping","pong");
	}
	@Override
	protected String getConfigFile(){
		return "mule-maven-training.xml";
	}
}