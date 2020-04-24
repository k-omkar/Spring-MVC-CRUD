package blog.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="posts")
public class Post{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User author;

    @Column(nullable = false, length = 100)
    private String title;

    @Column
    private String postBody;

    @Column
    private Date date=new Date();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
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

    public Post(Long id, User author, String postBody, String title, Date date) {
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