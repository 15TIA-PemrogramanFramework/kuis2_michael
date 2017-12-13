/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.michael.controller;

import com.michael.michael.entity.Ipk_1045;
import com.michael.michael.service.Ipk_1045Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ipk_1045")
public class Ipk_1045Controller {

    @Autowired
    private Ipk_1045Service ipk_1045Service;

    @RequestMapping(method = RequestMethod.POST)
    public Ipk_1045 insert(@RequestBody Ipk_1045 ipk_1045) {
        return ipk_1045Service.insert(ipk_1045);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ipk_1045 update(@RequestBody Ipk_1045 ipk_1045) {
        return ipk_1045Service.update(ipk_1045);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1045Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Ipk_1045 getById(@PathVariable("id") Long id){
        return ipk_1045Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk_1045> getAll(){
        return ipk_1045Service.getAll();
    }
}
