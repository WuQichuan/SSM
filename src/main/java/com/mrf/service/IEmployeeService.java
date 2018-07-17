package com.mrf.service;


import com.mrf.pojo.Employee;

/**
 * @author 武琦川@hand-china.com
 * @version 1.0
 * @name EmployeeMapper
 * @description 员工的Service接口类
 * @date 2018/7/17 9:31
 */

public interface IEmployeeService {

        /* *
         * 增加一个员工
         * @author 武琦川@hand-china.com
         * @date  2018/7/17 9:36
         * @param [employee]
         * @return void
         */
        public void addEmployee(Employee employee);

        /* *
         * 通过ID获得一个员工
         * @author 武琦川@hand-china.com
         * @date  2018/7/17 9:38
         * @param [id]
         * @return Employee
         */
        public Employee getEmployeeById(Employee employee);

        /* *
         *
         * @author 武琦川@hand-china.com
         * @date  2018/7/17 9:38
         * @param [employee]
         * @return void
         */
        public void updateEmployee(Employee employee);
}
