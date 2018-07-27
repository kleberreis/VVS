package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class Operator implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    private String pin;

    private Integer userId;

    @ManyToOne
    private Status status;

    private Integer pointSaleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getPointSaleId() {
        return pointSaleId;
    }

    public void setPointSaleId(Integer pointSaleId) {
        this.pointSaleId = pointSaleId;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
                ", pin='" + pin + '\'' +
                ", userId=" + userId +
                ", status=" + status +
                ", pointSaleId=" + pointSaleId +
                '}';
    }
}
