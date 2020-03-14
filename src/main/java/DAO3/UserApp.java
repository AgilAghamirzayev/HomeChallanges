package DAO3;

import DAO3.dao.Dao;
import DAO3.daoImpl.DaoImp;
import DAO3.model.User;

import java.util.Optional;

public class UserApp {
    private static Dao<User> userDao;

    public static void main(String[] args) {
        userDao = new DaoImp();

        User user1 = getUser(0);
        System.out.println(user1.getName());
        userDao.update(user1, new String[]{"Aqil","aqil@gmail.com"});

        User user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new User("Julie","julie@domain.com"));

        userDao.getAll().forEach(user -> user.getName());
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);

        return user.orElseGet(()-> new User("non-existing user","no-email"));
    }
}
