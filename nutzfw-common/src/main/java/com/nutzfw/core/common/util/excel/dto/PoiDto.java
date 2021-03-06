/*
 * Copyright (c) 2019- 2019 threefish(https://gitee.com/threefish https://github.com/threefish) All Rights Reserved.
 * 本项目完全开源，商用完全免费。但请勿侵犯作者合法权益，如申请软著等。
 * 最后修改时间：2019/10/07 18:27:07
 * 源 码 地 址：https://gitee.com/threefish/NutzFw
 */

package com.nutzfw.core.common.util.excel.dto;


import com.nutzfw.core.common.util.DateUtil;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 黄川
 * @date : 2017/6/1717:33
 * excel模版格式规范
 */
@Data
public class PoiDto {
    /**
     * 唯一key
     */
    private String       ctxKey               = "";
    /**
     * 类型  list多行多列数据      data单个单元格数据 img是单图片
     */
    private String       type                 = "";
    /**
     * 图片兼容
     */
    private PoiImagesDTO img;
    /**
     * 默认时间格式
     */
    private String       dateFormat           = DateUtil.YYYY_MM_DD_ZH;
    /**
     * 纵向扩展多少条数据
     */
    private int          X;
    /**
     * 横向排列数据
     */
    private String[]     Y;
    /**
     * 自动插入行及样式
     */
    private boolean      autoInsertStyleRow   = false;
    /**
     * 忽略合并单元格
     */
    private boolean      merged               = true;
    /**
     * 横向相同合并
     */
    private boolean      horizontalLikeMerged = false;
    /**
     * 纵向相同合并
     */
    private boolean      verticalLikeMerged   = false;

    public String[] getY() {
        if (this.Y == null) {
            return new String[0];
        }
        return Y;
    }


}
