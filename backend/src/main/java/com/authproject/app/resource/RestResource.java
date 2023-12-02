package com.authproject.app.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestResource
{
	@GetMapping("/api/users/me")
	public ResponseEntity<UserProfile> profile()
	{
		
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String email = user.getUsername() + "@gmail.com"; //forms the email using username only
		
		UserProfile profile = new UserProfile();
		profile.setName(user.getUsername());
		profile.setEmail(email);
		
		return ResponseEntity.ok(profile);
		
		
	}
}