package com.briup.cms.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cms_category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long code;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
