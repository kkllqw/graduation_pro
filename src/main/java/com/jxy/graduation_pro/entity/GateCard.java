package com.jxy.graduation_pro.entity;

    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author jxy
* @since 2021-02-24
*/
    @Data
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class GateCard implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 员工编号
            */
    private Integer userId;

            /**
            * 正常出勤天数
            */
    private Double attendanceDay;

            /**
            * 迟到次数
            */
    private Integer laterNumber;

            /**
            * 加班总时长
            */
    private Double totalOvertimeHoursOne;

            /**
             * 周末加班总时长
             */
    private Double totalOvertimeHoursTwo;

            /**
             * 节假日加班总时长
             */
    private Double totalOvertimeHoursThree;

            /**
            * 调休总时长
            */
    private Double totalAdjustmentHours;

            /**
            * 请假总天数
            */
    private Double totalLeaveHours;

            /**
             * 时间
             */
    private String realTime;



}
