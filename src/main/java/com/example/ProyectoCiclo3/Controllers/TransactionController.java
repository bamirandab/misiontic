package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Entities.Transaction;
import com.example.ProyectoCiclo3.Responses.Response;
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
    public Transaction getTransaction(@PathVariable int id){
        return this.transactionService.findTransaction(id);
    }

    @PostMapping("enterprises/{id}/movements")
    public Response postTransaction(@RequestBody Transaction request, @PathVariable long id){
        return this.transactionService.createTransaction(request, id);
    }

    @DeleteMapping("enterprises/{id}/movements")
    public Response deleteTransaction(@PathVariable long id){
        return this.transactionService.deleteTransaction(id);
    }

    @PatchMapping("enterprises/{id}/movements")
    public Response updateTransaction(@PathVariable int id, Object[] attributes, Object[] values){
        return this.transactionService;
    }


}
