package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Util {
    private static SessionFactory sessionFactory;

    static {
        try {
            Configuration config = new Configuration();

            config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/test_schema");
            config.setProperty("hibernate.connection.username", "root");
            config.setProperty("hibernate.connection.password", "root");
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.hbm2ddl.auto", "update");

            config.addAnnotatedClass(User.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties())
                    .build();
            sessionFactory = config.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
