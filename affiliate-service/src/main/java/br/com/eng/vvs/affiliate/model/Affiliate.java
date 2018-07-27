package br.com.eng.vvs.affiliate.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class Affiliate implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AFF_SEQ")
    @SequenceGenerator(sequenceName = "seq_affiliate", name = "AFF_SEQ", allocationSize = 1)
    private Integer id;

    private String name;

    private String email;

    private Integer provinceId;

    @ManyToOne
    private TelcoOperator telcoOperator;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public TelcoOperator getTelcoOperator() {
        return telcoOperator;
    }

    public void setTelcoOperator(TelcoOperator telcoOperator) {
        this.telcoOperator = telcoOperator;
    }

    @Override
    public String toString() {
        return "Affiliate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", provinceId=" + provinceId +
                ", telcoOperator=" + telcoOperator +
                '}';
    }
}
