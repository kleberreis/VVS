package br.com.eng.vvs.commons.contants;

/**
 * Criado por Raphael em 24/07/18.
 */
public class JsonEntity {
    public static class CITY {
        public static String CLASS_NAME = "city";
        public static String ID = "id";
        public static String NAME = "name";
        public static String PROVINCE = "province";
    }

    public static class DEALER {
        public static String CLASS_NAME = "dealer";
        public static String ID = "id";
        public static String NAME = "name";
        public static String ANDDRESS = "address";
        public static String EMAIL = "email";
        public static String PHONE = "phone";
        public static String CREATION_DATE = "creationDate";
        public static String MOD_DATE = "modDate";
        public static String CITY_ID = "cityId";
        public static String AFFILIATE_ID = "affiliateId";
        public static String STATUS = "status";
    }

    public static class OPERATION {
        public static String CLASS_NAME = "operation";
        public static String ID = "id";
        public static String OPERATION = "operation";
        public static String DESCRIPTION = "description";
    }

    public static class OPERATOR {
        public static String CLASS_NAME = "operator";
        public static String ID = "id";
        public static String PIN = "pin";
        public static String USER_ID = "userId";
        public static String STATUS = "status";
        public static String POINT_SALE_ID = "pointSaleId";
    }

    public static class POINT_SALE {
        public static String CLASS_NAME = "pointSale";
        public static String ID = "id";
        public static String MSISDN = "msisdn";
        public static String IMEI = "imei";
        public static String CRAETE_DATE = "createDate";
        public static String AMOUNT = "amount";
    }

    public static class POINT_SALE_OPERATOR {
        public static String CLASS_NAME = "pointSaleOperator";
        public static String ID = "id";
        public static String POINT_SALE_ID = "pointSaleId";
        public static String OPERATOR_ID = "operatorId";
        public static String STATUS = "status";
    }

    public static class PROVINCE {
        public static String CLASS_NAME = "province";
        public static String ID = "id";
        public static String INITIALS = "initials";
        public static String NAME = "name";
    }

    public static class RECHARGE_POINT {
        public static String CLASS_NAME = "rechargePoint";
        public static String ID = "id";
        public static String NAME = "name";
        public static String ANDDRESS = "address";
        public static String EMAIL = "email";
        public static String PHONE = "phone";
        public static String CREATION_DATE = "creationDate";
        public static String DEALER_ID = "dealerId";
        public static String STATUS = "status";
        public static String CITY_ID = "cityId";
        public static String AMOUNT = "amount";
    }

    public static class ROLE {
        public static String CLASS_NAME = "role";
        public static String ID = "id";
        public static String DESCRIPTION = "description";
    }

    public static class ROLE_OPERATION {
        public static String CLASS_NAME = "roleOperation";
        public static String ID = "id";
        public static String ROLE = "role";
        public static String OPERATION = "operation";
    }

    public static class STATUS {
        public static String CLASS_NAME = "status";
        public static String ID = "id";
        public static String DESCRIPTION = "description";
        public static String REASON = "reason";
    }

    public static class SUB_DEALER {
        public static String CLASS_NAME = "subDealer";
        public static String ID = "id";
        public static String DEALER_ID = "dealerId";
        public static String STATUS = "status";
    }

    public static class USER {
        public static String CLASS_NAME = "user";
        public static String ID = "id";
        public static String LOGIN = "name";
        public static String PASSWORD = "password";
        public static String NAME = "name";
        public static String EMAIL = "email";
        public static String PHONE = "phone";
        public static String ANDDRESS = "address";
        public static String ZIP_CODE = "zipCode";
        public static String CITY_ID = "cityId";
        public static String LAST_LOGIN_DATE = "lastLoginDate";
        public static String LAST_PASSWORD_DATE = "lastPasswordDate";
        public static String CREATION_DATE = "creationDate";
        public static String EXPIRATION_DATE = "expirationDate";
        public static String ROLE = "role";
        public static String PASSWORD_RAW = "passwordRaw";
        public static String CITY_NAME = "cityName";
        public static String PROVINCE_NAME = "provinceName";
        public static String LAST_LOGIN_DATE_CACHE = "lastLoginDateCache";
    }

    public static class USER_PASSWORD_HISTORY {
        public static String CLASS_NAME = "userPasswordHistory";
        public static String ID = "id";
        public static String USER = "user";
        public static String PASSWORD = "password";
        public static String INSERT_DATE = "insertDate";
    }
}
