package com.muhardin.endy.belajar.websecurity.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaloController {
    
    @RequestMapping(value="/halo/", method=RequestMethod.GET)
    public Map<String, Object> halo(){
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("waktu", new Date());
        return hasil;
    }
}
