package com.zzyl.nursing.domain;

import java.math.BigDecimal;

import com.zzyl.common.annotation.Excel;
import com.zzyl.common.core.domain.BaseEntity;

import lombok.Data;  import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 护理等级对象 nursing_level
 *
 * @author zll
 * @date 2026-10-08
 */

@Data  @NoArgsConstructor
@AllArgsConstructor
@ApiModel("护理等级实体")
public class NursingLevel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @ApiModelProperty("主键ID")
    private Long id;

    /** 等级名称 */
    @Excel(name = "等级名称")
    @ApiModelProperty("等级名称")
    private String name;

    /** 护理计划ID */
    @Excel(name = "护理计划ID")
    @ApiModelProperty("护理计划ID")
    private Long planId;

    /** 护理费用 */
    @Excel(name = "护理费用")
    @ApiModelProperty("护理费用")
    private BigDecimal fee;

    /** 状态（0：禁用，1：启用） */
    @Excel(name = "状态", readConverterExp = "0=：禁用，1：启用")
    @ApiModelProperty("状态（0：禁用，1：启用）")
    private Integer status;

    /** 等级说明 */
    @Excel(name = "等级说明")
    @ApiModelProperty("等级说明")
    private String description;




}
