package com.briup.cms.bean;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;

@Entity
@Table(name="cms_article")
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String author;
    private int clickTime;
    private String content;
    private Data publishDate;
    private String title;
}