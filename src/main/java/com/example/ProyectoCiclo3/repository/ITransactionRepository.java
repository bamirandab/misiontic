package com.example.ProyectoCiclo3.repository;

import com.example.ProyectoCiclo3.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction,Long> {

    @Query("SELECT u FROM Transaction u WHERE u.id = :id")
    ArrayList<Transaction> findTransaction(@Param("id") long id);
    @Modifying()
    @Query("DELETE FROM Transaction u WHERE u.id = :id")
    ArrayList<Transaction> deleteTransaction(@Param("id") long id);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE Transaction t SET t.concept = :values WHERE t.id = :id")
    ArrayList<Transaction> updateTransaction(@Param("id") long id,
                                             @Param("values") Object values);

}
