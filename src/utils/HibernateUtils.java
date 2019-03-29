package utils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public final class HibernateUtils {
	public static SessionFactory sessionFactory;
        public static Session session;
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	static{
		Configuration cfg = new Configuration().configure();
		//注：Hibernate4已经废弃了原先获得sessionfactory的方法：buidSessionFactory(),改用下面的方式获得
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();  
        sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
}
