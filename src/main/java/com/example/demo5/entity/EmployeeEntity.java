package com.example.demo5.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
@Data
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "document_type")
    private String documentType;

    @DateTimeFormat(pattern="dd/MM/yyyy", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "birthday")
    private Date birthday;

    @DateTimeFormat(pattern="dd/MM/yyyy", iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "linking_date")
    private Date linkingDate;

    @Column(name = "role")
    private String role;

    @Column(name = "salary")
    private Double salary;
}