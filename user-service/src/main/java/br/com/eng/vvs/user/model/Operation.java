package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

/**
 * Criado por Raphael em 18/07/18.
 */
@Entity
public class Operation implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "OPE_SEQ")
    @SequenceGenerator(sequenceName = "seq_operation", name = "OPE_SEQ", allocationSize = 1)
    private Integer id;

    private String operation;

    private String description;

    public Operation() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", operation='" + operation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
