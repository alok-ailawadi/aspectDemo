package com.alok.bankService.dao;

import com.alok.bankService.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alok on 1/23/2017.
 */
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

    @Query(value = "SELECT t FROM BankAccount t where t.userId = ?1 ")
    List<BankAccount> findByUserId(String userId);
}
