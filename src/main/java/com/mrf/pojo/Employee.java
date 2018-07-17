package com.mrf.pojo;/**
 * Created by WuQiChuan on 2018/7/17.
 */

/**
 * @author 武琦川@hand-china.com
 * @version 1.0
 * @name Employee
 * @description 员工类
 * @date 2018/7/17 9:17
 */

public class Employee {
    private Integer empId;
    private String empName;
    private Integer empAge;
    private String empSex;
    private String empDepId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getEmpDepId() {
        return empDepId;
    }

    public void setEmpDepId(String empDepId) {
        this.empDepId = empDepId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSex='" + empSex + '\'' +
                ", empDepId='" + empDepId + '\'' +
                '}';
    }
}
