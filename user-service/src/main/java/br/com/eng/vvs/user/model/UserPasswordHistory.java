package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Criado por Raphael em 19/07/18.
 */
@Entity
@Table(name = "USER_PASSWORD_HISTORY")
public class UserPasswordHistory implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "USER_HIST_SEQ")
    @SequenceGenerator(sequenceName = "seq_user_hist", name = "USER_HIST_SEQ", allocationSize = 1)
    private Integer id;

    @ManyToOne
    private User user;

    private String password;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate insertDate;

    public UserPasswordHistory() {
    }

    public UserPasswordHistory(User user) {
        this.user = user;
        this.password = user.getPassword();
        this.insertDate = LocalDate.now();
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDate insertDate) {
        this.insertDate = insertDate;
    }
}
