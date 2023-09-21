package com.social.app.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long billId;
    private Date time;
    @ManyToOne
    @JoinColumn(name="document_Id")
    private Document document;

    @ManyToOne
    @JoinColumn(name="user_Id")
    private User user;

}
