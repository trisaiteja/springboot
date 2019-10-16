package com;

import java.io.Serializable;
import java.util.Arrays;

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String teamMembers[];

	public Project(int id, String name, String[] teamMembers) {
		super();
		this.id = id;
		this.name = name;
		this.teamMembers = teamMembers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(String[] teamMembers) {
		this.teamMembers = teamMembers;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", teamMembers=" + Arrays.toString(teamMembers) + "]";
	}

}
