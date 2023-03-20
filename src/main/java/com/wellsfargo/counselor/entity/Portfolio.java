package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @Column(nullable = false)
    private string createDate;

    protected Portfolio() {

    }

    public Portfolio(String createDate) {
        this.createDate = createDate;
    }

    public Long getCreateDate() { return createDate; }

    public void setCreateDate(String createDate) { this.createDate = createDate; }
}
