package com.example1.demo1.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookid", referencedColumnName = "id")
    Set<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
