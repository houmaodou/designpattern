/**
 * 
 */
package com.hhx.designpattern.factory;

/**
 * @author hexin
 *
 */
public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sender sender = SenderFactory.produceMailSender();
       sender.send();
       
       Provider p = new SMSFactory();
       Sender sender1 = p.produce();
       sender1.send();
    		  
	}

}
