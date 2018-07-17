package com.mrf.dao;/**
 * Created by WuQiChuan on 2018/7/17.
 */


import com.mrf.pojo.Employee;

/**
 * @author 武琦川@hand-china.com
 * @version 1.0
 * @name EmployeeMapper
 * @description 员工操作的DAO接口类
 * @date 2018/7/17 9:31
 */

public interface EmployeeMapper {
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
    public Employee getEmployeeById(int id);

    /* *
     *
     * @author 武琦川@hand-china.com
     * @date  2018/7/17 9:38
     * @param [employee]
     * @return void
     */
    public void updateEmployee(Employee employee);
    
}
