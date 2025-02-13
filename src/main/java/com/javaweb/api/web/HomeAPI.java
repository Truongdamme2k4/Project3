package com.javaweb.api.web;

import com.javaweb.entity.CustomerEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value = "homeAPIAdmin")
@RequestMapping("/api/home")
public class HomeAPI {
	@PostMapping("/lien-he")
    public void addCustomer(@RequestBody CustomerEntity customerEntity){
        System.out.println("ok");
    }
	
}
