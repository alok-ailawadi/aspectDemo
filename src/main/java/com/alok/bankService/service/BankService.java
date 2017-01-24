package com.alok.bankService.service;

import com.alok.bankService.dto.BankDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alok on 1/22/2017.
 */
@Service
public interface BankService {

     void setBankAccount(String userAd, String bankAccount, String ifsc);
    List<BankDTO> getBanckAccount(String userId);

}
