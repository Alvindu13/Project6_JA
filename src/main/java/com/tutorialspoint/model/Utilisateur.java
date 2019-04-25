package com.tutorialspoint.model;

import javax.sql.DataSource;

public class Utilisateur{

	private String firstName;
	private String lastName;
	private int nbTopo;
	private String pseudo;
	private String passworde;



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNbTopo() {
		return nbTopo;
	}

	public void setNbTopo(int nbTopo) {
		this.nbTopo = nbTopo;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return passworde;
	}

	public void setPassword(String password) {
		this.passworde = password;
	}

	public void setDataSource(DataSource ds) { }

}