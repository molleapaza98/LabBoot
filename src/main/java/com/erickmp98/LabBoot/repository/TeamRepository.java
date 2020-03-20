package com.erickmp98.LabBoot.repository;

import com.erickmp98.LabBoot.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(path = "teams" , rel = "team")
public interface TeamRepository extends CrudRepository<Team,Long>{
}
