package BD.controller;

import BD.dao.ChangeDAO.ChangeDAO;
import BD.entity.Change;
import BD.entity.Employee;
import BD.entity.Repair;
import BD.entity.Request;
import BD.service.ChangeService.ChangeService;
import BD.service.EmployeeService.EmployeeService;
import BD.service.RepairService.RepairService;
import BD.service.RequestService.RequestService;
import HelpClass.SomeMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController extends SomeMethods {
    public Employee employeeAll;

    public Change changeAll;
    public  Request requestAll;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ChangeService changeService;

    @Autowired
    private RequestService requestService;

    @Autowired
    private RepairService repairService;

    @RequestMapping("/empShow")
    public String showAllEmployees(Model model){
        List<Employee> employees= employeeService.getAllEmployee();

        model.addAttribute("allEmp", employees);
        return "EmployeeView/all-employees";
    }

    @RequestMapping("/empAdd")
    public String addNewEmployee(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee", employee);
        return "EmployeeView/employee-info";
    }

    @RequestMapping("/updateInfoEmp")
    public String updateEmployee(@RequestParam("empID") int id, Model model){
        Employee employee=employeeService.getEmployee(id);
        employeeService.deleteEmployee(id);
        model.addAttribute("employee", employee);
        return "EmployeeView/employee-info";
    }
    @RequestMapping("/CheckDate")
    public String checkDAte(@ModelAttribute("str") String s ){
        System.out.println(s);
        SomeMethods someMethods=new SomeMethods();
         if(!someMethods.isDate(s)){
            return "Exception/Exception3";
        }else {
            return "redirect:/saveEmp";
        }
    }

    @RequestMapping("/saveEmp")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        SomeMethods someMethods=new SomeMethods();
        if(someMethods.isAlpha(employee.getTELEPHONE_EMPLOYEE())){
            System.out.println(111111);
            return "Exception/Exception1";
        } else if (!someMethods.isAlpha(employee.getFIRST_NAME_EMPLOYEE()) || !someMethods.isAlpha(employee.getSECOND_NAME_EMPLOYEE()) ||
        !someMethods.isAlpha(employee.getTHIRD_NAME_EMPLOYEE()) || !someMethods.isAlpha(employee.getADDRESS_EMPLOYEE()) ||
        !someMethods.isAlpha(employee.getPOST()) || !someMethods.isAlpha(employee.getOPERATING_MODE())) {
            return "Exception/Exception2";
        } else {
            System.out.println(222111);
            employeeService.saveEmployee(employee);
            return "redirect:/empShow";
        }
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmployee(@RequestParam("empID") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/empShow";
    }
    @RequestMapping("/countEmp")
    public String showCountEmp(Model model){
        int count=employeeService.countEmp();
        model.addAttribute("employeeCount", count);
        return "EmployeeView/employee-count";
    }

    @RequestMapping("/EmpSalaryStatistic")
    public String EmpMaxSalary(Model model){
        int count=employeeService.maxSalary();
        int min=employeeService.minSalary();
        Double avg=employeeService.avgSalary();
        Long sum=employeeService.totalSalary();
        model.addAttribute("employeeAvgsalary", avg);
        model.addAttribute("employeeTotalsalary", sum);
        model.addAttribute("emloyeeMaxSalary", count);
        model.addAttribute("employeeMinSalary", min);
        return "EmployeeView/employee-salary";
    }

    @RequestMapping("/EmpSelectEnter")
    public String EmpSelectEnter(Model model){
        Employee employee=new Employee();
        model.addAttribute("emp", employee);
        return "EmployeeView/employee-info-select";
    }
    @RequestMapping("/saveSelectEmp")
    public String saveSelectEmployee(@ModelAttribute("emp") Employee employee){

        employeeAll=employee;
        return "redirect:/EmpSelect";
    }

    @RequestMapping("/EmpSelect")
    public String EmpSelect(Model model){
        List<Employee> employees= employeeService.getSelectEmployee(employeeAll);
        model.addAttribute("allEmp", employees);
        return "EmployeeView/employee-info-selectView";
    }







    @RequestMapping("/RequestShow")
    public String showAllRequest(Model model){
        List<Request> requests= requestService.getAllRequest();
        model.addAttribute("allRequest", requests);
        return "RequestView/all-requests";
    }

    @RequestMapping("/RequestAdd")
    public String addNewRequest(Model model, Model model1){
        Request request=new Request();
        model.addAttribute("request", request);

        int [] arr=changeService.getIdRep();
        model1.addAttribute("arr", arr);

        return "RequestView/request-info";
    }

    @RequestMapping("/saveRequest")
    public String saveRequest(@ModelAttribute("request") Request request){
        SomeMethods someMethods=new SomeMethods();
        System.out.println(request);
        requestService.saveRequest(request);
        return "redirect:/RequestShow";

    }

    @RequestMapping("/updateInfoRequest")
    public String updateRequest(@RequestParam("RequestID") int id, Model model, Model model1){
        Request request=requestService.getRequest(id);
       // requestService.deleteRequest(id);

        model.addAttribute("request", request);
        int [] arr=changeService.getIdRep();
        model1.addAttribute("arr", arr);
        return "RequestView/request-info";
    }
    @RequestMapping("/deleteRequest")
    public String deleteRequest(@RequestParam("RequestID") int id){
        requestService.deleteRequest(id);
        return "redirect:/RequestShow";
    }

    @RequestMapping("/countRequest")
    public String showCountRequest(Model model){
        int count=requestService.CountRequest();
        model.addAttribute("RequestCount", count);
        return "RequestView/request-count";
    }
    @RequestMapping("/RequestSelectEnter")
    public String RequestSelectEnter(Model model){
        Request employee=new Request();
        model.addAttribute("Request", employee);
        return "RequestView/request-info-select";
    }
    @RequestMapping("/saveSelectRequest")
    public String saveSelectRequest(@ModelAttribute("Request") Request employee){

        requestAll=employee;

        return "redirect:/RequestSelect";
    }

    @RequestMapping("/RequestSelect")
    public String RequestSelect(Model model){
        List<Request> employees= requestService.getSelectRequest(requestAll);
        for(Request request:employees) {
            System.out.println(request);
        }
        model.addAttribute("allRequest", employees);
        return "RequestView/request-info-selectView";
    }









    @RequestMapping("/ChangeShow")
    public String showAllChange(Model model){
        List<Change> change= changeService.getAllChange();
        model.addAttribute("allChange", change);
        return "ChangeView/all-changes";
    }

    @RequestMapping("/ChangeAdd")
    public String addNewChange(Model model, Model model1){
        Change change=new Change();
        model.addAttribute("change", change);
        int [] arr=changeService.getIdRep();
        model1.addAttribute("arr", arr);
        return "ChangeView/change-info";
    }

    @RequestMapping("/updateInfoChange")
    public String updateChange(@RequestParam("ChangeID") int id, Model model, Model model1){
        Change change=changeService.getChange(id);
        model.addAttribute("change", change);
        int [] arr=changeService.getIdRep();
        model1.addAttribute("arr", arr);
        return "ChangeView/change-info";
    }

    @RequestMapping("/saveChange")
    public String saveChange(@ModelAttribute("change") Change change){
            changeService.saveChange(change);
            return "redirect:/ChangeShow";

    }

    @RequestMapping("/deleteChange")
    public String deleteChange(@RequestParam("ChangeID") int id){
        changeService.deleteChange(id);
        return "redirect:/ChangeShow";
    }

    @RequestMapping("/countChange")
    public String showCountChange(Model model){
        int count=changeService.CountChange();
        model.addAttribute("changeCount", count);
        return "ChangeView/change-count";
    }


    @RequestMapping("/ChangeSelectEnter")
    public String ChangeSelectEnter(Model model){
        Change change=new Change();
        model.addAttribute("change", change);
        return "ChangeView/change-info-select";
    }
    @RequestMapping("/saveSelectChange")
    public String saveSelectChange(@ModelAttribute("change") Change change){
        changeAll=change;
        return "redirect:/ChangeSelect";
    }

    @RequestMapping("/ChangeSelect")
    public String ChangeSelect(Model model){
        List<Change> changes= changeService.getSelectChange(changeAll);
        model.addAttribute("allChange", changes);
        return "ChangeView/Change-info-selectView";
    }







    @RequestMapping("/RepairShow")
    public String showAllRepair(Model model){
        List<Repair> change= repairService.getAlRepair();
        model.addAttribute("allRepair", change);
        return "RepairView/all-Repairs";
    }

    @RequestMapping("/RepairAdd")
    public String addNewRepair(Model model){
        Repair change=new Repair();
        model.addAttribute("Repair", change);
        return "RepairView/Repair-info";
    }

    @RequestMapping("/updateInfoRepair")
    public String updateRepair(@RequestParam("RepairID") int id, Model model){
        Repair change=repairService.getRepair(id);
        changeService.deleteChange(id);
        model.addAttribute("Repair", change);
        return "RepairView/Repair-info";
    }

    @RequestMapping("/saveRepair")
    public String saveRepair(@ModelAttribute("Repair") Repair Repair){
        repairService.saveRepair(Repair);
        return "redirect:/RepairShow";
    }

    @RequestMapping("/deleteRepair")
    public String deleteRepair(@RequestParam("RepairID") int id){
        repairService.deleteRepair(id);
        return "redirect:/RepairShow";
    }

}
