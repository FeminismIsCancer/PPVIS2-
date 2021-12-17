package com.github.igrek;

import lombok.Data;

@Data
public class AuthorizationManager {
    String authorization(String login, String password) {
        return "";
    }

    boolean enterLogin(String login) {
        return false;
    }
    
    boolean enterPassword(String password) {
        return false;    
    }

    boolean checkLogin(String login) {
        return false;
    }

    boolean checkPassword(String password) {
        return false;
    }

    boolean isEverythingIsCorrect(String everything) {
        return false;
    }
}
