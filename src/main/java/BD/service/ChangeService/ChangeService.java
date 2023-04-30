package BD.service.ChangeService;

import BD.entity.Change;

import java.util.List;

public interface ChangeService {
    public List<Change> getAllChange();

    void saveChange(Change Change);

    Change getChange(int id);

    void deleteChange(int id);
    List<Change> getSelectChange(Change change);
    int CountChange();
    int [] getIdRep();

}
