package com.social.app.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Token_Payment_History")
public class TokenPaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long toHistoryId;
    private long amountToken;
    private Date time;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;


}
