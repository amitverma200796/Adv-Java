package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class test {
public static void main(String args[])
{
	Configuration conf=new Configuration();
	conf.configure("com/sathya/config/hibernate.cfg.xml");
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
	builder.applySettings(conf.getProperties());
	ServiceRegistry registry=builder.build();
	SessionFactory factory=conf.buildSessionFactory(registry);
	Session session=factory.openSession();
	
	Item item=new Item();
	item.setItemId(555);
	item.setItemName("RedMe");
	item.setPrice(15000);
	Transaction tx=session.beginTransaction();
	session.save(item);
	Object obj=session.load(Item.class, 555);
	Item it=(Item)obj;
	item.setPrice(20000);
	//session.update(item);
	//session.delete(item);
	
	int id=it.getItemId();
	String name=it.getItemName();
	double d=it.getPrice();
	System.out.println(id+" "+name+" "+d);
	
	tx.commit();
	session.close();
	factory.close();
	
}
}
