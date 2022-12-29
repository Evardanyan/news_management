package interfaces;

import java.util.List;

public interface Repository<T> {

    List<T> readAll();

    T readById(final Long id);

    T create(final T id);

    T update(final T id);

    Boolean deleteById(final Long id);

    Boolean isExistById(final Long id);


}
