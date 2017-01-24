package com.alok.EncryptionService.service;

import org.springframework.stereotype.Service;

/**
 * Created by Alok on 1/24/2017.
 */
@Service
public class EncryptionService {

    public String encrypt(String plaintext)
    {
        return "This is encrypted : "+plaintext ;
    }
}
