package model.data;

import java.time.LocalDateTime;
import java.util.Objects;

public class NewsModel {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdatedDate;
    private Long authorId;

    public NewsModel(final Long id, final String title, final String content, final LocalDateTime createDate, final LocalDateTime lastUpdatedDate, final Long authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.authorId = authorId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(final LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public void setLastUpdatedDate(final LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(final Long authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof NewsModel) {
            final NewsModel newsModel = (NewsModel)o;
            return Objects.equals(this.id, newsModel.id) && Objects.equals(this.title, newsModel.title) && Objects.equals(this.content, newsModel.content) && Objects.equals(this.createDate, newsModel.createDate) && Objects.equals(this.lastUpdatedDate, newsModel.lastUpdatedDate) && Objects.equals(this.authorId, newsModel.authorId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title, this.content, this.createDate, this.lastUpdatedDate, this.authorId);
    }
}