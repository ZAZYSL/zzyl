package com.zzyl.nursing.domain;


import com.zzyl.common.annotation.Excel;
import com.zzyl.common.core.domain.BaseEntity;

import lombok.Data;  import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 护理计划对象 nursing_plan
 *
 * @author zll
 * @date 2026-10-08
 */

@Data  @NoArgsConstructor
@AllArgsConstructor
@ApiModel("护理计划实体")
public class NursingPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @ApiModelProperty("编号")
    private Long id;

    /** 排序号 */
    @Excel(name = "排序号")
    @ApiModelProperty("排序号")
    private Integer sortNo;

    /** 名称 */
    @Excel(name = "名称")
    @ApiModelProperty("名称")
    private String planName;

    /** 状态 0禁用 1启用 */
    @Excel(name = "状态 0禁用 1启用")
    @ApiModelProperty("状态 0禁用 1启用")
    private Integer status;




}
