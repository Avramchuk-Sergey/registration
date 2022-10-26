package by.it.avramchuk.registration.dao;

import by.it.avramchuk.registration.entity.User;

public interface UserDAO {
    void signIn(String login, String password);
    void registration(User user) throws DAOException;
}
