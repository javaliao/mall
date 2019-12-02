package com.javaliao.backstage.bean;


public class TbSellerProductPostSale {

  private long id;
  private long sellerProductId;
  private String postSalePics;
  private String postSaleExplain;
  private String postSaleService;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSellerProductId() {
    return sellerProductId;
  }

  public void setSellerProductId(long sellerProductId) {
    this.sellerProductId = sellerProductId;
  }


  public String getPostSalePics() {
    return postSalePics;
  }

  public void setPostSalePics(String postSalePics) {
    this.postSalePics = postSalePics;
  }


  public String getPostSaleExplain() {
    return postSaleExplain;
  }

  public void setPostSaleExplain(String postSaleExplain) {
    this.postSaleExplain = postSaleExplain;
  }


  public String getPostSaleService() {
    return postSaleService;
  }

  public void setPostSaleService(String postSaleService) {
    this.postSaleService = postSaleService;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }

}
