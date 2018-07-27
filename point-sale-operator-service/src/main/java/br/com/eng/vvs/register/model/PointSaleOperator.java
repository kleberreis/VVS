package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import com.sun.org.glassfish.gmbal.ManagedAttribute;

import javax.persistence.*;

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

    @Override
    public String toString() {
        return "PointSaleOperator{" +
                "id=" + id +
                ", pointSaleId=" + pointSaleId +
                ", operatorId=" + operatorId +
                ", status=" + status +
                '}';
    }
}
