package com.kovshov.Rest.Shop.facade;

import com.kovshov.Rest.Shop.dto.OrderDTO;
import com.kovshov.Rest.Shop.dto.UserDTO;
import com.kovshov.Rest.Shop.model.Order;
import com.kovshov.Rest.Shop.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {

    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setBalance(user.getBalance());
        userDTO.setCompanyList(user.getAllCompanyAsString());
        userDTO.setItemList(user.getAllItemsAsString());
        return userDTO;
    }
}
