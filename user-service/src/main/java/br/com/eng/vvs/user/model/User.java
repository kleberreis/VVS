package br.com.eng.vvs.user.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

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

    private String address;

    private String email;

    private String phone;

    @Transient
    private LocalDate lastLoginDate;

    @Transient
    private LocalDate lastLoginDateCache;

    @ManyToOne
    private Role role;

    private String area;

    private Boolean changePassword;

    @Transient
    private LocalDate lastPasswordDate;

    private String blockReason;

    private String blockDescription;

    @Transient
    private LocalDate creationDate;

    @Transient
    private LocalDate expirationDate;

    @Transient
    private String passwordRaw;

    private String remoteLogin;

    private Boolean blockedInactivity;

    private Boolean passwordExpired;

    private Boolean externalAuthentication;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Boolean getChangePassword() {
        return changePassword;
    }

    public void setChangePassword(Boolean changePassword) {
        this.changePassword = changePassword;
    }

    public LocalDate getLastPasswordDate() {
        return lastPasswordDate;
    }

    public void setLastPasswordDate(LocalDate lastPasswordDate) {
        this.lastPasswordDate = lastPasswordDate;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public String getBlockDescription() {
        return blockDescription;
    }

    public void setBlockDescription(String blockDescription) {
        this.blockDescription = blockDescription;
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

    public String getRemoteLogin() {
        return remoteLogin;
    }

    public void setRemoteLogin(String remoteLogin) {
        this.remoteLogin = remoteLogin;
    }

    public Boolean getBlockedInactivity() {
        return blockedInactivity;
    }

    public void setBlockedInactivity(Boolean blockedInactivity) {
        this.blockedInactivity = blockedInactivity;
    }

    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public Boolean getExternalAuthentication() {
        return externalAuthentication;
    }

    public void setExternalAuthentication(Boolean externalAuthentication) {
        this.externalAuthentication = externalAuthentication;
    }
}
