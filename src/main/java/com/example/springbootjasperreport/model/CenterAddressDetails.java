package com.example.springbootjasperreport.model;


public class CenterAddressDetails {

	private String id;
	private String centerName;
	private String houseNumber;
	private String street;
	private String area;
	private String city;
	private String state;
	private String landmark;
	private String pinCode;
	
	public CenterAddressDetails(String id, String centerName, String houseNumber, String street, String area,
			String city, String state, String landmark, String pinCode) {
		super();
		this.id = id;
		this.centerName = centerName;
		this.houseNumber = houseNumber;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.landmark = landmark;
		this.pinCode = pinCode;
	}
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
}
