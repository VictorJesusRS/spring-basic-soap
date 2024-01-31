package com.example.demo5.mapper;


import com.example.demo5.entity.EmployeeEntity;
import com.example.demo5.gen.Employee;
import com.example.demo5.gen.StoreEmployeeRequest;
import com.example.demo5.repository.EmployeeRepository;
import com.example.demo5.repository.EmployeeRepositoryJPA;
import com.example.demo5.soap.EmployeeEndpoint;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "documentNumber", target = "documentNumber")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "documentType", target = "documentType")
    @Mapping(source = "birthday", target = "birthday")
    @Mapping(source = "linkingDate", target = "linkingDate")
    @Mapping(source = "role", target = "role")
    @Mapping(source = "salary", target = "salary")
    EmployeeEntity toEmployeeEntity(StoreEmployeeRequest employee);


//    default Date fromXMLGregorianCalendar(XMLGregorianCalendar date) {
//        return date == null ? null : date.toGregorianCalendar().getTime();
//    }

}
