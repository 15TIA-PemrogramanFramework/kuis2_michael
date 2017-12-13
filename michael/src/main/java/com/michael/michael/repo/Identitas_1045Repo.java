package com.michael.michael.repo;

import com.michael.michael.entity.Identitas_1045;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Identitas_1045Repo extends CrudRepository<Identitas_1045, Long> {

    @Query("select c from Identitas_1045 c")
    public List<Identitas_1045> findAllIdentitas_1045();
}
