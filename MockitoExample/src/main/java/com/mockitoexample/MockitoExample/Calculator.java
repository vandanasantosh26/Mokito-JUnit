package com.mockitoexample.MockitoExample;

public class Calculator {
	Addition a;
	public Calculator(Addition a)
	{
		this.a=a;
	}
	
	public int perform(int i, int j)
	{
		return a.add(i,j)+i;
		
	}

}
