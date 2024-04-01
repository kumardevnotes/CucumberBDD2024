package com.stepdefinitions;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {

	int num1, num2, result;

	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(Integer int1, Integer int2) {
		this.num1 = int1;
		this.num2 = int2;
	}

	@When("I add them together")
	public void i_add_them_together() {
		result = num1 + num2;
	}

	@Then("the result should be {int}")
	public void the_result_should_be(Integer expectedResult) {
		Assert.assertEquals(expectedResult == result, true);
	}

	@When("I subtract the second number from the first number")
	public void i_subtract_the_second_number_from_the_first_number() {
		result = num1 - num2;
	}

	@When("I multiply them together")
	public void i_multiply_them_together() {
		result = num1 * num2;
	}

	@When("I divide the first number by the second number")
	public void i_divide_the_first_number_by_the_second_number() {
		result = num1/num2;
	}

}
