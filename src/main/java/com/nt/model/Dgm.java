package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dgm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dgmId;

    private String dgmName;
    private String dgmMail;
	public Long getDgmId() {
		return dgmId;
	}
	public void setDgmId(Long dgmId) {
		this.dgmId = dgmId;
	}
	public String getDgmName() {
		return dgmName;
	}
	public void setDgmName(String dgmName) {
		this.dgmName = dgmName;
	}
	public String getDgmMail() {
		return dgmMail;
	}
	public void setDgmMail(String dgmMail) {
		this.dgmMail = dgmMail;
	}

    
}
