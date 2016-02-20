/**
 * 
 */
package com.hhx.designpattern.prototype;

/**
 * @author hexin
 *
 */
public class Prototype implements Cloneable{

	/* 浅复制 */  
    public Object clone() throws CloneNotSupportedException {  
        Prototype proto = (Prototype) super.clone();  
        return proto;  
    }  
    
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Prototype type = new Prototype();
		Prototype typeClone = (Prototype) type.clone();
		System.out.println(type==typeClone);
	}

}
