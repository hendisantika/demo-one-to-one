package com.hendisantika.demoone.repository;

import com.hendisantika.demoone.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/17
 * Time: 05.10
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();

    Employee findById(long id);
}
