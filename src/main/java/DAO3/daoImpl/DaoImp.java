package DAO3.daoImpl;

import DAO3.dao.Dao;
import DAO3.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DaoImp implements Dao<User> {

    private List<User> users = new ArrayList<>();

    public DaoImp() {
        users.add(new User("Aqil","aqilzeka99@gmail.com"));
        users.add(new User("Example","example@gmail.com"));
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(params[0],"Name cannot be null"));
        user.setEmail(Objects.requireNonNull(params[1],"Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
