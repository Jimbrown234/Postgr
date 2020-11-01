package com.brown.messenger.dto;

import com.brown.messenger.entity.User;

public class UserDTO {

	String name;
	
	long id;
	
	public UserDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public static UserDTO valueOf(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		return userDTO;
	}
	
}
