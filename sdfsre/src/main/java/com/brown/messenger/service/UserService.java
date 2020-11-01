package com.brown.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brown.messenger.dto.UserDTO;
import com.brown.messenger.entity.User;
import com.brown.messenger.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public List<UserDTO> getUsers(){
		List<User> userList = userRepo.findAll();
		List<UserDTO> userDTOlist = new ArrayList<UserDTO>();
		for (User user : userList) {
			userDTOlist.add(UserDTO.valueOf(user));
		}
		
		return userDTOlist;
	}
}
