package com.michael.michael.repo;

import com.michael.michael.entity.Ipk_1045;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Ipk_1045Repo extends CrudRepository<Ipk_1045, Long> {

    @Query("select c from Ipk_1045 c")
    public List<Ipk_1045> findAllIpk_1045();
}
