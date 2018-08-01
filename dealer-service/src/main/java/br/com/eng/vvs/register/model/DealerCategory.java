package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class DealerCategory implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DEAL_SEQ")
    @SequenceGenerator(sequenceName = "seq_dealer", name = "DEAL_SEQ", allocationSize = 1)
    private Integer id;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DealerCategory{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
