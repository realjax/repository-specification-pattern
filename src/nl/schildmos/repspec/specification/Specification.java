package nl.schildmos.repspec.specification;

/**
 * Created by jhuysmans on 4/13/15.
 */
public interface Specification<T> {

    boolean isSatisfiedBy(T candidate);
    Specification<T> and(Specification<T> other);
    Specification<T> or(Specification<T> other);
    Specification<T> not();


}
