package com.erp.customer.controller;

import com.erp.customer.model.AssemblyInspection;
import com.erp.customer.service.IAssemblyInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer/assemblyInspection")
public class AssemblyInspectionController {

    @Autowired
    private IAssemblyInspectionService assemblyInspectionService;

    @PostMapping("/list")
    public List<AssemblyInspection> list() {
        List<AssemblyInspection> result = assemblyInspectionService.list(null);
        return result;
    }
}
