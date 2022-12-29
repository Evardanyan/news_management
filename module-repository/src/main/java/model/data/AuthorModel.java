package model.data;

import java.util.Objects;

public class AuthorModel
{
    private Long id;
    private String name;

    public AuthorModel(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthorModel) {
            final AuthorModel that = (AuthorModel)obj;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }
}
