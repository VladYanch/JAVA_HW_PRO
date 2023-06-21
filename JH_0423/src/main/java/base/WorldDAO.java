package base;

import java.util.List;
import java.util.Optional;

public interface WorldDAO<T> {

    List<T> getAll();

    Optional<T> get(int id);

    void save(T t);

    void delete(int id);

}
