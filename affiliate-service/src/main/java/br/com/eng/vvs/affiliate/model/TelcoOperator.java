package br.com.eng.vvs.affiliate.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class TelcoOperator implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TL_OP_SEQ")
    @SequenceGenerator(sequenceName = "seq_telco_operator", name = "TL_OP_SEQ", allocationSize = 1)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TelcoOperator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
