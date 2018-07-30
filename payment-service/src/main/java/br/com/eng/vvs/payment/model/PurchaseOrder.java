package br.com.eng.vvs.payment.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
public class PurchaseOrder implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    private Float balance;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate cycleOpendate;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate cycleCloseDate;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate cyclePaymentDate;

    private Integer paymentPeriod;

    private Integer paymentCycle;

    private Integer dealerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public LocalDate getCycleOpendate() {
        return cycleOpendate;
    }

    public void setCycleOpendate(LocalDate cycleOpendate) {
        this.cycleOpendate = cycleOpendate;
    }

    public LocalDate getCycleCloseDate() {
        return cycleCloseDate;
    }

    public void setCycleCloseDate(LocalDate cycleCloseDate) {
        this.cycleCloseDate = cycleCloseDate;
    }

    public LocalDate getCyclePaymentDate() {
        return cyclePaymentDate;
    }

    public void setCyclePaymentDate(LocalDate cyclePaymentDate) {
        this.cyclePaymentDate = cyclePaymentDate;
    }

    public Integer getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(Integer paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public Integer getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(Integer paymentCycle) {
        this.paymentCycle = paymentCycle;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", balance=" + balance +
                ", cycleOpendate=" + cycleOpendate +
                ", cycleCloseDate=" + cycleCloseDate +
                ", cyclePaymentDate=" + cyclePaymentDate +
                ", paymentPeriod=" + paymentPeriod +
                ", paymentCycle=" + paymentCycle +
                ", dealerId=" + dealerId +
                '}';
    }
}
