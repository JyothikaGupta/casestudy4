package com.example.task4;

import java.io.Serializable;

public class Record implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String data;

    public Record() {}

    public Record(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}