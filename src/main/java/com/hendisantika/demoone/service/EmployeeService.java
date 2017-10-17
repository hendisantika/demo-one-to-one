package com.hendisantika.demoone.service;

import com.hendisantika.demoone.domain.Employee;
import com.hendisantika.demoone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/17
 * Time: 05.11
 * To change this template use File | Settings | File Templates.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Object list() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        employee.getAddress().setEmployee(employee);
        return employeeRepository.save(employee);
    }

    public Employee get(long id) {
        return employeeRepository.findById(id);
    }

    public Employee update(Employee employee) {
        Employee old = employeeRepository.findById(employee.getId());
        old.setName(employee.getName());
        old.setEmail(employee.getEmail());
        old.setPassword(employee.getPassword());
        old.getAddress().setAddress(employee.getAddress().getAddress());
        employee = employeeRepository.save(old);
        return employee;
    }

    public void delete(long id) {
        employeeRepository.delete(id);
    }
}
