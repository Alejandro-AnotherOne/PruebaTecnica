package com.ProyectowebAbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provider")
public class Provider {
 
	@Id
	private Long id;
	@Column(name="name_provider")
	private String nameProvider;
	private String direction;
	private String email;
	@Column(name="number_vehicles_available")
	private int numberVehiclesAvailable;
	
	public Provider() {
    	
    }

	/**
	 * @param nameProvider
	 * @param id
	 * @param direction
	 * @param email
	 * @param numberVehiclesAvailable
	 */
	public Provider(String nameProvider, Long id, String direction, String email, int numberVehiclesAvailable) {
		super();
		this.nameProvider = nameProvider;
		this.id = id;
		this.direction = direction;
		this.email = email;
		this.numberVehiclesAvailable = numberVehiclesAvailable;
	}

	/**
	 * @return the nameProvider
	 */
	public String getNameProvider() {
		return nameProvider;
	}

	/**
	 * @param nameProvider the nameProvider to set
	 */
	public void setNameProvider(String nameProvider) {
		this.nameProvider = nameProvider;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the numberVehiclesAvailable
	 */
	public int getNumberVehiclesAvailable() {
		return numberVehiclesAvailable;
	}

	/**
	 * @param numberVehiclesAvailable the numberVehiclesAvailable to set
	 */
	public void setNumberVehiclesAvailable(int numberVehiclesAvailable) {
		this.numberVehiclesAvailable = numberVehiclesAvailable;
	}
}
