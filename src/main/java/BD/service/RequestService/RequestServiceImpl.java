package BD.service.RequestService;

import BD.dao.RequestDAO.RequestDAO;
import BD.entity.Employee;
import BD.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class RequestServiceImpl implements RequestService{
    @Autowired
    private RequestDAO requestDAO;
    @Transactional
    @Override
    public List<Request> getAllRequest() {
        return requestDAO.getAllRequest();
    }
    @Transactional

    @Override
    public void saveRequest(Request request) {
        requestDAO.saveRequest(request);
    }
    @Transactional

    @Override
    public Request getRequest(int id) {
        return requestDAO.getRequest(id);
    }
    @Transactional

    @Override
    public void deleteRequest(int id) {
        requestDAO.deleteRequest(id);
    }
    @Transactional
    @Override
    public int CountRequest() {
        return requestDAO.CountRequest();
    }
    @Transactional
    @Override
    public List<Request> getSelectRequest(Request request) {
        return requestDAO.getSelectRequest(request);
    }

    @Transactional
    @Override
    public int[] getIdRep() {
        return requestDAO.getIdRep();
    }


}
