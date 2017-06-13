/**
 * 
 */
package io.blackground.jobfinder.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author yotti
 *
 */


public class HibernateUtil {

    private static SessionFactory sessionFactory;

    Configuration configuration = new Configuration().configure();
    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
    applySettings(configuration.getProperties());
    SessionFactory factory = configuration.buildSessionFactory(builder.build());

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutDown(){
        //closes caches and connections
        getSessionFactory().close();
    }
}
