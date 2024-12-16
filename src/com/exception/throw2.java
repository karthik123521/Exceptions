package com.exception;

public class throw2 {

	public static void main(String[] args) throws InvaliedIdException {
		throw2 w=new throw2();
		throw1 throw3=w.getData(3);
		System.out.println(throw3.getId()+throw3.getName());
	}
	
	public throw1 getData(Integer id) throws InvaliedIdException{
		throw1 th=new throw1();
		if (id ==1) {
			th.setId(1);
			th.setName("karthik");
		}else if (id == 2) {
			th.setId(2);
			th.setName("Bhargav");
		}else {
			throw new InvaliedIdException("Sample excepton");
		}
		return th;
		
	}
}
