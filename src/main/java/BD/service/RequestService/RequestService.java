package BD.service.RequestService;

import BD.entity.Employee;
import BD.entity.Request;

import java.util.List;

public interface RequestService {
    public List<Request> getAllRequest();
    void saveRequest(Request request);
    Request getRequest(int id);

    void deleteRequest(int id);

    int CountRequest();
    List<Request> getSelectRequest(Request request);
    int [] getIdRep();
}
