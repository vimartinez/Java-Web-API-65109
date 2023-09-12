package com.educacionit.model;

public class State {
	
	private Long id;
	private Long id_country;
	private String name;
	
	public State() {
		
	}

	public State(Long id, Long id_country, String name) {
		super();
		this.id = id;
		this.id_country = id_country;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_country() {
		return id_country;
	}

	public void setId_country(Long id_country) {
		this.id_country = id_country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
