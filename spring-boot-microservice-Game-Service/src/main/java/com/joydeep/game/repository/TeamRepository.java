package com.joydeep.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joydeep.game.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
