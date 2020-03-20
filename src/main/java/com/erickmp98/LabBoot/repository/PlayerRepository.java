package com.erickmp98.LabBoot.repository;

import com.erickmp98.LabBoot.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(path = "players" , rel = "player")
public interface PlayerRepository extends CrudRepository<Player,Long> {
}
