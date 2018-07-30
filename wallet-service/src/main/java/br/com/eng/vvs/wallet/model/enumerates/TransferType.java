package br.com.eng.vvs.wallet.model.enumerates;

/**
 * Criado por Raphael em 27/07/18.
 */
public enum TransferType {
    DEALER_TO_SUB_DEALER,
    DEALER_TO_RECHARGE_POINT,
    DEALER_TO_OPERATOR,
    DEALER_TO_POINT_SALE,
    DEALER_FROM_SUB_DEALER,
    DEALER_FROM_RECHARGE_POINT,
    DEALER_FROM_OPERATOR,
    DEALER_FROM_POINT_SALE,

    SUB_DEALER_TO_RECHARGE_POINT,
    SUB_DEALER_TO_OPERATOR,
    SUB_DEALER_TO_POINT_SALE,
    SUB_DEALER_FROM_RECHARGE_POINT,
    SUB_DEALER_FROM_OPERATOR,
    SUB_DEALER_FROM_POINT_SALE,

    RECHARGE_POINT_TO_OPERATOR,
    RECHARGE_POINT_TO_POINT_SALE,
    RECHARGE_POINT_FROM_OPERATOR,
    RECHARGE_POINT_FROM_POINT_SALE,

    OPERATOR_TO_POINT_SALE,
    OPERATOR_FROM_POINT_SALE;

    public boolean isTo() {
        return this.name().contains("_TO_");
    }

    public boolean isFrom() {
        return this.name().contains("_FROM_");
    }
}
