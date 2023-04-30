package BD.service.ChangeService;

import BD.dao.ChangeDAO.ChangeDAO;
import BD.dao.EmployeeDAO.EmployeeDAO;
import BD.entity.Change;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChangeServiceImpl implements  ChangeService{

    @Autowired
    private ChangeDAO changeDAO;

    @Override
    @Transactional
    public List<Change> getAllChange() {
        return changeDAO.getAllChange();
    }

    @Override
    @Transactional
    public void saveChange(Change Change) {
        changeDAO.saveChange(Change);
    }

    @Override
    @Transactional
    public Change getChange(int id) {
        return changeDAO.getChange(id);
    }

    @Override
    @Transactional
    public void deleteChange(int id) {
        changeDAO.deleteChange(id);
    }

    @Transactional
    @Override
    public List<Change> getSelectChange(Change change) {
       return changeDAO.getSelectChange(change);
    }

    @Transactional
    @Override
    public int CountChange() {
        return changeDAO.CountChange();
    }

    @Transactional
    @Override
    public int[] getIdRep() {
        return changeDAO.getIdRep();
    }


}
