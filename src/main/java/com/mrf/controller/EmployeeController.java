package com.mrf.controller;/**
 * Created by WuQiChuan on 2018/7/17.
 */

import com.mrf.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mrf.service.IEmployeeService;

import javax.annotation.Resource;

/**
 * @author 武琦川@hand-china.com
 * @version 1.0
 * @name EmployeeController
 * @description
 * @date 2018/7/17 10:10
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    //注入service对象,根据类型来注入
    @Resource
    private IEmployeeService employeeService;

    /* *
        * 通过ID获得一个员工
        * @author 武琦川@hand-china.com
        * @date  2018/7/17 9:38
        * @param [id]
        * @return Employee
        */
    @RequestMapping("getEmployeeById")
    public String getEmployeeById(int empId){
        System.out.print("BBBBBBBBBBBBBb");
        Employee employee = new Employee();
        employee.setEmpId(empId);
        System.out.print(employeeService.getEmployeeById(employee));
        return "aaa.jsp";
    }

/* *
 * 前往主页
 * @author 武琦川@hand-china.com
 * @date  2018/7/17 14:55
 * @param [empId]
 * @return java.lang.String
 */
    @RequestMapping("goindex")
    public String goindex(){
        return "index";
    }

    /* *
        * 增加一个员工
        * @author 武琦川@hand-china.com
        * @date  2018/7/17 9:36
        * @param [employee]
        * @return void
        */
    @RequestMapping("addEmployee")
    public String addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return "index";
    }

}
