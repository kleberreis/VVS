package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "POINT_OF_SALE")
public class PointSale implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PT_SL_SEQ")
    @SequenceGenerator(sequenceName = "seq_point_sale", name = "PT_SL_SEQ", allocationSize = 1)
    private Integer id;

    private String msisdn;

    private String imei;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate createDate;

    private Float amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PointSale{" +
                "id=" + id +
                ", msisdn='" + msisdn + '\'' +
                ", imei='" + imei + '\'' +
                ", createDate=" + createDate +
                ", amount=" + amount +
                '}';
    }
}
