package newuu.web.demo.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public ResponseEntity<EmployeeModel> addEmployee(@RequestBody EmployeeModel employee) {
        return ResponseEntity.ok(service.addEmployee(employee));
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        return ResponseEntity.ok(service.getAllEmployees());
    }

    @GetMapping("/salary-range")
    public ResponseEntity<List<EmployeeModel>> getEmployeesBySalary(@RequestParam double fromSalary, @RequestParam double toSalary) {
        return ResponseEntity.ok(service.getEmployeesBySalary(fromSalary, toSalary));
    }
}
