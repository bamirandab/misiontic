package com.example.ProyectoCiclo3.Services;

import com.example.ProyectoCiclo3.Entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService {
//    public ArrayList<Employee> selectAllEnterprise(){
//        return (ArrayList <Employee>) this.repository.findAll();
//    }
//
//    public Employee selectByIdEmployee (int id){
//        Optional<Employee> existe = this.repository.selectById(id);
//        if (existe.isPresent()){
//            return existe.get();
//        }else{
//            return null;
//        }
//    }
//
//    public Response createEmployee (Employee data){
//        Response response = new Response();
//        response.setCode(200);
//        response.setMessage("¡Su empleado ha sido registrada correctamente!");
//        return response;
//    }
//
//    public Response deleteEmployee (int id){
//        Response response = new Response();
//        response.setCode(200);
//        response.setMessage("¡Su empleado ha sido eliminada correctamente!");
//        return response;
//    }
//
//    public Response upDateEmployee (Employee data){
//        Response response = new Response();
//        Employee existe = selectByIdEmployee(data.getId());
//        if (existe == null){
//            response.setCode(500);
//            response.setMessage("¡El ID digitado no existe!");
//            return response;
//        }
//        existe.setName(data.getName());
//        response.setCode(200);
//        response.setMessage("¡Sus datos han sido actualizados correctamente!");
//        return response;
//    }


}



