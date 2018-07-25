package br.com.eng.vvs.commons.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Criado por Raphael em 24/07/18.
 */
public class JsonLocalDateSerializer extends StdSerializer<LocalDate> {
    public JsonLocalDateSerializer() {
        this(null);
    }

    public JsonLocalDateSerializer(Class t) {
        super(t);
    }

    @Override
    public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(localDate.toString());
    }
}
