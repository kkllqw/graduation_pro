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
public class BasicWages implements Serializable {

    private static final long serialVersionUID = 1L;


            /**
             * 员工编号
             */
    private Integer userId;

            /**
            * 员工姓名
            */
    private String userName;

            /**
            * 员工部门
            */
    private Integer deptId;

            /**
            * 员工基本工资
            */
    private Double basicSalary;

            /**
            * 状态 0 为禁用 1为正常2为未填写
            */
    private Integer basicStatus;


}
