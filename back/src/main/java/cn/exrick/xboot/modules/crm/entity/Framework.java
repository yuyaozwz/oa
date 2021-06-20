package cn.exrick.xboot.modules.crm.entity;

import cn.exrick.xboot.base.XbootBaseEntity;
import cn.exrick.xboot.common.constant.CommonConstant;
import cn.exrick.xboot.modules.crm.entity.KeShangType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 郑为中
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "t_framework")
@TableName("t_framework")
@ApiModel(value = "组织架构档案")
public class Framework extends XbootBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "姓名")
    private String title;

    @ApiModelProperty(value = "父id")
    private String parentId;

    @ApiModelProperty(value = "是否为父节点(含子节点) 默认false")
    private Boolean isParent = false;

    @ApiModelProperty(value = "排序值")
    @Column(precision = 10, scale = 2)
    private BigDecimal sortOrder;

    @ApiModelProperty(value = "是否启用 0启用 -1禁用")
    private Integer status = CommonConstant.STATUS_NORMAL;

    @ApiModelProperty(value = "角色备注")
    private String remark;

    @ApiModelProperty(value = "类型编码")
    private String number;

    @ApiModelProperty(value = "价格类型")
    private String jiageType;

    @Transient
    @TableField(exist=false)
    @ApiModelProperty(value = "父节点名称")
    private String parentTitle;

    @Transient
    @TableField(exist=false)
    @ApiModelProperty(value = "子部门")
    private List<Framework> children=new ArrayList<Framework>();

    @Transient
    @TableField(exist=false)
    @ApiModelProperty(value = "扩展")
    private boolean expand=true;

    @ApiModelProperty(value = "电话")
    private String mobile;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "学校")
    private String school;

    @ApiModelProperty(value = "学历")
    private String schoolLevel;

    @ApiModelProperty(value = "专业")
    private String major;

}