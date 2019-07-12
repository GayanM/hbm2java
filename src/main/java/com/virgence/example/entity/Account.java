package com.virgence.example.entity;
// Generated Jul 12, 2019 1:14:17 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="Account"
    ,catalog="corebanking_db"
)
public class Account  implements java.io.Serializable {


     private Integer id;
     private String accountId;
     private String accountSubType;
     private String accountType;
     private String currency;
     private String nickname;
     private String status;
     private String statusUpdateDateTime;

    public Account() {
    }

    public Account(String accountId, String accountSubType, String accountType, String currency, String nickname, String status, String statusUpdateDateTime) {
       this.accountId = accountId;
       this.accountSubType = accountSubType;
       this.accountType = accountType;
       this.currency = currency;
       this.nickname = nickname;
       this.status = status;
       this.statusUpdateDateTime = statusUpdateDateTime;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="account_id")
    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    @Column(name="account_sub_type")
    public String getAccountSubType() {
        return this.accountSubType;
    }
    
    public void setAccountSubType(String accountSubType) {
        this.accountSubType = accountSubType;
    }
    
    @Column(name="account_type")
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    @Column(name="currency")
    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    @Column(name="nickname")
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    @Column(name="status")
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="status_update_date_time")
    public String getStatusUpdateDateTime() {
        return this.statusUpdateDateTime;
    }
    
    public void setStatusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }




}


