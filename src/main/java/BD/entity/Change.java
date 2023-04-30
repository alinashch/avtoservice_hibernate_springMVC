package BD.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="change")
public class Change {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID_CHANGE")
    private int ID_CHANGE;
    @Column(name="DATE_PRODUCTION")
    private Date DATE_PRODUCTION;
    @Column(name="NAME_DETAIL")
    private String NAME_DETAIL;
    @Column(name="NUMBER_DETAIL")
    private int NUMBER_DETAIL;

    @JoinColumn(name = "id_repair")
    public int   id_repair;

    public int getId_repair() {
        return id_repair;
    }

    public void setId_repair(int id_repair) {
        this.id_repair = id_repair;
    }

    public Change(){}

    public Change(Date DATE_PRODUCTION, String NAME_DETAIL, int NUMBER_DETAIL, int id_repair) {
        this.DATE_PRODUCTION = DATE_PRODUCTION;
        this.NAME_DETAIL = NAME_DETAIL;
        this.NUMBER_DETAIL = NUMBER_DETAIL;
        this.id_repair=id_repair;
    }

    public int getID_CHANGE() {
        return ID_CHANGE;
    }

    public void setID_CHANGE(int ID_CHANGE) {
        this.ID_CHANGE = ID_CHANGE;
    }

    @Override
    public String toString() {
        return "Change{" +
                "ID_CHANGE=" + ID_CHANGE +
                ", DATE_PRODUCTION=" + DATE_PRODUCTION +
                ", NAME_DETAIL='" + NAME_DETAIL + '\'' +
                ", NUMBER_DETAIL=" + NUMBER_DETAIL +
                ", id_repair=" + id_repair +
                '}';
    }

    public Date getDATE_PRODUCTION() {
        return DATE_PRODUCTION;
    }

    public void setDATE_PRODUCTION(Date DATE_PRODUCTION) {
        this.DATE_PRODUCTION = DATE_PRODUCTION;
    }

    public String getNAME_DETAIL() {
        return NAME_DETAIL;
    }

    public void setNAME_DETAIL(String NAME_DETAIL) {
        this.NAME_DETAIL = NAME_DETAIL;
    }

    public int getNUMBER_DETAIL() {
        return NUMBER_DETAIL;
    }

    public void setNUMBER_DETAIL(int NUMBER_DETAIL) {
        this.NUMBER_DETAIL = NUMBER_DETAIL;
    }


}
