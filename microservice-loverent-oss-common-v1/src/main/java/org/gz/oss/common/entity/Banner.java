/**
 * Copyright © 2014 GZJF Corp. All rights reserved.
 * This software is proprietary to and embodies the confidential
 * technology of GZJF Corp.  Possession, use, or copying
 * of this software and media is authorized only pursuant to a
 * valid written license from GZJF Corp or an authorized sublicensor.
 */
package org.gz.oss.common.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.gz.common.entity.BaseEntity;

/**
 * Banner 实体类
 * 
 * @author zhangguoliang
 * @date 2017-12-15
 */
public class Banner extends BaseEntity{

	private static final long serialVersionUID = 2516221028967275592L;
	
	/**
     * 主键Id 
     */
    private Integer id;
    /**
     * 图片地址
     */
    @NotNull(message = "图片地址不能为空")
    private String            image;
    /**
     * 配置类型（10：链接 20：售卖商品 30：租赁商品）
     */
    @NotNull(message = "配置类型不能为空")
    private Integer           type;
    /**
     * 链接地址
     */
    private String            linkUrl;
    /**
     * 商品型号id
     */
    private Long              modelId;
    /**
     * 排序号 
     */
    private Integer           position;

    /**
     * 产品id
     */
    private Long              productId;

    /**
     * imei
     */
    private String            imeiNo;
    
    /**
     * 商品sn
     */
    private String            snNo;

    /**
     * 创建人
     */
    private Long              createUserId;

    /**
     * 修改人
     */
    private Long              updateUserId;

    /**
     * 创建时间
     */
    private Date              createTime;

    /**
     * 最后修改时间
     */
    private Date              lastUpdateTime;

    /**
     * 型号名称
     */
    private String            modelName;

    /**
     * 规格批次值
     */
    private String            specBatchNoValues;

    /**
     * 新旧程度配置值
     */
    private String            configValue;

    /**
     * 物料分类ID
     */
    private Integer           materielClassId;

    /**
     * 物料品牌Id
     */
    private Integer           materielBrandId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getImeiNo() {
        return imeiNo;
    }

    public void setImeiNo(String imeiNo) {
        this.imeiNo = imeiNo;
    }

    public String getSnNo() {
        return snNo;
    }

    public void setSnNo(String snNo) {
        this.snNo = snNo;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSpecBatchNoValues() {
        return specBatchNoValues;
    }

    public void setSpecBatchNoValues(String specBatchNoValues) {
        this.specBatchNoValues = specBatchNoValues;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public Integer getMaterielClassId() {
        return materielClassId;
    }

    public void setMaterielClassId(Integer materielClassId) {
        this.materielClassId = materielClassId;
    }

    public Integer getMaterielBrandId() {
        return materielBrandId;
    }

    public void setMaterielBrandId(Integer materielBrandId) {
        this.materielBrandId = materielBrandId;
    }
    
}
