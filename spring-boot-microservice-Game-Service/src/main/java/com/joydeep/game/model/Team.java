package com.joydeep.game.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "team", catalog="soccer")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "team_id")
	private long team_id;

	@NotBlank
	@Column(nullable=false, name="name")
	private String name;


	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "team_id", referencedColumnName = "team_id")
	//	@OneToMany(fetch = FetchType.EAGER)
	//    @JoinColumn(name = "team_id", nullable = false)
	//@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	// @JoinColumn(name = "id", nullable = false, insertable=false, updatable=false)
	// @OnDelete(action = OnDeleteAction.CASCADE)
	//@JsonIgnore 
	private List<Player> players;

	

	/**
	 * @return the team_id
	 */
	public long getTeam_id() {
		return team_id;
	}

	/**
	 * @param team_id the team_id to set
	 */
	public void setTeam_id(long team_id) {
		this.team_id = team_id;
	}

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



}
