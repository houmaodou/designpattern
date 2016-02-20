/**
 * 
 */
package com.hhx.designpattern.factory;

/**
 * @author hexin
 *
 */
public class SenderFactory {
	
public static Sender produceSMSSender(){
	return new SMSSender();
}

public static Sender produceMailSender(){
	return new MailSender();
}

}
