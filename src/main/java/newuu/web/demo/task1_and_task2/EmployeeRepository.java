package newuu.web.demo.task1_and_task2;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
    List<EmployeeModel> findBySalaryBetween(double fromSalary, double toSalary);
}
