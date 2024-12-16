package com.exception2;

import com.exception.calling;

public class packagecalling {
	public static void main(String[] args) {
		calling.m1();
		calling.m2();
		calling c=new calling();
		c.m3();
		c.m4();
	}
	public void m(){
		calling c=new calling();
		c.m5();
		calling.m1();
	}

}
