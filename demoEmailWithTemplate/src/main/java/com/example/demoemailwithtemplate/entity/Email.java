package com.example.demoemailwithtemplate.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
public class Email {
private Map<String, Object> properties;
private String text;
private String from;
private String to;
private String subject;
private String template;
}
