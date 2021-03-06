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
public class CredenceTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 日期
            */
    private LocalDate credenceDate;

            /**
            * 凭证类别
            */
    private String credenceType;

            /**
            * 科目代码
            */
    private Integer credenceSubjectId;

            /**
            * 科目名称
            */
    private String credenceSubjectName;

            /**
            * 摘要
            */
    private String credenceSummer;

            /**
            * 借方金额
            */
    private Double credenceDebit;

            /**
            * 贷方金额
            */
    private Double credenceCredit;

            /**
            * 出纳人
            */
    private String credenceApplicant;

            /**
            * 会计人
            */
    private String credenceAuditor;


}
