package academy.prog.myshortenlink;

// DTO = data transfer object

public class UrlDTO {
    protected String url;
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
