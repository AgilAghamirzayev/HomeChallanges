package DAO;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(long id);
    List<T> getAll();
    void save(T t);
    void update(T t, String[] params);
    void delete();

    void delete(User user);
}
