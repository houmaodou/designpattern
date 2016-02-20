/**
 * 
 */
package com.hhx.designpattern.factory;

/**
 * @author hexin
 *
 */
public class MailFactory implements Provider {

	/* (non-Javadoc)
	 * @see com.hhx.designpattern.factory.Provider#produce()
	 */
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SMSSender();
	}

}
