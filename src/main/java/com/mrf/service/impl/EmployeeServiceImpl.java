package com.mrf.service.impl;/**
 * Created by WuQiChuan on 2018/7/17.
 */


import com.mrf.dao.EmployeeMapper;
import com.mrf.pojo.Employee;
import com.mrf.service.IEmployeeService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @author 武琦川@hand-china.com
 * @version 1.0
 * @name EmployeeServiceImpl
 * @description
 * @date 2018/7/17 9:55
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    //注入接口EmployeeMapper生成的代理对象
    @Resource
    private EmployeeMapper employeeMapper;


    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }


    public Employee getEmployeeById(Employee employee) {
        return employeeMapper.getEmployeeById(employee.getEmpId());
    }


    public void updateEmployee(Employee employee) {

    }
}
