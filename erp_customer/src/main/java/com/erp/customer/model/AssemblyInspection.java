package com.erp.customer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("assembly_inspection")
public class AssemblyInspection {

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    //流水号
    private String serialNumber;

    //电站名称
    private String powerStationName;

    //订单号
    private String orderNumber;

    //间隔
    private String spacing;

    //产品类别
    private String productCategory;

    //产品型号
    private String productModel;

    //产品图号
    private String productDrawingNumber;

    //间隔编号
    private String intervalCode;

    //相号
    private String phaseNumber;

    //检查卡编号
    private String checkCardNumber;

    //提交人
    private String submitter;

    //提交时间
    private String submissionTime;

    //提交状态
    private String submissionStatus;

    //返工状态
    private String reworkStatus;

    //原检查卡
    private String originalInspectionCard;

}
