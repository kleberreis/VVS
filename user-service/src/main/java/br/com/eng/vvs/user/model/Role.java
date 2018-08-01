package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

/**
 * Criado por Raphael em 18/07/18.
 */
@Entity
public class Role implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ROLE_SEQ")
    @SequenceGenerator(sequenceName = "seq_role", name = "ROLE_SEQ", allocationSize = 1)
    private Integer id;

    private String description;

    public Role() {
    }

    @Override
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
        return "Role{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
