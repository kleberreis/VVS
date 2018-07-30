package br.com.eng.vvs.wallet.model;

import br.com.eng.vvs.wallet.model.enumerates.TransferType;

/**
 * Criado por Raphael em 25/07/18.
 */
public class Transfer {
    private TransferType type;
    private Float amount;
    private Integer assignorId;
    private Integer assigneeId;

    public TransferType getType() {
        return type;
    }

    public void setType(TransferType type) {
        this.type = type;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getAssignorId() {
        return assignorId;
    }

    public void setAssignorId(Integer assignorId) {
        this.assignorId = assignorId;
    }

    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "type=" + type +
                ", amount=" + amount +
                ", assignorId=" + assignorId +
                ", assigneeId=" + assigneeId +
                '}';
    }
}
