package com.example1.demo1.model;

import javax.persistence.*;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
