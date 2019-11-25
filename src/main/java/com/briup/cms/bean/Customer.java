package com.briup.cms.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cms_customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
