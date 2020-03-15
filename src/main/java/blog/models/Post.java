package blog.models;

import java.util.Date;

public class Post{

    private Long id;
    private String author;
    private String postBody;
    private String title;
    private Date date=new Date();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post() {}

    public Post(Long id, String author, String postBody, String title, Date date) {
        this.id = id;
        this.author = author;
        this.postBody = postBody;
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", postBody='" + postBody + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}