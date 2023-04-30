package BD.service.RepairService;

import BD.dao.RepairDAO.RepairDAO;
import BD.entity.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class RepairServiceImpl implements RepairService{
    @Autowired
    private RepairDAO repairDAO;
    @Transactional
    @Override
    public List<Repair> getAlRepair() {
        return repairDAO.getAlRepair();
    }
    @Transactional
    @Override
    public void saveRepair(Repair repair) {
        repairDAO.saveRepair(repair);
    }
    @Transactional
    @Override
    public Repair getRepair(int id) {
        return repairDAO.getRepair(id);
    }
    @Transactional
    @Override
    public void deleteRepair(int id) {
        repairDAO.deleteRepair(id);
    }
}
