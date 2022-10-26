package by.it.avramchuk.registration.service;

import static by.it.avramchuk.registration.service.Patterns.*;

import by.it.avramchuk.registration.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private static final Validator instance = new Validator();

    public static final int MIN_PASSWORD_SIZE = 10;
    public static final String LOGIN = "Login";
    public static final String PASSWORD = "Password";

    private Validator(){

    }

    public static Validator getInstance() {
        return instance;
    }

    public boolean validation(User user) throws ValidationException{
        String login = user.getLogin();
        String password = user.getPassword();
        List<String> incorrectFields = new ArrayList<>();

        if(!validateLogin(login)){
            incorrectFields.add(LOGIN);
        }

        if(!validatePassword(password)){
            incorrectFields.add(PASSWORD);
        }

        if(!incorrectFields.isEmpty()){
            throw new ValidationException(incorrectFields);
        }

        return true;
    }

    private boolean validateLogin(String login){

       return login.matches(EMAIL_ADDRESS);
    }

    private boolean validatePassword(String password){

        return password.matches(VALID_PASSWORD) & password.length()>= MIN_PASSWORD_SIZE;
    }
}
