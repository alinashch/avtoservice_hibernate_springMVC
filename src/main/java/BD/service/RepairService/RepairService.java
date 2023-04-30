package BD.service.RepairService;

import BD.entity.Employee;
import BD.entity.Repair;

import java.util.List;

public interface RepairService {
    public List<Repair> getAlRepair();
    void saveRepair(Repair repair);
    Repair getRepair(int id);

    void deleteRepair(int id);
}
