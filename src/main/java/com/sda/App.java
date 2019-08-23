package com.sda;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Customer customer=new Customer();
        aOrder order=new aOrder();
        OrderLine orderLine=new OrderLine();
        Product product=new Product();
        Transaction transaction=null;
        try {
            transaction = session.beginTransaction();
            session.save(customer);
            session.save(order);
            session.save(orderLine);
            session.save(product);
            transaction.commit();
        }catch (Exception e){
                if (transaction!=null){
                    transaction.rollback();
                }
        }
        finally {
    if(session!=null){
session.close();
    }
        }





    }
}
