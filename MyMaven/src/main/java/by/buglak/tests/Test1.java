package by.buglak.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import by.buglak.sum.Sum;

public class Test1 {

	@Test
	public void test1(){
		Assert.assertEquals(Sum.TestSum(2, 2), 4);
	}
}
