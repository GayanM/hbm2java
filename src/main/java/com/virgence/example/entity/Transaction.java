package com.virgence.example.entity;
// Generated Jul 12, 2019 1:14:17 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Transaction generated by hbm2java
 */
@Entity
@Table(name="Transaction"
    ,catalog="corebanking_db"
)
public class Transaction  implements java.io.Serializable {


     private Integer id;
     private String accountId;
     private String amount;
     private String balanceAmount;
     private String balanceCreditDebitIndicator;
     private String balanceCurrency;
     private String balanceType;
     private String bankTransactionCode;
     private String bankTransactionSubCode;
     private String bookingDateTime;
     private String creditDebitIndicator;
     private String currency;
     private String proprietaryBankTransactionCode;
     private String proprietaryBankTransactionCodeIssuer;
     private String status;
     private String transactionId;
     private String transactionInformation;
     private String transactionReference;
     private String valueDateTime;

    public Transaction() {
    }

    public Transaction(String accountId, String amount, String balanceAmount, String balanceCreditDebitIndicator, String balanceCurrency, String balanceType, String bankTransactionCode, String bankTransactionSubCode, String bookingDateTime, String creditDebitIndicator, String currency, String proprietaryBankTransactionCode, String proprietaryBankTransactionCodeIssuer, String status, String transactionId, String transactionInformation, String transactionReference, String valueDateTime) {
       this.accountId = accountId;
       this.amount = amount;
       this.balanceAmount = balanceAmount;
       this.balanceCreditDebitIndicator = balanceCreditDebitIndicator;
       this.balanceCurrency = balanceCurrency;
       this.balanceType = balanceType;
       this.bankTransactionCode = bankTransactionCode;
       this.bankTransactionSubCode = bankTransactionSubCode;
       this.bookingDateTime = bookingDateTime;
       this.creditDebitIndicator = creditDebitIndicator;
       this.currency = currency;
       this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
       this.proprietaryBankTransactionCodeIssuer = proprietaryBankTransactionCodeIssuer;
       this.status = status;
       this.transactionId = transactionId;
       this.transactionInformation = transactionInformation;
       this.transactionReference = transactionReference;
       this.valueDateTime = valueDateTime;
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
    
    @Column(name="amount")
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    @Column(name="balance_amount")
    public String getBalanceAmount() {
        return this.balanceAmount;
    }
    
    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    
    @Column(name="balance_credit_debit_indicator")
    public String getBalanceCreditDebitIndicator() {
        return this.balanceCreditDebitIndicator;
    }
    
    public void setBalanceCreditDebitIndicator(String balanceCreditDebitIndicator) {
        this.balanceCreditDebitIndicator = balanceCreditDebitIndicator;
    }
    
    @Column(name="balance_currency")
    public String getBalanceCurrency() {
        return this.balanceCurrency;
    }
    
    public void setBalanceCurrency(String balanceCurrency) {
        this.balanceCurrency = balanceCurrency;
    }
    
    @Column(name="balance_type")
    public String getBalanceType() {
        return this.balanceType;
    }
    
    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }
    
    @Column(name="bank_transaction_code")
    public String getBankTransactionCode() {
        return this.bankTransactionCode;
    }
    
    public void setBankTransactionCode(String bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }
    
    @Column(name="bank_transaction_sub_code")
    public String getBankTransactionSubCode() {
        return this.bankTransactionSubCode;
    }
    
    public void setBankTransactionSubCode(String bankTransactionSubCode) {
        this.bankTransactionSubCode = bankTransactionSubCode;
    }
    
    @Column(name="booking_date_time")
    public String getBookingDateTime() {
        return this.bookingDateTime;
    }
    
    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }
    
    @Column(name="credit_debit_indicator")
    public String getCreditDebitIndicator() {
        return this.creditDebitIndicator;
    }
    
    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }
    
    @Column(name="currency")
    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    @Column(name="proprietary_bank_transaction_code")
    public String getProprietaryBankTransactionCode() {
        return this.proprietaryBankTransactionCode;
    }
    
    public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }
    
    @Column(name="proprietary_bank_transaction_code_issuer")
    public String getProprietaryBankTransactionCodeIssuer() {
        return this.proprietaryBankTransactionCodeIssuer;
    }
    
    public void setProprietaryBankTransactionCodeIssuer(String proprietaryBankTransactionCodeIssuer) {
        this.proprietaryBankTransactionCodeIssuer = proprietaryBankTransactionCodeIssuer;
    }
    
    @Column(name="status")
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="transaction_id")
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
    @Column(name="transaction_information")
    public String getTransactionInformation() {
        return this.transactionInformation;
    }
    
    public void setTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
    }
    
    @Column(name="transaction_reference")
    public String getTransactionReference() {
        return this.transactionReference;
    }
    
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }
    
    @Column(name="value_date_time")
    public String getValueDateTime() {
        return this.valueDateTime;
    }
    
    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }




}


