package com.erp.sale.controller;

import com.erp.sale.model.SysMenu;
import com.erp.sale.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sale/sysMenu")
public class SysMenuController {

    @Autowired
    private ISysMenuService sysMenuService;

    @PostMapping("/list")
    public List<SysMenu> list() {
        List<SysMenu> result = sysMenuService.list(null);
        return result;
    }
}
