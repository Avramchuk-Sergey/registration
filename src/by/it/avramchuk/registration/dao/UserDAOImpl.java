package by.it.avramchuk.registration.dao;

import by.it.avramchuk.registration.dao.util.Logger;
import by.it.avramchuk.registration.entity.User;

public class UserDAOImpl implements UserDAO{
    @Override
    public void signIn(String login, String password) {

    }

    @Override
    public void registration(User user) throws DAOException{

        Logger.getInstance().log(user);
    }
}
