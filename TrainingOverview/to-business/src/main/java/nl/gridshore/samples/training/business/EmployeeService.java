package nl.gridshore.samples.training.business;

import nl.gridshore.samples.training.domain.Employee;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jettro
 * Date: Jan 30, 2008
 * Time: 8:29:45 AM
 * All services that are employee related, or better, from the employee perspective
 */
public interface EmployeeService {

    /**
     * Returns a list with all availble employees
     * @return List of all employees
     */
    List<Employee> obtainAllEmployees();

    Employee obtainEmployeeById(Long employeeId);

    Employee addTrainingSessionToPlanningOfEmployee(Long employeeId, Long trainingSessionId);

    Employee addTrainingToWishListOfEmployee(Long employeeId, Long trainingId);
}
