package org.stepdefinition;

import org.frameBase.FrameWork;

import io.cucumber.java.Before;

public class Hooks extends FrameWork{

	@Before
	public void before() {
		chromebrowser();
		urlLaunch("https://www.tecovas.com/");

	}
	
}
