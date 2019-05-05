package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Customer;

public class Test {

	public static void main(String[] args) {
		
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
		ServiceRegistry registry=builder.build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		Session session =factory.openSession();
		
		Customer c=new Customer();
		
		c.setCustomerName("Amit");
		c.setCity("Lucknow");
		Transaction tx =session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();
		factory.close();

	}

}
