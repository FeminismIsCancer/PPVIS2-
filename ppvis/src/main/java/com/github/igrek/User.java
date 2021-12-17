package com.github.igrek;

import lombok.Value;

@Value
public class User {
    String login;
    String password;
    String email;
}
