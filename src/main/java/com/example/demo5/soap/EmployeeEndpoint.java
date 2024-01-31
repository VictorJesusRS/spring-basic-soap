package com.example.demo5.soap;

import com.example.demo5.gen.StoreEmployeeRequest;
import com.example.demo5.gen.StoreEmployeeResponse;
import com.example.demo5.mapper.EmployeeMapper;
import com.example.demo5.repository.EmployeeRepository;
import com.example.demo5.repository.EmployeeRepositoryJPA;
import com.example.demo5.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {

    private static final String NAMESPACE_URI = "http://www.example.com/demo5/gen";

    private EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeEndpoint(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "storeEmployeeRequest")
    @ResponsePayload
    public StoreEmployeeResponse storeEmployee(@RequestPayload StoreEmployeeRequest request) {
        System.out.println(request.getBirthday());
        StoreEmployeeResponse response = new StoreEmployeeResponse();
        response.setSuccess(this.employeeService.store(employeeMapper.toEmployeeEntity(request)));
        return response;
    }
}

