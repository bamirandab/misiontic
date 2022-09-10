package com.example.ProyectoCiclo3.Services;

import com.example.ProyectoCiclo3.Entities.Enterprise;
import com.example.ProyectoCiclo3.Entities.Transaction;
import com.example.ProyectoCiclo3.Responses.Response;
import com.example.ProyectoCiclo3.repository.ITransactionRepository;
import org.springframework.stereotype.Service;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TransactionService {

    private ITransactionRepository transactionRepository;
    public TransactionService(ITransactionRepository rep){
        this.transactionRepository = rep;
    }
    public Transaction findTransaction(int id){
        return Transaction this.transactionRepository.findTransaction(id);
    }

    public Response createTransaction(Transaction data, long id){
        Response response = new Response();

        //Logica de negocio
        //Validamos datos
        if(!isValidEmailAddress(data.getUser().getCorreoElectronico())){
            response.setCode(500);
            response.setMessage("Error, el usuario dado no es válido.");
            return  response;
        }

        //Validamos password
        if(data.getUser().getPassword().equals(null) || data.getUser().getPassword().equals("")){
            response.setCode(500);
            response.setMessage("Error, su contraseña no es válida.");
            return  response;
        }

        ArrayList<Transaction> existe = this.transactionRepository.existeCorreo(data.getUser().getCorreoElectronico());
        if(existe != null && existe.size() > 0){
            response.setCode(500);
            response.setMessage("Error, el correo electronico ya esta en uso.");
            return  response;
        }

        this.transactionRepository.save(data);
        response.setCode(200);
        response.setMessage("Transaccion registrada exitosamente");
        return response;
    }

    public boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public Response deleteTransaction(long id){
        Response response = new Response();
        this.transactionRepository.delete(id);
        response.setCode(200);
        response.setMessage("Usuario eliminado exitosamente");
        return response;
    }

    public Response updateTransaction(long id, Object[] attributes, Object[] values){
        Response response = new Response();
        this.transactionRepository.update(id, attributes, values);
        response.setCode(200);
        response.setMessage("Transaccion actualizada exitosamente");
    }

}
