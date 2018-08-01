package br.com.eng.vvs.affiliate.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class Amount implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AMT_SEQ")
    @SequenceGenerator(sequenceName = "seq_amount", name = "AMT_SEQ", allocationSize = 1)
    private Integer id;

    private Float amount;

    private String description;

    @ManyToOne
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
