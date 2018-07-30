package br.com.eng.vvs.payment.model;

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
public class PaymentCycle implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PAY_CY_SEQ")
    @SequenceGenerator(sequenceName = "seq_payment_cycle", name = "PAY_CY_SEQ", allocationSize = 1)
    private Integer id;

    private Float amout;

    @JsonSerialize(using = JsonLocalDateTimeSerializer.class)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime orderDateTime;

    private Integer dealerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmout() {
        return amout;
    }

    public void setAmout(Float amout) {
        this.amout = amout;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public String toString() {
        return "PaymentCycle{" +
                "id=" + id +
                ", amout=" + amout +
                ", orderDateTime=" + orderDateTime +
                ", dealerId=" + dealerId +
                '}';
    }
}
