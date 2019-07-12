package com.virgence.example.entity;
// Generated Jul 12, 2019 1:14:17 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Initiation generated by hbm2java
 */
@Entity
@Table(name="Initiation"
    ,catalog="corebanking_db"
)
public class Initiation  implements java.io.Serializable {


     private Integer id;
     private String creditorAccountIdentification;
     private String creditorAccountName;
     private String creditorAccountSchemeName;
     private String creditorAccountSecondaryIdentification;
     private String domesticPaymentId;
     private String endToEndIdentification;
     private String instructedAmount;
     private String instructedAmountCurrency;
     private String instructionIdentification;
     private String remittanceInformationReference;
     private String remittanceInformationUnstructured;

    public Initiation() {
    }

    public Initiation(String creditorAccountIdentification, String creditorAccountName, String creditorAccountSchemeName, String creditorAccountSecondaryIdentification, String domesticPaymentId, String endToEndIdentification, String instructedAmount, String instructedAmountCurrency, String instructionIdentification, String remittanceInformationReference, String remittanceInformationUnstructured) {
       this.creditorAccountIdentification = creditorAccountIdentification;
       this.creditorAccountName = creditorAccountName;
       this.creditorAccountSchemeName = creditorAccountSchemeName;
       this.creditorAccountSecondaryIdentification = creditorAccountSecondaryIdentification;
       this.domesticPaymentId = domesticPaymentId;
       this.endToEndIdentification = endToEndIdentification;
       this.instructedAmount = instructedAmount;
       this.instructedAmountCurrency = instructedAmountCurrency;
       this.instructionIdentification = instructionIdentification;
       this.remittanceInformationReference = remittanceInformationReference;
       this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="creditor_account_identification")
    public String getCreditorAccountIdentification() {
        return this.creditorAccountIdentification;
    }
    
    public void setCreditorAccountIdentification(String creditorAccountIdentification) {
        this.creditorAccountIdentification = creditorAccountIdentification;
    }
    
    @Column(name="creditor_account_name")
    public String getCreditorAccountName() {
        return this.creditorAccountName;
    }
    
    public void setCreditorAccountName(String creditorAccountName) {
        this.creditorAccountName = creditorAccountName;
    }
    
    @Column(name="creditor_account_scheme_name")
    public String getCreditorAccountSchemeName() {
        return this.creditorAccountSchemeName;
    }
    
    public void setCreditorAccountSchemeName(String creditorAccountSchemeName) {
        this.creditorAccountSchemeName = creditorAccountSchemeName;
    }
    
    @Column(name="creditor_account_secondary_identification")
    public String getCreditorAccountSecondaryIdentification() {
        return this.creditorAccountSecondaryIdentification;
    }
    
    public void setCreditorAccountSecondaryIdentification(String creditorAccountSecondaryIdentification) {
        this.creditorAccountSecondaryIdentification = creditorAccountSecondaryIdentification;
    }
    
    @Column(name="domestic_payment_id")
    public String getDomesticPaymentId() {
        return this.domesticPaymentId;
    }
    
    public void setDomesticPaymentId(String domesticPaymentId) {
        this.domesticPaymentId = domesticPaymentId;
    }
    
    @Column(name="end_to_end_identification")
    public String getEndToEndIdentification() {
        return this.endToEndIdentification;
    }
    
    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }
    
    @Column(name="instructed_amount")
    public String getInstructedAmount() {
        return this.instructedAmount;
    }
    
    public void setInstructedAmount(String instructedAmount) {
        this.instructedAmount = instructedAmount;
    }
    
    @Column(name="instructed_amount_currency")
    public String getInstructedAmountCurrency() {
        return this.instructedAmountCurrency;
    }
    
    public void setInstructedAmountCurrency(String instructedAmountCurrency) {
        this.instructedAmountCurrency = instructedAmountCurrency;
    }
    
    @Column(name="instruction_identification")
    public String getInstructionIdentification() {
        return this.instructionIdentification;
    }
    
    public void setInstructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
    }
    
    @Column(name="remittance_information_reference")
    public String getRemittanceInformationReference() {
        return this.remittanceInformationReference;
    }
    
    public void setRemittanceInformationReference(String remittanceInformationReference) {
        this.remittanceInformationReference = remittanceInformationReference;
    }
    
    @Column(name="remittance_information_unstructured")
    public String getRemittanceInformationUnstructured() {
        return this.remittanceInformationUnstructured;
    }
    
    public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
        this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    }




}


