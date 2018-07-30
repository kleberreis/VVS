package br.com.eng.vvs.wallet.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.JsonLocalDateTimeSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import br.com.eng.vvs.commons.utils.LocalDateTimeConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Transaction implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    @JsonSerialize(using = JsonLocalDateTimeSerializer.class)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime transactionDate;

    private Integer returnTime;

    private String returnCode;

    private Integer operatorId;

    private Integer rechargePointId;

    private Integer pointSaleId;

    private Integer dealerId;

    private Integer amountRegion;

    private Integer subDealerId;

    private Float balance;

    private String msisdn;

    @ManyToOne
    private TransactionType transactionType;

    @ManyToOne
    private Wallet wallet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Integer returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getRechargePointId() {
        return rechargePointId;
    }

    public void setRechargePointId(Integer rechargePointId) {
        this.rechargePointId = rechargePointId;
    }

    public Integer getPointSaleId() {
        return pointSaleId;
    }

    public void setPointSaleId(Integer pointSaleId) {
        this.pointSaleId = pointSaleId;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getAmountRegion() {
        return amountRegion;
    }

    public void setAmountRegion(Integer amountRegion) {
        this.amountRegion = amountRegion;
    }

    public Integer getSubDealerId() {
        return subDealerId;
    }

    public void setSubDealerId(Integer subDealerId) {
        this.subDealerId = subDealerId;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionDate=" + transactionDate +
                ", returnTime=" + returnTime +
                ", returnCode='" + returnCode + '\'' +
                ", operatorId=" + operatorId +
                ", rechargePointId=" + rechargePointId +
                ", pointSaleId=" + pointSaleId +
                ", dealerId=" + dealerId +
                ", amountRegion=" + amountRegion +
                ", subDealerId=" + subDealerId +
                ", balance=" + balance +
                ", msisdn='" + msisdn + '\'' +
                ", transactionType=" + transactionType +
                ", wallet=" + wallet +
                '}';
    }
}
