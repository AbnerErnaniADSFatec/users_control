package users_control.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import users_control.model.Message;
import users_control.views.Views;

@RestController
@RequestMapping(value = "user")
public class UsersController {

	@JsonView(Views.Public.class)
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	public Message hello() {
		try {
			return new Message("Boas vindas!","O clássico hello world!");
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Users list not found can not connect", e);
	   	}
	}
}