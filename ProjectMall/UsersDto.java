package com.dbshop;

public class UsersDto {
	int idx;
	String id;
	String pw;
	String name;
	String email;
	String zipCode;
	String address;
	String address2;
	String phone;
	int useyn;
	int lv;
	String regedate;
	
	public UsersDto(String id, String pw,String name, String email, String zipCode, String address, String address2, String phone){
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.zipCode = zipCode;
		this.address = address;
		this.address2 = address2;
		this.phone = phone;
	}
	
	
	
	public UsersDto() {
	}
	
	public UsersDto(int idx, String id, String pw, String name, String email, String zipCode, String address,
			String address2, String phone, int useyn, int lv, String regedate) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.zipCode = zipCode;
		this.address = address;
		this.address2 = address2;
		this.phone = phone;
		this.useyn = useyn;
		this.lv = lv;
		this.regedate = regedate;
	}
	
	

	public UsersDto(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}



	public int getIdx() {
		return idx;
	}



	public void setIdx(int idx) {
		this.idx = idx;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getAddress2() {
		return address2;
	}



	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public int getUseyn() {
		return useyn;
	}



	public void setUseyn(int useyn) {
		this.useyn = useyn;
	}



	public int getLv() {
		return lv;
	}



	public void setLv(int lv) {
		this.lv = lv;
	}



	public String getRegedate() {
		return regedate;
	}



	public void setRegedate(String regedate) {
		this.regedate = regedate;
	}

	
}
