package br.com.eng.vvs.distributor.model;

import java.util.Calendar;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Distributor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DISTRIB_SEQ")
	@SequenceGenerator(sequenceName="seq_distributor", name = "DISTRIB_SEQ", allocationSize=1)
	private Integer id;
	
	private String externalId;
	
	private String name;
	
	private String brandName;
	
	private String address;
	
	private String city;
	
	//province
	
	private String email;
	
	private String phone;
	
	//language Integer
	
	//AFFILIATE_ID 
	
	//BANKID
	
	private String bankAgency;
	
	private String bankAgencyDv;
	
	private String bankAccount;
	
	private String bankAccountDv;
	
	private String bankOurNumber;
	
	//status
	
	private Calendar creationDate;
	
	private String createdBy;
	
	private Calendar lastModificationDate;
	
	private String lastModifiedBy;
	
	private BigDecimal balance;
	
	private BigDecimal frozenBalance;
	
	private Integer blockReason;
	
	private String blockDescription;
	
	private String fiscalId;
	
	//SALESTYPE NUMBER(1,0) DEFAULT NULL NOT NULL ENABLE,
	
	private BigDecimal discount;
	
	private BigDecimal creditLimit;
	
	private Integer paymentPeriod; 
	
	private Integer paymentCyclePeriod;
	
	private BigDecimal minimumBalance;
	
	private BigDecimal moneySalesTarget;
	
	private BigDecimal performedSalesTarget;
	
	//DISTRIBUTOR_CATEGORY_ID NUMBER(10,0)
	
	private BigDecimal minimumSalePercentage;
	
	private Calendar lastLowSaleNotifDate;
	
	private Calendar deletionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getBankAgency() {
		return bankAgency;
	}

	public void setBankAgency(String bankAgency) {
		this.bankAgency = bankAgency;
	}

	public String getBankAgencyDv() {
		return bankAgencyDv;
	}

	public void setBankAgencyDv(String bankAgencyDv) {
		this.bankAgencyDv = bankAgencyDv;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankAccountDv() {
		return bankAccountDv;
	}

	public void setBankAccountDv(String bankAccountDv) {
		this.bankAccountDv = bankAccountDv;
	}

	public String getBankOurNumber() {
		return bankOurNumber;
	}

	public void setBankOurNumber(String bankOurNumber) {
		this.bankOurNumber = bankOurNumber;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Calendar lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(BigDecimal frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public Integer getBlockReason() {
		return blockReason;
	}

	public void setBlockReason(Integer blockReason) {
		this.blockReason = blockReason;
	}

	public String getBlockDescription() {
		return blockDescription;
	}

	public void setBlockDescription(String blockDescription) {
		this.blockDescription = blockDescription;
	}

	public String getFiscalId() {
		return fiscalId;
	}

	public void setFiscalId(String fiscalId) {
		this.fiscalId = fiscalId;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getPaymentPeriod() {
		return paymentPeriod;
	}

	public void setPaymentPeriod(Integer paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}

	public Integer getPaymentCyclePeriod() {
		return paymentCyclePeriod;
	}

	public void setPaymentCyclePeriod(Integer paymentCyclePeriod) {
		this.paymentCyclePeriod = paymentCyclePeriod;
	}

	public BigDecimal getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(BigDecimal minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public BigDecimal getMoneySalesTarget() {
		return moneySalesTarget;
	}

	public void setMoneySalesTarget(BigDecimal moneySalesTarget) {
		this.moneySalesTarget = moneySalesTarget;
	}

	public BigDecimal getPerformedSalesTarget() {
		return performedSalesTarget;
	}

	public void setPerformedSalesTarget(BigDecimal performedSalesTarget) {
		this.performedSalesTarget = performedSalesTarget;
	}

	public BigDecimal getMinimumSalePercentage() {
		return minimumSalePercentage;
	}

	public void setMinimumSalePercentage(BigDecimal minimumSalePercentage) {
		this.minimumSalePercentage = minimumSalePercentage;
	}

	public Calendar getLastLowSaleNotifDate() {
		return lastLowSaleNotifDate;
	}

	public void setLastLowSaleNotifDate(Calendar lastLowSaleNotifDate) {
		this.lastLowSaleNotifDate = lastLowSaleNotifDate;
	}

	public Calendar getDeletionDate() {
		return deletionDate;
	}

	public void setDeletionDate(Calendar deletionDate) {
		this.deletionDate = deletionDate;
	}

	@Override
	public String toString() {
		return "Distributor [id=" + id + ", externalId=" + externalId + ", name=" + name + ", brandName=" + brandName
				+ ", address=" + address + ", city=" + city + ", email=" + email + ", phone=" + phone + ", bankAgency="
				+ bankAgency + ", bankAgencyDv=" + bankAgencyDv + ", bankAccount=" + bankAccount + ", bankAccountDv="
				+ bankAccountDv + ", bankOurNumber=" + bankOurNumber + ", creationDate=" + creationDate + ", createdBy="
				+ createdBy + ", lastModificationDate=" + lastModificationDate + ", lastModifiedBy=" + lastModifiedBy
				+ ", balance=" + balance + ", frozenBalance=" + frozenBalance + ", blockReason=" + blockReason
				+ ", blockDescription=" + blockDescription + ", fiscalId=" + fiscalId + ", discount=" + discount
				+ ", creditLimit=" + creditLimit + ", paymentPeriod=" + paymentPeriod + ", paymentCyclePeriod="
				+ paymentCyclePeriod + ", minimumBalance=" + minimumBalance + ", moneySalesTarget=" + moneySalesTarget
				+ ", performedSalesTarget=" + performedSalesTarget + ", minimumSalePercentage=" + minimumSalePercentage
				+ ", lastLowSaleNotifDate=" + lastLowSaleNotifDate + ", deletionDate=" + deletionDate + "]";
	}
	
	
}
