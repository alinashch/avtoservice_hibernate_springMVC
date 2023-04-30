package BD.dao.RequestDAO;

import BD.entity.Repair;
import BD.entity.Request;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class RequestDAOImpl implements RequestDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Request> getAllRequest() {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Request.class);
        List<Request> requests;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
          requests=session.createQuery("from Request ").getResultList();
            for (Request e: requests)
                System.out.println(e);
        }
        return requests;
    }

    @Override
    public void saveRequest(Request request) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Request.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(request);
        }
    }

    @Override
    public Request getRequest(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Request.class);
        Request request;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            request=session.get(Request.class,id);
        }
        return request;
    }

    @Override
    public void deleteRequest(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Request.class);
        Request request;
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            org.hibernate.query.Query<Request> queue=session.createQuery("delete from Request where ID_REQUEST =:employeeId");
            queue.setParameter("employeeId", id);
            queue.executeUpdate();
        }
    }

    @Override
    public int CountRequest() {
        Session session=sessionFactory.getCurrentSession();
        Query<Request> queue=session.createQuery("from Request ", Request.class);
        List<Request> employees=queue.getResultList();
        int i=employees.size();
        return i;
    }

    @Override
    public List<Request> getSelectRequest(Request request) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Request.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Date sqlDate = Date.valueOf("1000-09-09");
            System.out.println(request);
            String s="from Request  where ID_REQUEST=:req and  FIRST_NAME=:first and SECOND_NAME=:sec and THIRD_NAME=: third and TELEPHONE=:tel and REQUEST_DATE=:date and id_repair=:rep";
            System.out.println(s);
            System.out.println(111111);
            if(request.getID_REQUEST()==1){
                s=   s.replace("and", "");

                s=   s.replace("ID_REQUEST=:req", "");
            }
            if(request.getFIRST_NAME().equals("null")){
                s=   s.replace("and", "");

                s=   s.replace("FIRST_NAME=:first", "");
            }
            if(request.getSECOND_NAME().equals("null")){
                s=   s.replace("and", "");
                s=   s.replace("SECOND_NAME=:sec", "");
            }
            if(request.getTHIRD_NAME().equals("null")){
                s=   s.replace("and", "");
                s=  s.replace("THIRD_NAME=: third", "");
            }
            if(request.getTELEPHONE().equals("null")){
                s=   s.replace("and", "");
                s=   s.replace("TELEPHONE=:tel" , "");
            }
            if(request.getREQUEST_DATE().equals(sqlDate)){
                s=   s.replace("and", "");
                s=    s.replace("REQUEST_DATE=:date", "");
            }
            if(request.getId_repair()==1){
                s=  s.replace("and", "");

                s=  s.replace("id_repair=:rep", "");
            }
            System.out.println(s);
            Query<Request>query=session.createQuery(s, Request.class);

            if(request.getID_REQUEST()!=1){
                query.setParameter("req", request.getID_REQUEST());
            }
            if(!request.getFIRST_NAME().equals("null")){
                query.setParameter("first", request.getFIRST_NAME());
            }
            if(!request.getSECOND_NAME().equals("null")){
                query.setParameter("sec", request.getSECOND_NAME());

            }
            if(!request.getTHIRD_NAME().equals("null")){
                query.setParameter("third", request.getTHIRD_NAME());

            }
            if(!request.getTELEPHONE().equals("null")){
                query.setParameter("tel", request.getTELEPHONE());

            }
            if(!request.getREQUEST_DATE().equals(sqlDate)){
                query.setParameter("date", request.getREQUEST_DATE());

            }
            if(request.getId_repair()!=1){
                query.setParameter("rep", request.getId_repair());

            }

            System.out.println(s);

            List<Request>re =query.getResultList();
            for(Request request1:re) {
                System.out.println(request1);
            }
            return re;
        }
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
