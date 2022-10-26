package by.it.avramchuk.registration.service;

import by.it.avramchuk.registration.entity.User;

public interface ClientService {
    void singIn(String login, String password);
    void signOut(String login);
    void registration(User user) throws ServiceException;
}
