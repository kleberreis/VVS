package br.com.eng.vvs.wallet.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class Wallet implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    private Integer dealerId;
    private Integer rechargePointId;
    private Integer pointSaleId;
    private Integer subDealerId;
    private Float balance;
    private Integer creditLimit;
    private Integer usedLimit;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
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

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Integer getUsedLimit() {
        return usedLimit;
    }

    public void setUsedLimit(Integer usedLimit) {
        this.usedLimit = usedLimit;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", dealerId=" + dealerId +
                ", rechargePointId=" + rechargePointId +
                ", pointSaleId=" + pointSaleId +
                ", subDealerId=" + subDealerId +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", usedLimit=" + usedLimit +
                '}';
    }
}
