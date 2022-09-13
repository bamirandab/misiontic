package com.example.ProyectoCiclo3.repository;

import com.example.ProyectoCiclo3.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction,Integer> {

    @Query("SELECT u FROM Transaction u WHERE u.id = ?1")
    ArrayList<Transaction> findTransaction(long id);

    @Query("DELETE FROM Transaction u WHERE u.id = ?1")
    ArrayList<Transaction> deleteTransaction(long id);

    @Query("UPDATE Transaction SET ?2 = ?3 WHERE u.id = ?1")
    ArrayList<Transaction> updateTransaction(long id, Object attributes, Object values);

}
