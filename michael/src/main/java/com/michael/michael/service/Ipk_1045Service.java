/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.michael.service;

import com.michael.michael.entity.Ipk_1045;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.michael.michael.repo.Ipk_1045Repo;

@Service("ipk_1045Service")
@Transactional
public class Ipk_1045Service {

    @Autowired
    private Ipk_1045Repo repo;

    public Ipk_1045 insert(Ipk_1045 ipk_1045) {
        return repo.save(ipk_1045);
    }
    
    public Ipk_1045 update(Ipk_1045 ipk_1045) {
        return repo.save(ipk_1045);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Ipk_1045 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Ipk_1045> getAll(){
        return repo.findAllIpk_1045();
    }
}
