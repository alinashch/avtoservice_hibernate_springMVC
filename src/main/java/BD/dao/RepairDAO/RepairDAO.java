package BD.dao.RepairDAO;

import BD.entity.Repair;

import java.util.List;

public interface RepairDAO {
    public List<Repair> getAlRepair();
    void saveRepair(Repair repair);
    Repair getRepair(int id);

    void deleteRepair(int id);

}
