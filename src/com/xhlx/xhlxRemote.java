package com.xhlx;

import javax.ejb.EJBObject;

public interface xhlxRemote extends EJBObject {

	public String showTime(String... args);
	
}
