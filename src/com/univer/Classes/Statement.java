package com.univer.Classes;

import java.util.List;

public class Statement {
    private List<String> identificator;
    private String type;
    private String value;

    public Statement(String identificator, String type, String value) {
        this.identificator.add(identificator);
        this.type = type;
        this.value = value;
    }

    public List<String> getIdentificator() {
        return identificator;
    }

    public void setIdentificator(String identificator) {
        this.identificator.add(identificator);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Statement statement = (Statement) o;

        if (!identificator.equals(statement.identificator)) return false;
        if (!type.equals(statement.type)) return false;
        return value.equals(statement.value);

    }

    @Override
    public int hashCode() {
        int result = identificator.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }
}
