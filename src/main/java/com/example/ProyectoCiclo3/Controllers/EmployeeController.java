package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Entities.Employee;
import com.example.ProyectoCiclo3.Services.EmployeeService;
import com.example.ProyectoCiclo3.Services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class EmployeeController {

    public EmployeeService employeeService;
    public EmployeeController(EmployeeService employee){
        this.employeeService = employee;
    }

    @PostMapping("/users")
    public Response postUsers(@RequestBody Employee data) {
        return this.employeeService.createEmployee(data);
    }

    @GetMapping("/users")
    public ArrayList<Employee> getUsers() {
        return this.employeeService.selectAllEmployees();
    }

    @GetMapping("/user/{id}")
    public ArrayList<Employee> getIdUsers(@PathVariable String id) {
        long id_converter = Long.parseLong(id);
        return this.employeeService.selectById(id_converter);
    }

    @PatchMapping("/users/{id}")
    public Response patchUsers(@RequestBody Employee data, @PathVariable String id) {
        long id_converter = Long.parseLong(id);
        return this.employeeService.upDateEmployee(data, id_converter);
    }

    @DeleteMapping("/users/{id}")
    public Response deleteUsers(@PathVariable String id) {
        long id_converter = Long.parseLong(id);
        return this.employeeService.deleteEmployee(id_converter);
    }



}



