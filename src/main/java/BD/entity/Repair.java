package BD.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

@Entity
@Table(name="repair")
public class Repair {

    public int getId_repair() {
        return id_repair;
    }

    public void setId_repair(int id_repair) {
        this.id_repair = id_repair;
    }

    public Date getRepair_date() {
        return repair_date;
    }

    public void setRepair_date(Date repair_date) {
        this.repair_date = repair_date;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_repair")
    private int id_repair;

    @Column(name = "repair_date")
    private Date repair_date;

    @Override
    public String toString() {
        return "Repair{" +
                "id_repair=" + id_repair +
                ", repair_date=" + repair_date +
                '}';
    }

    public Repair(){

    }
    public Repair( Date repair_date){

        this.repair_date=repair_date;
    }


}
