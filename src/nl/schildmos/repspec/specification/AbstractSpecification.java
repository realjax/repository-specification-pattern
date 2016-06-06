package nl.schildmos.repspec.specification;

abstract public class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean isSatisfiedBy(T candidate);

    public Specification<T> and(Specification<T> other){
        return new AndSpecification<T>(this, other);
    }

    public Specification<T> or(Specification<T> other){
        return new OrSpecification<T>(this, other);
    }

    public Specification<T> not(){
        return new NotSpecification<T>(this);
    }
}