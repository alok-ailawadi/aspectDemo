package com.alok.rest;


import com.alok.bankService.dto.BankDTO;
import com.alok.bankService.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Alok on 1/22/2017.
 */
// The Java class will be hosted at the URI path "/helloworld"
@RestController
@RequestMapping("/user")
public class BankAccoutnFlow {

    @Autowired
    private BankService bankService;
    @RequestMapping("/bankAccount/{userid}")
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")

    public List<BankDTO> getBankAccount(@PathVariable String userid) {
        List<BankDTO> banks = bankService.getBanckAccount(userid);
        return banks;
    }


    @RequestMapping("/bankAccount")
    @POST
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String storeBankAccount(@RequestBody BankDTO dto) {
        // Return some cliched textual content
        bankService.setBankAccount(dto.getUserId(),dto.getBankAccount(),dto.getIfsc());
        return "success";
    }

}
