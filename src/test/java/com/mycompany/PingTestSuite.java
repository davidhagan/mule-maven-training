package com.mycompany;

import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;
import org.junit.Assert;
import org.junit.Test;

public class PingTestSuite extends FunctionalTestCase {
	@Test
	public void testThatPingReturnsPong() throws Exception {
		runFlowAndExpect("ping","pong");
	}
	@Test
	public void failingTestThatPingReturnsPang() throws Exception {
		MuleEvent event = runFlow("ping");
		Assert.assertEquals("pang", event.getMessageAsString());
	}
	@Override
	protected String getConfigFile(){
		return "mule-maven-training.xml";
	}
}