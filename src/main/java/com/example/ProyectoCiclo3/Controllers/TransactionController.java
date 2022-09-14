package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Entities.Transaction;
import com.example.ProyectoCiclo3.Services.Response;
import com.example.ProyectoCiclo3.Services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TransactionController {
    public TransactionService transactionService;
    public TransactionController(TransactionService transaction){
        this.transactionService = transaction;
    }

    @GetMapping("enterprises/{id}/movements")
    public ArrayList<Transaction> getTransaction(@PathVariable String id){
        long id_converter = Long.parseLong(id);
        return this.transactionService.findTransaction(id_converter);
    }

    @PostMapping("enterprises/{id}/movements")
    public Response postTransaction(@RequestBody Transaction request, @PathVariable String id){
        long id_converter = Long.parseLong(id);
        return this.transactionService.createTransaction(request, id_converter);
    }

    @DeleteMapping("enterprises/{id}/movements")
    public Response deleteTransaction(@PathVariable String id){
        long id_converter = Long.parseLong(id);
        return this.transactionService.deleteTransaction(id_converter);
    }

    @PatchMapping("enterprises/{id}/movements")
    public Response updateTransaction(@RequestBody Transaction data, @PathVariable String id){
        long id_converter = Long.parseLong(id);
        return this.transactionService.updateTransaction(data, id_converter);
    }


}
