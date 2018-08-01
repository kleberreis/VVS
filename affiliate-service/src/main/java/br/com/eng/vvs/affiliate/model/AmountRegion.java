package br.com.eng.vvs.affiliate.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;
import javax.swing.plaf.synth.Region;

@Entity
public class AmountRegion implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AMT_REG_SEQ")
    @SequenceGenerator(sequenceName = "seq_amount_region", name = "AMT_REG_SEQ", allocationSize = 1)
    private Integer id;

    @ManyToOne
    private Amount amount;

    @ManyToOne
    private RegionCode regionCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public RegionCode getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(RegionCode regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public String toString() {
        return "AmountRegion{" +
                "id=" + id +
                ", amount=" + amount +
                ", regionCode=" + regionCode +
                '}';
    }
}
