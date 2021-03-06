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
public class GainAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private LocalDate gainDate;

            /**
            * 现金总资产
            */
    private Double gainBalance;

            /**
            * 总负债
            */
    private Double gainGrossDebt;

            /**
            * 所有者权益
            */
    private Double gain;


}
