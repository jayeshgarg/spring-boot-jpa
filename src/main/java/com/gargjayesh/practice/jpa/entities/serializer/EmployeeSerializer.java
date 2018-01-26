package com.gargjayesh.practice.jpa.entities.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.gargjayesh.practice.jpa.entities.Employee;

import java.io.IOException;

public class EmployeeSerializer extends StdSerializer<Employee> {

    public EmployeeSerializer() {
        this(null);
    }

    public EmployeeSerializer(Class<Employee> t) {
        super(t);
    }

    @Override
    public void serialize(
            Employee value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException {

        jgen.writeStartObject();
        jgen.writeNumberField("id", value.getId());
        jgen.writeStringField("employeeName", value.getEmployeeName());
        jgen.writeStringField("designation", value.getDesignation());
        jgen.writeStringField("manager", value.getManager() == null ? "-No Manager-" : value.getManager().getEmployeeName());
        jgen.writeEndObject();
    }
}