package com.mobiliya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobiliya.demo.model.Message;

@RestController
@RequestMapping(path = "/app")
public class Controller {

	@GetMapping(path = "/getmessage/", produces = "application/json")
	public Message getEmployees() {
		return new Message("123", "this is test API deployed in GCP kubernetes with global IP ");
	}

}
