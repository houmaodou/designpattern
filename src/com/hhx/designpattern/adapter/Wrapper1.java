/**
 * 
 */
package com.hhx.designpattern.adapter;

/**
 * @author hexin
 *
 */
public class Wrapper1 implements Targetable{
	
private Source source;

public Wrapper1(Source source){
	this.source =  source;
}

public void method2(){
	System.out.println("this is the targetable method!");  	
}

@Override
public void method1() {
	// TODO Auto-generated method stub
	source.method1();
}

}
