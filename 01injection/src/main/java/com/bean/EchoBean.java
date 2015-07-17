package com.bean;

public class EchoBean {

	int num;
	String name;
	
	public EchoBean(int n,String na){
		System.out.println("(int n,String na)생성자"+n+"\t"+na);
		num=n;
		name=na;
	}
	
	
	//construction injection
	public EchoBean(int n){
	System.out.println("EchoBean(int n)생성자"+n);
		num=n;
	}
	
	public EchoBean() {
		super();


		System.out.println("EchoBean생성자");
	}
	
	public String sayEcho(String mesg){
		return "Hello"+mesg;
	}
	

}
