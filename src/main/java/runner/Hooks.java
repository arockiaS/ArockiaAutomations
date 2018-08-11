package runner;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void before(Scenario Sc) {
		System.out.println(Sc.getName());
		System.out.println(Sc.getId());
	}
	
	@After
	public void after(Scenario Sc) {
		System.out.println(Sc.getStatus());
		System.out.println(Sc.isFailed());
	}
}
