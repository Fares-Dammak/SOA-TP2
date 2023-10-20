package service;

import java.util.Date;

public class Compt {
	private int code;
	private int solde;
	private Date dateCreation;
	
	public Compt(int code,int solde,Date date) {		// TODO Auto-generated constructor stub
		this.code=code;
		this.solde=solde;
		this.dateCreation=date;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
