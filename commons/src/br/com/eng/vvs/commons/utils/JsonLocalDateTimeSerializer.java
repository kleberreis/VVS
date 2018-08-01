package br.com.eng.vvs.commons.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Criado por Raphael em 24/07/18.
 */
public class JsonLocalDateTimeSerializer extends StdSerializer<LocalDateTime> {
    public JsonLocalDateTimeSerializer() {
        this(null);
    }

    public JsonLocalDateTimeSerializer(Class t) {
        super(t);
    }

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(localDateTime.toString());
    }
}
