/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Sakib
 */
public class AddStudentData {
    
    private String name;
    private String email;
    private String department;
    private String address;

    public AddStudentData(String name, String email, String department, String address) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddStudentData{" + "name=" + name + ", email=" + email + ", department=" + department + ", address=" + address + '}';
    }
    
    
    
}
