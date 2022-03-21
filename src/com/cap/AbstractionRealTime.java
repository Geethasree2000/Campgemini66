package com.cap;

interface Mobile{
	public void sendSMS();
	public void calling();
}
class Oppo implements Mobile{
	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send msg to oppo");
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("call to oppo");
		
	}
}
abstract class Abc implements Mobile{
	abstract void brand();
	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send msg");
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("call");
		
	}
}
class Apple extends Abc{

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
		
	}
	
}
public class AbstractionRealTime {

	public static void main(String[] args) {
		Oppo o = new Oppo();
		o.calling();
		o.sendSMS();
		
		Apple a = new Apple();
		a.brand();
		a.calling();
		a.sendSMS();
	}

}
