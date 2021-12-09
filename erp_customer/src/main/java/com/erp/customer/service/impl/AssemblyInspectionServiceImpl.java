package com.erp.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erp.customer.mapper.AssemblyInspectionMapper;
import com.erp.customer.model.AssemblyInspection;
import com.erp.customer.service.IAssemblyInspectionService;
import org.springframework.stereotype.Service;

@Service
public class AssemblyInspectionServiceImpl extends ServiceImpl<AssemblyInspectionMapper, AssemblyInspection> implements IAssemblyInspectionService {
}
