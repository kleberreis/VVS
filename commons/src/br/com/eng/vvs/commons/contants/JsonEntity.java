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

    public static class PROVINCE {
        public static String CLASS_NAME = "province";
        public static String ID = "id";
        public static String INITIALS = "initials";
        public static String NAME = "name";
    }

    public static class ROLE {
        public static String CLASS_NAME = "role";
        public static String ID = "id";
    }

    public static class USER {
        public static String CLASS_NAME = "user";
        public static String ID = "id";
        public static String LOGIN = "name";
        public static String PASSWORD = "password";
        public static String NAME = "name";
        public static String ANDDRESS = "address";
        public static String EMAIL = "email";
        public static String PHONE = "phone";
        public static String CITY_ID = "cityId";
        public static String LAST_LOGIN_DATE = "lastLoginDate";
        public static String LAST_LOGIN_DATE_CACHE = "lastLoginDateCache";
        public static String ROLE = "role";
        public static String AREA = "area";
        public static String CHANGE_PASSWORD = "changePassword";
        public static String LAST_PASSWORD_DATE = "lastPasswordDate";
        public static String BLOCK_REASON = "blockReason";
        public static String BLOCK_DESCRIPTION = "blockDescription";
        public static String CREATION_DATE = "creationDate";
        public static String EXPIRATION_DATE = "expirationDate";
        public static String PASSWORD_RAW = "passwordRaw";
        public static String REMOTE_LOGIN = "passwordLogin";
        public static String BLOCKED_INACTIVITY = "blockedInactivity";
        public static String PASSWORD_EXPIRED = "passwordExpired";
        public static String EXTERNAL_AUTHENTICATION = "externalAuthentication";
    }

    public static class USER_PASSWORD_HISTORY {
        public static String CLASS_NAME = "userPasswordHistory";
        public static String ID = "id";
        public static String USER = "user";
        public static String PASSWORD = "password";
        public static String INSERT_DATE = "insertDate";
    }
}
