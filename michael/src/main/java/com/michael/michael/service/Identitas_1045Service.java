/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.michael.service;

import com.michael.michael.entity.Identitas_1045;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.michael.michael.repo.Identitas_1045Repo;

@Service("identitas_1045Service")
@Transactional
public class Identitas_1045Service {

    @Autowired
    private Identitas_1045Repo repo;

    public Identitas_1045 insert(Identitas_1045 identitas_1045) {
        return repo.save(identitas_1045);
    }
    
    public Identitas_1045 update(Identitas_1045 identitas_1045) {
        return repo.save(identitas_1045);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas_1045 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas_1045> getAll(){
        return repo.findAllIdentitas_1045();
    }
}
