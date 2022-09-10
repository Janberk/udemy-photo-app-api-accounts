package com.cdn.udemyphotoappapiaccounts.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController {
    @GetMapping("/status/check")
    public String status() {
        return "Accounts-Service status: OK";
    }
}
