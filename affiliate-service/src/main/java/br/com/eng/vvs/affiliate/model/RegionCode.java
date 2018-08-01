package br.com.eng.vvs.affiliate.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class RegionCode implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "R_CODE_SEQ")
    @SequenceGenerator(sequenceName = "seq_region_code", name = "R_CODE_SEQ", allocationSize = 1)
    private Integer id;

    private Integer code;

    @ManyToOne
    private Affiliate affiliate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }

    @Override
    public String toString() {
        return "RegionCode{" +
                "id=" + id +
                ", code=" + code +
                ", affiliate=" + affiliate +
                '}';
    }
}
