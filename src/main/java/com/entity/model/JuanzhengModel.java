package com.entity.model;

import com.entity.JuanzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 捐赠信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JuanzhengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 求助
     */
    private Integer qiuzhuId;


    /**
     * 捐赠渠道
     */
    private Integer juanzhengTypes;


    /**
     * 捐赠金额
     */
    private Double juanzhengNumber;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：求助
	 */
    public Integer getQiuzhuId() {
        return qiuzhuId;
    }


    /**
	 * 设置：求助
	 */
    public void setQiuzhuId(Integer qiuzhuId) {
        this.qiuzhuId = qiuzhuId;
    }
    /**
	 * 获取：捐赠渠道
	 */
    public Integer getJuanzhengTypes() {
        return juanzhengTypes;
    }


    /**
	 * 设置：捐赠渠道
	 */
    public void setJuanzhengTypes(Integer juanzhengTypes) {
        this.juanzhengTypes = juanzhengTypes;
    }
    /**
	 * 获取：捐赠金额
	 */
    public Double getJuanzhengNumber() {
        return juanzhengNumber;
    }


    /**
	 * 设置：捐赠金额
	 */
    public void setJuanzhengNumber(Double juanzhengNumber) {
        this.juanzhengNumber = juanzhengNumber;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
