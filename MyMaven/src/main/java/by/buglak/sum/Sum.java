package by.buglak.sum;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import by.buglak.tests.Test1;

public class Sum {
	
	public static void main(String []args){

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {Test1.class});
		testng.addListener(tla);
		testng.run();
	}
	
	public static int TestSum(int a,int b){
		return a+b;
	}
}
