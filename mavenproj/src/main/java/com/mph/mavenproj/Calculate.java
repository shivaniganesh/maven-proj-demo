package com.mph.mavenproj;

public class Calculate {

	public int add(int... number)
	{
		int result=0;
		
		for(int i: number)
		{
			result =result+i;
		}
		
		return result;
	}
	
	public int multiply(int...number)
	{
		int result = 1;
		for(int i: number)
		{
			result = result*i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));
		System.out.println(c.add(10,10,20,30));

	}

	public int divide() {
		// TODO Auto-generated method stub
		int i = 1/1;
		return i;
		
	}

}