package com.alok.bankService.service;

import com.alok.bankService.dao.BankAccountRepository;
import com.alok.bankService.dto.BankDTO;
import com.alok.bankService.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created by Alok on 1/22/2017.
 */
@Service
public class BankServiceImpl implements BankService {
    @Autowired
    BankAccountRepository repository;
    @Override
    public void setBankAccount(String userAd, String bankAccount, String ifsc) {

        BankAccount account = new BankAccount();
        account.setBankAccountNo(bankAccount);
        account.setIfsc(ifsc);
        account.setUserId(userAd);
        account.setId(UUID.randomUUID().toString());
        repository.save(account);

    }

    @Override
    public List<BankDTO> getBanckAccount(String userId) {
        List<BankDTO> accountDTO = new ArrayList<>();
        List<BankAccount> accounts =(List<BankAccount>) repository.findByUserId(userId);

//        for (BankAccount account : accounts)
//        {
//            accountDTO.add(converToDTO(account));
//        }
        accountDTO.addAll(accounts.stream().map(this::converToDTO).collect(Collectors.toList()));

        return accountDTO;
    }


    private BankDTO converToDTO(BankAccount account) {
        BankDTO dto = new BankDTO();
        dto.setUserId(account.getUserId());
        dto.setIfsc(account.getIfsc());
        dto.setBankAccount(account.getBankAccountNo());
        return dto;

    }
}
