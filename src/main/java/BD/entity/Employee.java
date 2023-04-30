package BD.entity;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
@Table(name="employee")
public class Employee  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID_EMPLOYEE")
    private int ID_EMPLOYEE;
    @Column(name="FIRST_NAME_EMPLOYEE")
    private String FIRST_NAME_EMPLOYEE;

    @Column(name="SECOND_NAME_EMPLOYEE")
    private String SECOND_NAME_EMPLOYEE;

    @Column(name="THIRD_NAME_EMPLOYEE")
    private String THIRD_NAME_EMPLOYEE;

    @Column(name="DATE_BIRTH_EMPLOYEE")
    private Date DATE_BIRTH_EMPLOYEE;

    @Column(name="ADDRESS_EMPLOYEE")
    private String ADDRESS_EMPLOYEE;

    @Column(name="TELEPHONE_EMPLOYEE")
    private String TELEPHONE_EMPLOYEE;

    @Column(name="POST")
    private String POST;

    @Column(name="SALARY")
    private int SALARY;

    @Column(name="EXPERIENCE")
    private int EXPERIENCE;

    @Column(name="OPERATING_MODE")
    private String OPERATING_MODE;

    @Column(name="ALLOWANCE")
    private int ALLOWANCE;


    public Employee(String FIRST_NAME_EMPLOYEE, String SECOND_NAME_EMPLOYEE, String THIRD_NAME_EMPLOYEE, Date DATE_BIRTH_EMPLOYEE, String ADDRESS_EMPLOYEE, String TELEPHONE_EMPLOYEE, String POST, int SALARY, int EXPERIENCE, String OPERATING_MODE, int ALLOWANCE) {
        this.FIRST_NAME_EMPLOYEE = FIRST_NAME_EMPLOYEE;
        this.SECOND_NAME_EMPLOYEE = SECOND_NAME_EMPLOYEE;
        this.THIRD_NAME_EMPLOYEE = THIRD_NAME_EMPLOYEE;
        this.DATE_BIRTH_EMPLOYEE = DATE_BIRTH_EMPLOYEE;
        this.ADDRESS_EMPLOYEE = ADDRESS_EMPLOYEE;
        this.TELEPHONE_EMPLOYEE = TELEPHONE_EMPLOYEE;
        this.POST = POST;
        this.SALARY = SALARY;
        this.EXPERIENCE = EXPERIENCE;
        this.OPERATING_MODE = OPERATING_MODE;
        this.ALLOWANCE = ALLOWANCE;
    }

    public Employee(int ID_EMPLOYEE, String FIRST_NAME_EMPLOYEE, String SECOND_NAME_EMPLOYEE, String THIRD_NAME_EMPLOYEE, Date DATE_BIRTH_EMPLOYEE, String ADDRESS_EMPLOYEE, String TELEPHONE_EMPLOYEE, String POST, int SALARY, int EXPERIENCE, String OPERATING_MODE, int ALLOWANCE) {
        this.ID_EMPLOYEE = ID_EMPLOYEE;
        this.FIRST_NAME_EMPLOYEE = FIRST_NAME_EMPLOYEE;
        this.SECOND_NAME_EMPLOYEE = SECOND_NAME_EMPLOYEE;
        this.THIRD_NAME_EMPLOYEE = THIRD_NAME_EMPLOYEE;
        this.DATE_BIRTH_EMPLOYEE = DATE_BIRTH_EMPLOYEE;
        this.ADDRESS_EMPLOYEE = ADDRESS_EMPLOYEE;
        this.TELEPHONE_EMPLOYEE = TELEPHONE_EMPLOYEE;
        this.POST = POST;
        this.SALARY = SALARY;
        this.EXPERIENCE = EXPERIENCE;
        this.OPERATING_MODE = OPERATING_MODE;
        this.ALLOWANCE = ALLOWANCE;
    }

    public Employee() {
    }

    public int getID_EMPLOYEE() {
        return ID_EMPLOYEE;
    }

    public void setID_EMPLOYEE(int ID_EMPLOYEE) {
        this.ID_EMPLOYEE = ID_EMPLOYEE;
    }

    public String getFIRST_NAME_EMPLOYEE() {
        return FIRST_NAME_EMPLOYEE;
    }

    public void setFIRST_NAME_EMPLOYEE(String FIRST_NAME_EMPLOYEE) {
        this.FIRST_NAME_EMPLOYEE = FIRST_NAME_EMPLOYEE;
    }

    public String getSECOND_NAME_EMPLOYEE() {
        return SECOND_NAME_EMPLOYEE;
    }

    public void setSECOND_NAME_EMPLOYEE(String SECOND_NAME_EMPLOYEE) {
        this.SECOND_NAME_EMPLOYEE = SECOND_NAME_EMPLOYEE;
    }

    public String getTHIRD_NAME_EMPLOYEE() {
        return THIRD_NAME_EMPLOYEE;
    }

    public void setTHIRD_NAME_EMPLOYEE(String THIRD_NAME_EMPLOYEE) {
        this.THIRD_NAME_EMPLOYEE = THIRD_NAME_EMPLOYEE;
    }

    public Date getDATE_BIRTH_EMPLOYEE() {
        return DATE_BIRTH_EMPLOYEE;
    }

    public void setDATE_BIRTH_EMPLOYEE(Date DATE_BIRTH_EMPLOYEE) {
        this.DATE_BIRTH_EMPLOYEE = DATE_BIRTH_EMPLOYEE;
    }

    public String getADDRESS_EMPLOYEE() {
        return ADDRESS_EMPLOYEE;
    }

    public void setADDRESS_EMPLOYEE(String ADDRESS_EMPLOYEE) {
        this.ADDRESS_EMPLOYEE = ADDRESS_EMPLOYEE;
    }

    public String getTELEPHONE_EMPLOYEE() {
        return TELEPHONE_EMPLOYEE;
    }

    public void setTELEPHONE_EMPLOYEE(String TELEPHONE_EMPLOYEE) {
        this.TELEPHONE_EMPLOYEE = TELEPHONE_EMPLOYEE;
    }

    public String getPOST() {
        return POST;
    }

    public void setPOST(String POST) {
        this.POST = POST;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    public int getEXPERIENCE() {
        return EXPERIENCE;
    }

    public void setEXPERIENCE(int EXPERIENCE) {
        this.EXPERIENCE = EXPERIENCE;
    }

    public String getOPERATING_MODE() {
        return OPERATING_MODE;
    }

    public void setOPERATING_MODE(String OPERATING_MODE) {
        this.OPERATING_MODE = OPERATING_MODE;
    }

    public int getALLOWANCE() {
        return ALLOWANCE;
    }

    public void setALLOWANCE(int ALLOWANCE) {
        this.ALLOWANCE = ALLOWANCE;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ID_EMPLOYEE=" + ID_EMPLOYEE +
                ", FIRST_NAME_EMPLOYEE='" + FIRST_NAME_EMPLOYEE + '\'' +
                ", SECOND_NAME_EMPLOYEE='" + SECOND_NAME_EMPLOYEE + '\'' +
                ", THIRD_NAME_EMPLOYEE='" + THIRD_NAME_EMPLOYEE + '\'' +
                ", DATE_BIRTH_EMPLOYEE=" + DATE_BIRTH_EMPLOYEE +
                ", ADDRESS_EMPLOYEE='" + ADDRESS_EMPLOYEE + '\'' +
                ", TELEPHONE_EMPLOYEE='" + TELEPHONE_EMPLOYEE + '\'' +
                ", POST='" + POST + '\'' +
                ", SALARY=" + SALARY +
                ", EXPERIENCE=" + EXPERIENCE +
                ", OPERATING_MODE='" + OPERATING_MODE + '\'' +
                ", ALLOWANCE=" + ALLOWANCE +
                '}';
    }

}


