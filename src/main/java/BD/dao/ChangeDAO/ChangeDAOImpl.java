package BD.dao.ChangeDAO;

import BD.entity.Change;
import BD.entity.Repair;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class ChangeDAOImpl implements  ChangeDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Change> getAllChange() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Change.class);
        List<Change> changes;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            changes=session.createQuery("from Change ").getResultList();
        }
        return changes;
    }

    @Override
    public void saveChange(Change Change) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Change.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            System.out.println(Change);
            session.save(Change);
        }
    }

    @Override
    public Change getChange(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Change.class);
        Change change;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
             session.beginTransaction();
             change=session.get(Change.class,id);
        }
        return change;
    }

    @Override
    public void deleteChange(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Change.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            org.hibernate.query.Query<Change> queue=session.createQuery("delete from Change where ID_CHANGE =:changeId");
            queue.setParameter("changeId", id);
            queue.executeUpdate();
        }
    }

    @Override
    public List<Change> getSelectChange(Change change) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Change.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Date sqlDate=Date.valueOf("1000-09-09");

            String s="from Change where ID_CHANGE=:change and DATE_PRODUCTION=:date and NAME_DETAIL=:name and NUMBER_DETAIL=: num and id_repair=:repair";
            System.out.println(s);
            System.out.println(change);
            if(change.getID_CHANGE()==1){
              s=  s.replace("ID_CHANGE=:change and", "");
            }
            if(change.getDATE_PRODUCTION().equals(sqlDate)){
                s=  s.replace("DATE_PRODUCTION=:date and ", "");
            }
            if(change.getNAME_DETAIL().equals("null")){
                s=  s.replace("NAME_DETAIL=:name and", "");
            }
            if(change.getNUMBER_DETAIL()==0){
                s=   s.replace("NUMBER_DETAIL=: num and", "");
            }
            if(change.getId_repair()==1){
                s=   s.replace("and", "");
                s=   s.replace(" id_repair=:repair", "");
            }

            System.out.println(s);
            Query<Change> query=session.createQuery(s, Change.class);

            if(change.getID_CHANGE()!=1){
                query.setParameter("change", change.getID_CHANGE());
            }
            if(!change.getDATE_PRODUCTION().equals(sqlDate)){
                query.setParameter("date", change.getDATE_PRODUCTION());
            }
            if(!change.getNAME_DETAIL().equals("null")){
                query.setParameter("name", change.getNAME_DETAIL());
            }
            if(change.getNUMBER_DETAIL()!=0){
                query.setParameter("num", change.getNAME_DETAIL());
            }
            if(change.getId_repair()!=1){
                query.setParameter("repair", change.getId_repair());
            }
            System.out.println(s);
            List<Change> res=query.getResultList();
            for(Change change2:res){
                System.out.println(change2);
            }
            session.close();
            return res;
        }
    }

    @Override
    public int CountChange() {
        Session session=sessionFactory.getCurrentSession();
        Query<Change> queue=session.createQuery("from Change ", Change.class);
        List<Change> employees=queue.getResultList();
        int i=employees.size();
        return i;
    }
@Override
    public int [] getIdRep(){
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Repair.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            List<Repair> changes;
            changes=session.createQuery("from Repair  ").getResultList();
            int [] arr=new int[changes.size()];
            int i=0;
            for(Repair r:changes){
                arr[i]=r.getId_repair();
                i++;
            }
            return arr;
        }
    }

}
