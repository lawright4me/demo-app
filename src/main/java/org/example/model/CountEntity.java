package org.example.model;

import jakarta.persistence.*;

@Entity
public class CountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int requestCount; // Тип оставляем int

    public CountEntity() {}

    // Геттеры и сеттеры
    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }
}