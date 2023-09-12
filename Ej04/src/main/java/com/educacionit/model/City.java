package com.educacionit.model;

public class City {
	
	private Long id;
	private Long id_state;
	private String name;
	
	public City() {
		
	}

	public City(Long id, Long id_state, String name) {
		super();
		this.id = id;
		this.id_state = id_state;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_state() {
		return id_state;
	}

	public void setId_state(Long id_state) {
		this.id_state = id_state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
