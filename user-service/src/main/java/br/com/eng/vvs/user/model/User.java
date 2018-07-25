package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import br.com.eng.vvs.commons.utils.JsonLocalDateSerializer;
import br.com.eng.vvs.commons.utils.LocalDateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "USERS")
public class User implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "USERS_SEQ")
    @SequenceGenerator(sequenceName = "seq_users", name = "USERS_SEQ", allocationSize = 1)
    private Integer id;

    private String login;

    private String password;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String zipCode;

    private Integer cityId;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate lastLoginDate;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate lastPasswordDate;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate creationDate;

    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate expirationDate;

    @ManyToOne
    private Role role;

    @Transient
    private String passwordRaw;

    @Transient
    private String cityName;

    @Transient
    private String provinceName;

    @Transient
    @JsonSerialize(using = JsonLocalDateSerializer.class)
    private LocalDate lastLoginDateCache;

    public User() {
        this.creationDate = LocalDate.now();
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public LocalDate getLastLoginDateCache() {
        return lastLoginDateCache;
    }

    public void setLastLoginDateCache(LocalDate lastLoginDateCache) {
        this.lastLoginDateCache = lastLoginDateCache;
    }

    public LocalDate getLastPasswordDate() {
        return lastPasswordDate;
    }

    public void setLastPasswordDate(LocalDate lastPasswordDate) {
        this.lastPasswordDate = lastPasswordDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPasswordRaw() {
        return passwordRaw;
    }

    public void setPasswordRaw(String passwordRaw) {
        this.passwordRaw = passwordRaw;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", role=" + role +
                ", lastLoginDate=" + lastLoginDate +
                ", lastLoginDateCache=" + lastLoginDateCache +
                ", lastPasswordDate=" + lastPasswordDate +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                ", passwordRaw='" + passwordRaw + '\'' +
                '}';
    }
}
