package br.com.eng.vvs.province.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.wallet.model.Province;

import javax.persistence.*;

@Entity
public class City implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    private String name;

    @ManyToOne
    private br.com.eng.vvs.wallet.model.Province province;

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

    public br.com.eng.vvs.wallet.model.Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }


}
