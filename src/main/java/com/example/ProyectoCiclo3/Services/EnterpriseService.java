package com.example.ProyectoCiclo3.Services;

import com.example.ProyectoCiclo3.Entities.Employee;
import com.example.ProyectoCiclo3.Entities.Enterprise;
import com.example.ProyectoCiclo3.repository.IEnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
@Service
public class EnterpriseService {

    private IEnterpriseRepository enterpriseRepository;
    public EnterpriseService(IEnterpriseRepository rep){
        this.enterpriseRepository = rep;
    }

    public ArrayList<Enterprise> selectAllEnterprise(){
        return (ArrayList <Enterprise>) this.enterpriseRepository.findAll();
    }

    public Enterprise selectByIdEnterprise (long id){

        Optional<Enterprise> existe = this.enterpriseRepository.findById(id);
        if (existe.isPresent()){
            return existe.get();
        }else{
            return null;
        }
    }

    public Response createEnterprise (Enterprise data){
        Response response = new Response();
        ArrayList<Enterprise> all_enterprise = selectAllEnterprise();

        if( all_enterprise.size() == 0){
            long default_id = 1;
            data.setId( default_id );
        }else{
            ArrayList<Long> ids = new ArrayList<>();
            all_enterprise.forEach((n) -> ids.add(n.getId()));
            data.setId(Collections.max(ids) + 1);
        }
        Enterprise existe = selectById(data.getId());
        if(existe != null){
            response.setCode(500);
            response.setMessage("¡La empresa ya existe!");
            return  response;
        }

        this.enterpriseRepository.save(data);
        response.setCode(200);
        response.setMessage("¡Su empresa ha sido registrada correctamente!");
        return response;
    }

    public Response deleteEnterprise (long id){
        Response response = new Response();
        Enterprise valida = selectById(id);
        if (valida == null){
            response.setCode(500);
            response.setMessage("¡El ID digitado no existe!");
            return response;
        }

        this.enterpriseRepository.deleteById(id);
        response.setCode(200);
        response.setMessage("¡Su empleado ha sido eliminada correctamente!");
        return response;
    }

    public Response upDateEnterprise (Enterprise data, long id){
        Response response = new Response();
        Enterprise existe = selectById(id);
        if (existe == null){
            response.setCode(500);
            response.setMessage("¡El ID digitado no existe!");
            return response;
        }
        existe.setName(data.getName());
        existe.setCreatedat(data.getCreatedat());
        existe.setAddress(data.getAddress());
        existe.setDocument(data.getDocument());
        existe.setUpdatedat(data.getUpdatedat());

        response.setCode(200);
        this.enterpriseRepository.save(existe);
        response.setMessage("¡Sus datos han sido actualizados correctamente!");


        return response;
    }

    public Enterprise selectById(long Id){
        Optional<Enterprise> existe = this.enterpriseRepository.findById(Id);
        if(existe.isPresent()){
            return existe.get();
        }
        else {
            return null;
        }
    }

}

