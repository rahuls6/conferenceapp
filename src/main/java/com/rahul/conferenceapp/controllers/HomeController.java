package com.rahul.conferenceapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${app.version}")
	private String appVersion;

	@RequestMapping("/") 
	public Map<String,String> getVersion() {
		Map<String,String> versionMap = new HashMap<String,String>();
		versionMap.put("app-version", appVersion);
		return versionMap;
	}

}
