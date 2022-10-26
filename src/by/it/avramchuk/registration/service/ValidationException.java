package by.it.avramchuk.registration.service;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends ServiceException{

    private List<String> incorrectFields = new ArrayList<>();

    public ValidationException(){
        super();
    }

    public ValidationException(String message){
        super(message);
    }

    public ValidationException(Exception e){
        super(e);
    }

    public ValidationException(String message, Exception e){
        super(message, e);
    }

    public ValidationException(List<String> incorrectFields){
        this.incorrectFields = incorrectFields;
    }

    public List<String> getIncorrectFields(){
        return incorrectFields;
    }

    public void addIncorrectField(String fieldName){
        incorrectFields.add(fieldName);
    }


}
