package by.it.avramchuk.registration.dao.util;

import by.it.avramchuk.registration.dao.DAOException;
import by.it.avramchuk.registration.entity.User;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Logger {

    private static final Logger instance = new Logger();
    public static final String FILE_NAME = "users.txt";

    private Logger(){

    }

    public static Logger getInstance(){
        return instance;
    }

    public void log(User user) throws DAOException{
        String userData = formUserData(user);

        String pathToUsersTxt = PathCreator.getPathTo(FILE_NAME);

        try(PrintWriter out = new PrintWriter(pathToUsersTxt)){
            out.println(userData);
        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        }
    }

    private String formUserData(User user){

        return "NAME="+user.getName()+", "
                +"LOGIN="+user.getLogin()+", "
                +"PASSWORD="+user.getPassword();
    }
}
