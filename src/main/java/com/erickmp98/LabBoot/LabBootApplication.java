package com.erickmp98.LabBoot;

import com.erickmp98.LabBoot.model.Player;
import com.erickmp98.LabBoot.model.Team;
import com.erickmp98.LabBoot.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class LabBootApplication {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(LabBootApplication.class, args);
	}

	@PostConstruct
	public void init(){

		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy","Showman"));
		set.add(new Player("Buckets","Guard"));
		set.add(new Player("Dizzy","Guard"));

		list.add(new Team("Harlen","Globetrotters", set));
		list.add(new Team("Washington","Generals",null));

		teamRepository.saveAll(list);


	}

}
