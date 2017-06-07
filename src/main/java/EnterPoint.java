import org.hibernate.Session;
import ru.antony.entity.User;
import ru.antony.persistence.HibernateUtil;

/**
 * Created by Antony on 07.06.2017.
 */
public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Antony");
        user.setLastName("Smith");

        session.save(user);
        session.getTransaction().commit();
    }
}
