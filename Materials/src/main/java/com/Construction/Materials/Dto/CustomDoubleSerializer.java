package com.Construction.Materials.Dto;

import java.io.IOException;
import java.text.DecimalFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomDoubleSerializer extends JsonSerializer<Double> {
     private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(decimalFormat.format(value));
    }
    
}
