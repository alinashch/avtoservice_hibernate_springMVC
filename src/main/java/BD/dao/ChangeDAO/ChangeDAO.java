package BD.dao.ChangeDAO;


import BD.entity.Change;
import BD.entity.Employee;

import java.util.List;

public interface ChangeDAO {
    public List<Change> getAllChange();

    void saveChange(Change Change);

    Change getChange(int id);

    void deleteChange(int id);

    List<Change> getSelectChange(Change change);
    int CountChange();
    int [] getIdRep();

}
