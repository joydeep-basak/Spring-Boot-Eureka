package com.joydeep.game.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "player", catalog="soccer")
/*@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)*/
public class Player {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@NotBlank
	private String name;
	
	@Column(nullable=true, name="num")
	private String num;
	
	@Column(nullable=true, name="position")
	private String position;
	
	@Column(name = "team_id")
    private long team_id;
	
//	 @ManyToOne(cascade= CascadeType.ALL)
//	    @JoinColumn(name = "team_id", nullable = false)
	   // @OnDelete(action = OnDeleteAction.CASCADE)
	    //@JsonIgnore

	//private Team team;
	
	/*@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;*/
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the team
	 *//*
	public Team getTeam() {
		return team;
	}

	*//**
	 * @param team the team to set
	 *//*
	public void setTeam(Team team) {
		this.team = team;
	}*/

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


	
}
