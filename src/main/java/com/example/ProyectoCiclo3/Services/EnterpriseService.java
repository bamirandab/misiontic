package com.example.ProyectoCiclo3.Services;

import com.example.ProyectoCiclo3.Entities.Enterprise;
import com.example.ProyectoCiclo3.repository.IEnterpriseRepository;
import com.example.ProyectoCiclo3.repository.ITransactionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class EnterpriseService {

//    private IEnterpriseRepository enterpriseRepository;
//    public EnterpriseService(IEnterpriseRepository rep){
//        this.enterpriseRepository = rep;
//    }

    public ArrayList<Enterprise> selectAllEnterprise(){
        ArrayList<Enterprise> enterprise_test = new ArrayList<Enterprise>();
        enterprise_test.add(new Enterprise());
//        return (ArrayList <Enterprise>) this.enterpriseRepository.findAll();
        return (ArrayList <Enterprise>) enterprise_test;
    }

    public Enterprise selectByIdEnterprise (int id){
        Enterprise enterprise_test = new Enterprise();

        Optional<Enterprise> existe = Optional.ofNullable(enterprise_test);
        if (existe.isPresent()){
            return existe.get();
        }else{
            return null;
        }
    }

    public Response createEnterprise (Enterprise data){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("¡Su empleado ha sido registrada correctamente!");
        return response;
    }

    public Response deleteEnterprise (int id){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("¡Su empleado ha sido eliminada correctamente!");
        return response;
    }

    public Response upDateEnterprise (Enterprise data){
        Response response = new Response();
        Enterprise existe = selectByIdEnterprise((int) data.getId());
        if (existe == null){
            response.setCode(500);
            response.setMessage("¡El ID digitado no existe!");
            return response;
        }
        existe.setName(data.getName());
        response.setCode(200);
        response.setMessage("¡Sus datos han sido actualizados correctamente!");
        return response;
    }


}

