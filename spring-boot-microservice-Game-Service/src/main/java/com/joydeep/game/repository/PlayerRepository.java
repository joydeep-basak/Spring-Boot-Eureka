package com.joydeep.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joydeep.game.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
