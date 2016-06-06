package nl.schildmos.repspec.specification;

/**
 * Created by jhuysmans on 4/30/15.
 */
public class NotSpecification<T> extends AbstractSpecification<T> {

    private Specification<T> other;

    public NotSpecification(Specification<T> other){
        this.other = other;
    }

    @Override
    public boolean isSatisfiedBy(T t){
        return !other.isSatisfiedBy(t);
    }

}


