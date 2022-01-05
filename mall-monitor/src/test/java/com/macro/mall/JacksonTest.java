package com.macro.mall;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Test;
import org.springframework.boot.test.json.JacksonTester;

import java.io.*;

public class JacksonTest {
    @Test
    public void testSer() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonEncoding jsonEncoding = JsonEncoding.UTF8;
        //create outputstream

        OutputStream outputStream = new ObjectOutputStream(new FileOutputStream(""));

        JsonGenerator generator = objectMapper.getFactory().createGenerator(outputStream, jsonEncoding);

        ObjectWriter writer = objectMapper.writer();
        writer.writeValue(generator,new Object());
        generator.flush();
    }
}
