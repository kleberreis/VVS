package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class BankInfo implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DEAL_SEQ")
    @SequenceGenerator(sequenceName = "seq_dealer", name = "DEAL_SEQ", allocationSize = 1)
    private Integer id;

    private Integer agency;
    private Integer agencyDigit;
    private Long account;
    private Integer accountDigit;
    private Integer ourNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Integer getAgencyDigit() {
        return agencyDigit;
    }

    public void setAgencyDigit(Integer agencyDigit) {
        this.agencyDigit = agencyDigit;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Integer getAccountDigit() {
        return accountDigit;
    }

    public void setAccountDigit(Integer accountDigit) {
        this.accountDigit = accountDigit;
    }

    public Integer getOurNumber() {
        return ourNumber;
    }

    public void setOurNumber(Integer ourNumber) {
        this.ourNumber = ourNumber;
    }

    @Override
    public String toString() {
        return "BankInfo{" +
                "id=" + id +
                ", agency=" + agency +
                ", agencyDigit=" + agencyDigit +
                ", account=" + account +
                ", accountDigit=" + accountDigit +
                ", ourNumber=" + ourNumber +
                '}';
    }
}
