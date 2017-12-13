/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.michael.controller;

import com.michael.michael.entity.Identitas_1045;
import com.michael.michael.service.Identitas_1045Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/identitas_1045")
public class Identitas_1045Controller {

    @Autowired
    private Identitas_1045Service identitas_1045Service;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas_1045 insert(@RequestBody Identitas_1045 identitas_1045) {
        return identitas_1045Service.insert(identitas_1045);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas_1045 update(@RequestBody Identitas_1045 identitas_1045) {
        return identitas_1045Service.update(identitas_1045);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1045Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas_1045 getById(@PathVariable("id") Long id){
        return identitas_1045Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas_1045> getAll(){
        return identitas_1045Service.getAll();
    }
}
