package br.com.eng.vvs.user.model;

import javax.persistence.*;

/**
 * Criado por Raphael em 25/07/18.
 */
@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "STATUS_SEQ")
    @SequenceGenerator(sequenceName = "seq_status", name = "STATUS_SEQ", allocationSize = 1)
    private Integer id;

    private String description;

    private String reason;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
