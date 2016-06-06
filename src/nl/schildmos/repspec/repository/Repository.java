package nl.schildmos.repspec.repository;

import nl.schildmos.specification.Specification;

import java.util.List;

/**
 * Created by jhuysmans on 4/13/15.
 */
public interface Repository<T,S extends Specification> {

    void add(T t);
    void delete(T t);
    void update(T t);
    List<T> findBySpecification(S s);

}
