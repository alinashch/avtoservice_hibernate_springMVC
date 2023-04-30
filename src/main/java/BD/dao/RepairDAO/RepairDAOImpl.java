package BD.dao.RepairDAO;

import BD.entity.Change;
import BD.entity.Repair;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RepairDAOImpl implements RepairDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Repair> getAlRepair() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Repair.class);
        List<Repair> changes;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            changes=session.createQuery("from Repair ").getResultList();
        }
        return changes;
    }

    @Override
    public void saveRepair(Repair repair) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Repair.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(repair);
        }
    }

    @Override
    public Repair getRepair(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Repair.class);
        Repair change;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            change=session.get(Repair.class,id);
        }
        return change;
    }

    @Override
    public void deleteRepair(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Repair.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            org.hibernate.query.Query<Repair> queue=session.createQuery("delete from Repair where id_repair =:changeId");
            queue.setParameter("changeId", id);
            queue.executeUpdate();
        }
    }
}
