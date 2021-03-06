package com.jxy.graduation_pro.entity;

    import java.time.LocalDate;
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
public class CapitalAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 日期
            */
    private LocalDate capitalDate;

            /**
            * 科目代码
            */
    private Integer capitalSubjectId;

            /**
            * 科目名称
            */
    private String capitalSubjectName;

            /**
            * 借方总金额
            */
    private Double capitalDebitAmount;

            /**
            * 贷方总金额
            */
    private Double capitalCrebitAmount;


}
