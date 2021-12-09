package com.erp.sale.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_menu")
public class SysMenu {

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    //名称
    private String label;

    //排序
    private int	orderBy;

    //父id
    private int	parentId;

    //路径
    private String path;

    //图标
    private String icon;
}
