package com.exception;

public class calculator1 {
	
	public void add(int... x){
		
		int sum=0;
		
		for(int i:x) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
