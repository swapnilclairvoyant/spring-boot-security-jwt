package com.example1.demo1.model;

import javax.persistence.*;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/5/2020, Wed
 **/
@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "text")
    private String text;

    @ManyToOne(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id", nullable = true)
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", user=" + user +
                '}';
    }
}
