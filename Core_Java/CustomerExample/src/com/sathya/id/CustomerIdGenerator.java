package com.sathya.id;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public  class CustomerIdGenerator implements IdentifierGenerator {
public Serializable generate(SessionImplementor si, Object obj )throws HibernateException
{
	
	String id="";
	try
	{
		Connection con=si.connection();
		Statement stmt=con.createStatement();
		String sql="select customer_sequence.nextval from dual";
		ResultSet rs=stmt.executeQuery(sql);
		rs.next();
		int i=rs.getInt(1);
		if(i<=9)
		{
		id="C00"+i;
		}
	    else if(i>9&&i<=99)
	    {
			id="C0"+i;
	    }
	    else
	    {
	    	id="C"+i;
	    }
		stmt.close();
		rs.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return id;

		
		
	}
	
	
	
}
