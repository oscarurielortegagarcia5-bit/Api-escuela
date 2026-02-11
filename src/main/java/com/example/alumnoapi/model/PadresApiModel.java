package com.example.alumnoapi.model;

public class PadresApiModel {
	private Integer parentId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String phoneNumber;
	private Boolean hasAcceptedTerms;
	private Boolean hasChildrenEnrolled;
	private Integer numberOfChildren;
	private Boolean active;
	
	public PadresApiModel() {
		
	}

	public PadresApiModel(Integer parentId, String firstName, String lastName, Integer age, String email,
			String phoneNumber, Boolean hasAcceptedTerms, Boolean hasChildrenEnrolled, Integer numberOfChildren,
			Boolean active) {
		this.parentId = parentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hasAcceptedTerms = hasAcceptedTerms;
		this.hasChildrenEnrolled = hasChildrenEnrolled;
		this.numberOfChildren = numberOfChildren;
		this.active = active;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getHasAcceptedTerms() {
		return hasAcceptedTerms;
	}

	public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
		this.hasAcceptedTerms = hasAcceptedTerms;
	}

	public Boolean getHasChildrenEnrolled() {
		return hasChildrenEnrolled;
	}

	public void setHasChildrenEnrolled(Boolean hasChildrenEnrolled) {
		this.hasChildrenEnrolled = hasChildrenEnrolled;
	}

	public Integer getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
	
}
