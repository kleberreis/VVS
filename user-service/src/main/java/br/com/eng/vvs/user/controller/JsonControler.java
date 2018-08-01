package br.com.eng.vvs.user.controller;

import br.com.eng.vvs.commons.contants.JsonEntity;
import br.com.eng.vvs.user.model.User;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * Criado por Raphael em 24/07/18.
 */
public class JsonControler {
    public static void populateUserCity(User user) {
        if (user == null || user.getCityId() == null)
            return;
        RestTemplate restTemplate = new RestTemplate();

        HashMap jsonMap = restTemplate.getForObject(String.format("http://localhost:8081/city%d", user.getCityId()), HashMap.class);

        if (jsonMap.containsKey(JsonEntity.CITY.NAME))
            user.setCityName(jsonMap.get(JsonEntity.CITY.NAME).toString());
        if (jsonMap.containsKey(JsonEntity.PROVINCE.CLASS_NAME)) {
            HashMap jsonProvince = (HashMap) jsonMap.get(JsonEntity.PROVINCE.CLASS_NAME);
            if (jsonProvince.containsKey(JsonEntity.PROVINCE.NAME))
                user.setProvinceName(jsonProvince.get(JsonEntity.PROVINCE.NAME).toString());
        }
    }
}
