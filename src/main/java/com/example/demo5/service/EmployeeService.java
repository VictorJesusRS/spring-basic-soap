package com.example.demo5.service;

import com.example.demo5.entity.EmployeeEntity;
import com.example.demo5.repository.EmployeeRepositoryJPA;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Getter
@Setter
public class EmployeeService {
    private final EmployeeRepositoryJPA employeeRepositoryJPA;

    @Autowired
    public EmployeeService(EmployeeRepositoryJPA employeeRepositoryJPA) {
        this.employeeRepositoryJPA = employeeRepositoryJPA;
    }

    public boolean store(EmployeeEntity employee) {
        try{
            System.out.println(employee.toString());
            this.employeeRepositoryJPA.save(employee);
            return true;
        }catch (RuntimeException e) {
            return false;
//            throw new RuntimeException("Employee store service failed");

        }
    }

    public String getDiffYears(Date date) {
        Date today = new Date();
        Integer diff = today.getYear() - date.getYear();

        if (diff != 0){
            if (date.getMonth() > today.getMonth() || (today.getMonth() == date.getMonth() && today.getDate() > date.getDate()))
            {
                diff--;
            }
        }
        return diff.toString();
    }

    public boolean isAdult(Integer yearsOld) {
        return yearsOld != null && yearsOld >= 18;
    }


}
