package com.kovshov.Rest.Shop.model.role;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    USER("user"),
    ADMIN("admin");

    private String permition;

    Role(String permition) {
        this.permition = permition;
    }

    public String getPermition() {
        return permition;
    }
}
