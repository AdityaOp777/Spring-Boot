package com.marvellous.Ganesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Demo
{
    @GetMapping("PPA")
    public String Display()
    {
        return "Jay Ganesh...";
    }
}
