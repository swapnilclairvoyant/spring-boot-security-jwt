package com.example1.demo1.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Entity
@Table(name = "paper")
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "authorid", referencedColumnName = "id", nullable = true)
    private Set<Author> authors;

    @OneToMany(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "periodicalid", referencedColumnName = "id", nullable = true)
    private Set<Periodical> periodicals;

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

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<Periodical> getPeriodicals() {
        return periodicals;
    }

    public void setPeriodicals(Set<Periodical> periodicals) {
        this.periodicals = periodicals;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", periodicals=" + periodicals +
                '}';
    }
}
