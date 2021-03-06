package com.jxy.graduation_pro.entity;

    import java.io.Serializable;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.NoArgsConstructor;
    import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class RealWages implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
             * 员工编号
             */
    private Integer userId;

            /**
            * 员工姓名
            */
    private String userName;

            /**
            * 部门id
            */
    private Integer deptId;

            /**
            * 月基本工资
            */
    private Double basicSalary;

            /**
            * 加班补助
            */
    private Double realOvertimeBenefitsr;


            /**
            * 考勤扣款
            */
    private Double realTimeDedution;

            /**
            * 应缴税额
            */
    private Double realTaxPaybale;

            /**
            * 实发工资
            */
    private Double realNetPayroll;

            /**
            * 时间
            */
    private String realTime;

            /**
            * 审核状态 0为未审核 1为审核通过
            */
    private Integer realActive;


}
