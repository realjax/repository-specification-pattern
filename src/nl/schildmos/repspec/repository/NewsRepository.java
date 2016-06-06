package nl.schildmos.repspec.repository;

import nl.schildmos.repspec.models.News;
import nl.schildmos.specification.Specification;

import java.util.ArrayList;

/**
 * Created by jhuysmans on 4/13/15.
 */
public class NewsRepository implements Repository<News, Specification> {
    @Override
    public void add(News news) {

    }

    @Override
    public void delete(News news) {

    }

    @Override
    public void update(News news) {

    }

    @Override
    public ArrayList<News> findBySpecification(Specification specification) {
        return null;
    }
}
