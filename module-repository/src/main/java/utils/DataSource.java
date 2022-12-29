package utils;

import model.data.AuthorData;
import model.data.AuthorModel;
import model.data.NewsData;
import model.data.NewsModel;

import java.util.List;

public class DataSource
{
    private final List<NewsModel> news;

    private DataSource() {
        final List<AuthorModel> authorList = AuthorData.getAuthorData().getAuthorList();
        this.news = NewsData.getNewsData(authorList).getNewsList();
    }

    private static class LazyDataSource
    {
        static final DataSource INSTANCE;

        static {
            INSTANCE = new DataSource();
        }
    }

    public static DataSource getInstance() {
        return DataSource.LazyDataSource.INSTANCE;
    }

    public List<NewsModel> getNews() {
        return this.news;
    }
}
