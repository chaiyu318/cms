package com.briup.cms.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cms_link")
public class Link implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
