package com.byyuengc.api.entity;
import lombok.Data;

@Data
public class User {
    private String mobile;
    private double cash;
    private double cashGift;
    private int role;
    private int status;
    private int created;
    private int updated;
}
