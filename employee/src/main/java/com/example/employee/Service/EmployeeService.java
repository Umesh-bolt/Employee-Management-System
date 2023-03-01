import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.Dao.employeeDao;

@Service
public class EmployeeService{

    
    @Autowired
    employeeDao employeedao;

    public List<employee> getAllEmployees(){

    }

    public void saveEmployee(Employee emp){
        employeedao.save(emp);
    }


}