package nl.schildmos.repspec.repository;

import nl.schildmos.repspec.models.News;
import nl.schildmos.specification.AbstractSpecification;

/**
 * Created by jhuysmans on 4/13/15.
 */
public class IsHotNewsSpecification extends AbstractSpecification<News> {

    public boolean isSatisfiedBy(News news){

        //if news == niet meer dan zoveel dagen oud then

        return true;
    }

}
