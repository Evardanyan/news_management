package factory;


import implementation.NewsRepository;
import interfaces.Repository;
import model.data.NewsModel;

public class RepositoryFactory {
    private static RepositoryFactory instance;
    private final Repository<NewsModel> newsRepository;

    private RepositoryFactory() {
        this.newsRepository = new NewsRepository();
    }

    public static RepositoryFactory getInstance() {
        if (RepositoryFactory.instance == null) {
            RepositoryFactory.instance = new RepositoryFactory();
        }
        return RepositoryFactory.instance;
    }

    public Repository<NewsModel> getNewsRepository() {
        return this.newsRepository;
    }
}
