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
public class CashierTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 日期
            */
    private LocalDate cashierDate;

            /**
            * 类别
            */
    private String cashierType;

            /**
            * 摘要
            */
    private String cashierSummary;

            /**
            * 借方金额
            */
    private Double cashierDebit;

            /**
            * 贷方金额
            */
    private Double  cashierCredit;

            /**
            * 余额
            */
    private Double  cashierBalance;

            /**
            * 申请人
            */
    private String cashierApplicant;

            /**
            * 审核人
            */
    private String cashierAuditor;

            /**
            * 图片
            */
    private String cashierPicture;

            /**
            * 流水号
            */
    private String cashierSerialNumber;


}
