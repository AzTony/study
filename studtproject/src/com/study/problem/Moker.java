package com.study.problem;

import java.sql.SQLException;

public class Moker<T extends Exception> {
	
	
	
	
	private void pleaseThrow(final Exception t)  throws T {
		
		throw (T)t;
	}
	
	
	public static void main(String[] args) {
		try {
			
			new Moker<RuntimeException>().pleaseThrow(new SQLException());
			
		} catch(final SQLException ex) {
			ex.printStackTrace();
		}
		
	}

}
