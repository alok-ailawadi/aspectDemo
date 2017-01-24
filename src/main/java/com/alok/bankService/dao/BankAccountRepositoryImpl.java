/*
package com.alok.bankService.dao;

import com.alok.bankService.entity.BankAccount;

import org.springframework.stereotype.Repository;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

*/
/**
 * Created by Alok on 1/23/2017.
 *//*

@Repository("BankAccountRepository")

public class BankAccountRepositoryImpl implements BankAccountRepository {
    @PersistenceContext
    EntityManager em;
    @Override
    public List<BankAccount> findByUserId(String userId) {
        Query q = em.createQuery("SELECT b FROM BankAccount b WHERE userId=:userId");
        q.setParameter("userId", userId);
        return q.getResultList();

    }

    @Override
    public void deleteAll() {

    }
}
*/
