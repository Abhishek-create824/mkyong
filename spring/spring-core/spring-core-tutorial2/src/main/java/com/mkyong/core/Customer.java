package com.mkyong.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	@Value("#{itemBean}")
	private Item item;

	@Value("#{itemBean.name}")
	private String itemName;

	@Value("#{addressBean}")
	private Address address;

	@Value("#{addressBean.country}")
	private String country;

	@Value("#{addressBean.getFullAddress('mkyong')}")
	private String fullAddress;

	@Value("#{'mkyong'.toUpperCase()}")
	private String name;

	@Value("#{priceBean.getSpecialPrice()}")
	private double amount;

	// Relational operators
	@Value("#{1 == 1}")
	private boolean testEqual;// true

	@Value("#{1 != 1}")
	private boolean testNotEqual;// false

	@Value("#{1 < 1}")
	private boolean testLessThan;// false

	@Value("#{1 <= 1}")
	private boolean testLessThanOrEqual;// true

	@Value("#{1 > 1}")
	private boolean testGreaterThan;// false

	@Value("#{1 >= 1}")
	private boolean testGreaterThanOrEqual;// true

	// Logical operators , numberBean.no == 999
	@Value("#{numberBean.no == 999 and numberBean.no < 900}")
	private boolean testAnd;// false

	@Value("#{numberBean.no == 999 or numberBean.no < 900}")
	private boolean testOr;// true

	@Value("#{!(numberBean.no == 999)}")
	private boolean testNot;// false

	// Mathematical operators
	@Value("#{1 + 1}")
	private double testAdd;// 2.0

	@Value("#{'1' + '@' + '1'}")
	private String testAddString;// 1@1

	@Value("#{1 - 1}")
	private double testSubtraction;// 0.0

	@Value("#{1 * 1}")
	private double testMultiplication;// 1.0

	@Value("#{10 / 2}")
	private double testDivision;// 5.0

	@Value("#{10 % 10}")
	private double testModulus;// 0.0

	@Value("#{2 ^ 2}")
	private double testExponentialPower;// 4.0

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name = " + getName()
				+ ", amount = " + getAmount() + ", item = " + getItem()
				+ ", itemName = " + getItemName() + ", address = "
				+ getAddress() + ", country = " + getCountry()
				+ ", fullAddress = " + getFullAddress() + ", testEqual="
				+ isTestEqual() + ", testNotEqual=" + isTestNotEqual()
				+ ", testLessThan=" + isTestLessThan()
				+ ", testLessThanOrEqual=" + isTestLessThanOrEqual()
				+ ", testGreaterThan=" + isTestGreaterThan()
				+ ", testGreaterThanOrEqual=" + isTestGreaterThanOrEqual()
				+ ", testAnd=" + isTestAnd() + ", testOr=" + isTestOr()
				+ ", testNot=" + isTestNot() + ", testAdd=" + getTestAdd()
				+ ", testAddString=" + getTestAddString()
				+ ", testSubtraction=" + getTestSubtraction()
				+ ", testMultiplication=" + getTestMultiplication()
				+ ", testDivision=" + getTestDivision() + ", testModulus="
				+ getTestModulus() + ", testExponentialPower="
				+ getTestExponentialPower() + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isTestEqual() {
		return testEqual;
	}

	public void setTestEqual(boolean testEqual) {
		this.testEqual = testEqual;
	}

	public boolean isTestNotEqual() {
		return testNotEqual;
	}

	public void setTestNotEqual(boolean testNotEqual) {
		this.testNotEqual = testNotEqual;
	}

	public boolean isTestLessThan() {
		return testLessThan;
	}

	public void setTestLessThan(boolean testLessThan) {
		this.testLessThan = testLessThan;
	}

	public boolean isTestLessThanOrEqual() {
		return testLessThanOrEqual;
	}

	public void setTestLessThanOrEqual(boolean testLessThanOrEqual) {
		this.testLessThanOrEqual = testLessThanOrEqual;
	}

	public boolean isTestGreaterThan() {
		return testGreaterThan;
	}

	public void setTestGreaterThan(boolean testGreaterThan) {
		this.testGreaterThan = testGreaterThan;
	}

	public boolean isTestGreaterThanOrEqual() {
		return testGreaterThanOrEqual;
	}

	public void setTestGreaterThanOrEqual(boolean testGreaterThanOrEqual) {
		this.testGreaterThanOrEqual = testGreaterThanOrEqual;
	}

	public boolean isTestAnd() {
		return testAnd;
	}

	public void setTestAnd(boolean testAnd) {
		this.testAnd = testAnd;
	}

	public boolean isTestOr() {
		return testOr;
	}

	public void setTestOr(boolean testOr) {
		this.testOr = testOr;
	}

	public boolean isTestNot() {
		return testNot;
	}

	public void setTestNot(boolean testNot) {
		this.testNot = testNot;
	}

	public double getTestAdd() {
		return testAdd;
	}

	public void setTestAdd(double testAdd) {
		this.testAdd = testAdd;
	}

	public String getTestAddString() {
		return testAddString;
	}

	public void setTestAddString(String testAddString) {
		this.testAddString = testAddString;
	}

	public double getTestSubtraction() {
		return testSubtraction;
	}

	public void setTestSubtraction(double testSubtraction) {
		this.testSubtraction = testSubtraction;
	}

	public double getTestMultiplication() {
		return testMultiplication;
	}

	public void setTestMultiplication(double testMultiplication) {
		this.testMultiplication = testMultiplication;
	}

	public double getTestDivision() {
		return testDivision;
	}

	public void setTestDivision(double testDivision) {
		this.testDivision = testDivision;
	}

	public double getTestModulus() {
		return testModulus;
	}

	public void setTestModulus(double testModulus) {
		this.testModulus = testModulus;
	}

	public double getTestExponentialPower() {
		return testExponentialPower;
	}

	public void setTestExponentialPower(double testExponentialPower) {
		this.testExponentialPower = testExponentialPower;
	}

}