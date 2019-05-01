package com.joydeep.game.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joydeep.game.model.Player;
import com.joydeep.game.model.Team;
import com.joydeep.game.repository.PlayerRepository;
import com.joydeep.game.repository.TeamRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Game Rest Service", description = "REST Apis for Team Information")
@RestController
@RequestMapping("/api/")
public class GameController {

	@Autowired
	private Environment environment;

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private TeamRepository teamRepository;



	//  @Autowired
	//  private ExchangeValueRepository repository;
	@ApiOperation(value = "Get information on team ID", response = Iterable.class, tags = "team")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/team/{teamId}")
	public List<String> team(@PathVariable long teamId ){
		return null;
	}

	@ApiOperation(value = "Get list of All Players.", response = Iterable.class, tags = "getAllPalyers")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/allplayes")
	public List<Player> getAllPalyers(){
		return playerRepository.findAll();
	}

	@ApiOperation(value = "Get list of All Team", response = Iterable.class, tags = "getStudents")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/allTeam")
	public List<Team> getAllTeam(){
		return teamRepository.findAll();
	}

	@ApiOperation(value = "Get Information of service", response = Iterable.class, tags = "getStudents")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/info")
	public String info (){
		return "Game Service";
	}
}