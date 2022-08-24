package org.Stepdefenition;

import java.io.IOException;

import org.base.UtilityClass;
import org.junit.BeforeClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class Hooks extends UtilityClass {

	@BeforeClass
	public void bef() {
		System.out.println("before the scenario");
		

	}

	@After
	public void aft (Scenario s) throws IOException {
		System.out.println("After the scenario ScreenshotTaken");
		
		String name = s.getName();
		
		screenShot(name);
	}
	

}
