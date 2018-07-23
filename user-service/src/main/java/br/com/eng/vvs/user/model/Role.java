package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

/**
 * Criado por Raphael em 18/07/18.
 */
@Entity
@Table(name = "ROLES")
public class Role implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ROLE_SEQ")
    @SequenceGenerator(sequenceName = "seq_role", name = "ROLE_SEQ", allocationSize = 1)
    private Integer id;

    public Role() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
