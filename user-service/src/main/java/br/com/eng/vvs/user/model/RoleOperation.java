package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

/**
 * Criado por Raphael em 18/07/18.
 */
@Entity
public class RoleOperation implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ROLE_OP_SEQ")
    @SequenceGenerator(sequenceName = "seq_role_operation", name = "ROLE_OP_SEQ", allocationSize = 1)
    private Integer id;

    @ManyToOne
    private Role role;

    @ManyToOne
    private Operation operation;

    public RoleOperation() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
