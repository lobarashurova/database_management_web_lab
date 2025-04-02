package newuu.web.demo.task1;

import jakarta.persistence.*;
import newuu.web.demo.task2.TaskEntity;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employees")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;

    @ManyToMany(mappedBy = "employees")
    private Set<TaskEntity> tasks = new HashSet<>();

    // Constructors
    public EmployeeModel() {}

    public EmployeeModel(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Set<TaskEntity> getTasks() { return tasks; }
    public void setTasks(Set<TaskEntity> tasks) { this.tasks = tasks; }
}
