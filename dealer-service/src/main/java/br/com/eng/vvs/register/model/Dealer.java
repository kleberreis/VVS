package br.com.eng.vvs.register.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Dealer implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DEAL_SEQ")
    @SequenceGenerator(sequenceName = "seq_dealer", name = "DEAL_SEQ", allocationSize = 1)
    private Integer id;

    private String name;

    private String address;

    private String email;

    private String phone;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate creationDate;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate modDate;

    private Integer cityId;

    private Integer affiliateId;

    @ManyToOne
    private Status status;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getModDate() {
        return modDate;
    }

    public void setModDate(LocalDate modDate) {
        this.modDate = modDate;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(Integer affiliateId) {
        this.affiliateId = affiliateId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", creationDate=" + creationDate +
                ", modDate=" + modDate +
                ", cityId=" + cityId +
                ", affiliateId=" + affiliateId +
                ", status=" + status +
                '}';
    }
}
