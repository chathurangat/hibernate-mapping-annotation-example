package com.chathurangaonline.examples.model;

import javax.persistence.*;

@Entity
@Table(name="Department")
public class Department {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
