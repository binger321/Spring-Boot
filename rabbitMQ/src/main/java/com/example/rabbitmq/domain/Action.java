package com.example.rabbitmq.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/24 0024
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class Action {
    /**
     * 速度   cm/s
     */
    private Integer speed;

    /**
     * 距离   cm
     */
    private Integer distance;

    /**
     * 方向 前后左右，东西南北
     */
    private String direction;

    /**
     * 持续时间  s
     */
    private Integer moveTime;
}