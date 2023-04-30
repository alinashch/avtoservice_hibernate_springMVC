package BD.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="request")
public class Request {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID_REQUEST")
    private int ID_REQUEST;
    @Column(name = "FIRST_NAME")
    private String FIRST_NAME;
    @Column(name = "SECOND_NAME")
    private String SECOND_NAME;
    @Column(name = "THIRD_NAME")
    private String THIRD_NAME;
    @Column(name = "TELEPHONE")
    private String TELEPHONE;
    @Column(name = "REQUEST_DATE")
    private Date REQUEST_DATE;

    @JoinColumn(name = "id_repair")
    private int id_repair;
    public Request() {

    }

    public Request(String FIRST_NAME, String SECOND_NAME, String THIRD_NAME, String TELEPHONE, Date REQUEST_DATE, int id_repair) {
        this.FIRST_NAME = FIRST_NAME;
        this.SECOND_NAME = SECOND_NAME;
        this.THIRD_NAME = THIRD_NAME;
        this.TELEPHONE = TELEPHONE;
        this.REQUEST_DATE = REQUEST_DATE;
        this.id_repair = id_repair;
    }

    @Override
    public String toString() {
        return "Request{" +
                "ID_REQUEST=" + ID_REQUEST +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", SECOND_NAME='" + SECOND_NAME + '\'' +
                ", THIRD_NAME='" + THIRD_NAME + '\'' +
                ", TELEPHONE='" + TELEPHONE + '\'' +
                ", REQUEST_DATE=" + REQUEST_DATE +
                ", id_repair=" + id_repair +
                '}';
    }

    public int getId_repair() {
        return id_repair;
    }

    public void setId_repair(int id_repair) {
        this.id_repair = id_repair;
    }

    public Request(int ID_REQUEST, String FIRST_NAME, String SECOND_NAME, String THIRD_NAME, String TELEPHONE, Date REQUEST_DATE, int id_repair) {
        this.ID_REQUEST = ID_REQUEST;
        this.FIRST_NAME = FIRST_NAME;
        this.SECOND_NAME = SECOND_NAME;
        this.THIRD_NAME = THIRD_NAME;
        this.TELEPHONE = TELEPHONE;
        this.REQUEST_DATE = REQUEST_DATE;
        this.id_repair=id_repair;

    }

    public Request(String FIRST_NAME, String SECOND_NAME, String THIRD_NAME, String TELEPHONE, Date REQUEST_DATE) {
        this.FIRST_NAME = FIRST_NAME;
        this.SECOND_NAME = SECOND_NAME;
        this.THIRD_NAME = THIRD_NAME;
        this.TELEPHONE = TELEPHONE;
        this.REQUEST_DATE = REQUEST_DATE;
    }


    public int getID_REQUEST() {
        return ID_REQUEST;
    }

    public void setID_REQUEST(int ID_REQUEST) {
        this.ID_REQUEST = ID_REQUEST;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getSECOND_NAME() {
        return SECOND_NAME;
    }

    public void setSECOND_NAME(String SECOND_NAME) {
        this.SECOND_NAME = SECOND_NAME;
    }

    public String getTHIRD_NAME() {
        return THIRD_NAME;
    }

    public void setTHIRD_NAME(String THIRD_NAME) {
        this.THIRD_NAME = THIRD_NAME;
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public Date getREQUEST_DATE() {
        return REQUEST_DATE;
    }

    public void setREQUEST_DATE(Date REQUEST_DATE) {
        this.REQUEST_DATE = REQUEST_DATE;
    }

}