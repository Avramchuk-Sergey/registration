package by.it.avramchuk.registration.main;

import by.it.avramchuk.registration.entity.User;
import by.it.avramchuk.registration.service.ClientService;
import by.it.avramchuk.registration.service.ServiceException;
import by.it.avramchuk.registration.service.ServiceFactory;

public class Main {

    public static void main(String[] args) throws ServiceException {

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ClientService clientService = serviceFactory.getClientService();

        User user1 = new User("Petya", "petya@mail.ru", "123SDDadsgsg");
        //User user2 = new User("Vasya", "invalid", "123SDDadsgsg");
        User user3 = new User("Mitya", "mitya@mail.com", "124Df");

        clientService.registration(user1);
        clientService.registration(user3);
    }
}
