package br.com.eng.vvs.register.model;

import java.time.LocalDate;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;

@Entity
@Table(name = "POINT_OF_SALE_OPERATOR")
public class PointSaleOperator implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    private Integer pointSaleId;

    private Integer operatorId;

    @ManyToOne
    private Status status;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPointSaleId() {
        return pointSaleId;
    }

    public void setPointSaleId(Integer pointSaleId) {
        this.pointSaleId = pointSaleId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "PointSaleOperator{" +
                "id=" + id +
                ", pointSaleId=" + pointSaleId +
                ", operatorId=" + operatorId +
                ", status=" + status +
                ", creationDate=" + creationDate +
                '}';
    }
}
