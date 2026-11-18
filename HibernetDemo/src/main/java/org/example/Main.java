
package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Load environment variables
        Dotenv dotenv = Dotenv.load();

        // Configure Hibernate
        Configuration config = new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .configure();

        // Set database credentials from .env
        config.setProperty("hibernate.connection.url", dotenv.get("DB_URL"));
        config.setProperty("hibernate.connection.username", dotenv.get("DB_USERNAME"));
        config.setProperty("hibernate.connection.password", dotenv.get("DB_PASSWORD"));

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();

        Query query = session.createQuery("select model from Laptop where ram=32");
        List<Laptop> laptops = query.getResultList();

        System.out.println(laptops);

        session.close();
        sf.close();
    }
}
