package by.it.avramchuk.registration.service;

import by.it.avramchuk.registration.dao.DAOException;
import by.it.avramchuk.registration.dao.DAOFactory;
import by.it.avramchuk.registration.dao.UserDAO;
import by.it.avramchuk.registration.entity.User;

public class ClientServiceImpl implements ClientService{
    @Override
    public void singIn(String login, String password) {

    }

    @Override
    public void signOut(String login) {

    }

    @Override
    public void registration(User user) throws ServiceException{
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();

        Validator.getInstance().validation(user);

        try{
            userDAO.registration(user);

        } catch ( DAOException e ){
            throw new ServiceException(e);
        }

    }
}
