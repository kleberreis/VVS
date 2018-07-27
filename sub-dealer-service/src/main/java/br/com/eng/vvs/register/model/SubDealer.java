package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class SubDealer implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SUB_DEAL_SEQ")
    @SequenceGenerator(sequenceName = "seq_sub_dealer", name = "SUB_DEAL_SEQ", allocationSize = 1)
    private Integer id;

    private Integer dealerId;

    @ManyToOne
    private Status status;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubDealer{" +
                "id=" + id +
                ", dealerId=" + dealerId +
                ", status=" + status +
                '}';
    }
}
