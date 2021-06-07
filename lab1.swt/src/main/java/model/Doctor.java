/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Doctor implements Comparable<Doctor>{

	private int id;
	private String name;
	private String date;
	private String specialization;
	private int availability;
	private String email;
	private String phone;

	public Doctor() {
	}

	public Doctor(int id, String name, String date, String specialization, int availability, String email,
			String phone) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.specialization = specialization;
		this.availability = availability;
		this.email = email;
		this.phone = phone;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		String str = null;
		switch (availability) {
		case 0:
			str = "Vacation";
			break;
		case 1:
			str = "Available";
			break;
		case 2:
			str = "Busy in emergency";
			break;
		case 3:
			str = "Diagnosing";
			break;
		}
		return "ID: " + id + "\tName: " + name + "\tDate Of Birth: " + date + "\tSpecialization: " + specialization
				+ "\tAvailability: " + str + "\tEmail: " + email + "\tPhone: " + phone;
	}

	public int compareTo(Doctor o) {
		Date date1 = null;
        Date date2 = null;
        try {           
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            date1 = simpleDateFormat.parse(this.date);
            date2 = simpleDateFormat.parse(o.getDate());
        } catch (ParseException ex) {
        }
        return date1.compareTo(date2);
	}

}
