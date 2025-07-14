package com.marvellous.Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    // Field Injection
    @Autowired  // AutoMatic Connection
    HardDisk hobj;

    @Autowired
    RAM robj;

    @GetMapping("Laptop")
    public String LaptopInformation()
    {
        String h = hobj.GetHardDisk();
        String r = robj.GetRAM();

        String Data = "Laptop Configuration :" +h+"&"+r;
        return Data;
    }
}
