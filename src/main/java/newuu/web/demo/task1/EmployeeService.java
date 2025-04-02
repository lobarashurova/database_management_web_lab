package newuu.web.demo.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeModel addEmployee(EmployeeModel employee) {
        return repository.save(employee);
    }

    public List<EmployeeModel> getAllEmployees() {
        return repository.findAll();
    }

    public List<EmployeeModel> getEmployeesBySalary(double fromSalary, double toSalary) {
        return repository.findBySalaryBetween(fromSalary, toSalary);
    }
}
