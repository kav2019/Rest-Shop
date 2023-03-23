package com.kovshov.Rest.Shop.controllers;

import com.kovshov.Rest.Shop.dto.UserDTO;
import com.kovshov.Rest.Shop.facade.UserFacade;
import com.kovshov.Rest.Shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
    private final UserFacade userFacade;

    @Autowired
    public UserController(UserService userService, UserFacade userFacade) {
        this.userService = userService;
        this.userFacade = userFacade;
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> userDTOList = userService.getAllUsers()
                .stream()
                .map(userFacade::userToUserDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(userDTOList, HttpStatus.OK);
    }
}
