package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
			System.out.println("I successfully executed listeners Pass code");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
			
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
			System.out.println("I failed executed Listeners Pass Code" + result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
			
	}
	
	public void onTestFailedButWithSuccessPercentage(ITestResult result) {
			
	}
	
	public void onStart(ITestResult result) {
			
	}
	
	
}
