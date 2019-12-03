package com.javaliao.backstage.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TbProduct implements Serializable {

  //表单类型都为String，所以这里将类型转换成String
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  @Column
  private Long sellerId;
  private String productSn;
  private String productName;
  private String productPic;
  private String productSale;
  private String productPice;
  private String productNowPrice;
  private String productBrand;
  private String productStock;
  private String productAppraise;
  private java.sql.Timestamp productPublishTime;
  private String productTitle;
  private String productSeller;
  private String productPlaceOfDelivery;
  private String productStatus;
  private String productWeight;
  private String productAlbumPics;
  private String productSpecifications;
  private String productCredit;
  private String productServiceIds;
  private String productDetailPics;
  private String productDescription;
  private String productIcon;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isDelete;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }


  public String getProductSn() {
    return productSn;
  }

  public void setProductSn(String productSn) {
    this.productSn = productSn;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getProductPic() {
    return productPic;
  }

  public void setProductPic(String productPic) {
    this.productPic = productPic;
  }


  public String getProductSale() {
    return productSale;
  }

  public void setProductSale(String productSale) {
    this.productSale = productSale;
  }


  public String getProductPice() {
    return productPice;
  }

  public void setProductPice(String productPice) {
    this.productPice = productPice;
  }


  public String getProductNowPrice() {
    return productNowPrice;
  }

  public void setProductNowPrice(String productNowPrice) {
    this.productNowPrice = productNowPrice;
  }


  public String getProductBrand() {
    return productBrand;
  }

  public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }


  public String getProductStock() {
    return productStock;
  }

  public void setProductStock(String productStock) {
    this.productStock = productStock;
  }


  public String getProductAppraise() {
    return productAppraise;
  }

  public void setProductAppraise(String productAppraise) {
    this.productAppraise = productAppraise;
  }


  public java.sql.Timestamp getProductPublishTime() {
    return productPublishTime;
  }

  public void setProductPublishTime(java.sql.Timestamp productPublishTime) {
    this.productPublishTime = productPublishTime;
  }


  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public String getProductSeller() {
    return productSeller;
  }

  public void setProductSeller(String productSeller) {
    this.productSeller = productSeller;
  }


  public String getProductPlaceOfDelivery() {
    return productPlaceOfDelivery;
  }

  public void setProductPlaceOfDelivery(String productPlaceOfDelivery) {
    this.productPlaceOfDelivery = productPlaceOfDelivery;
  }


  public String getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
  }


  public String getProductWeight() {
    return productWeight;
  }

  public void setProductWeight(String productWeight) {
    this.productWeight = productWeight;
  }


  public String getProductAlbumPics() {
    return productAlbumPics;
  }

  public void setProductAlbumPics(String productAlbumPics) {
    this.productAlbumPics = productAlbumPics;
  }


  public String getProductSpecifications() {
    return productSpecifications;
  }

  public void setProductSpecifications(String productSpecifications) {
    this.productSpecifications = productSpecifications;
  }


  public String getProductCredit() {
    return productCredit;
  }

  public void setProductCredit(String productCredit) {
    this.productCredit = productCredit;
  }


  public String getProductServiceIds() {
    return productServiceIds;
  }

  public void setProductServiceIds(String productServiceIds) {
    this.productServiceIds = productServiceIds;
  }


  public String getProductDetailPics() {
    return productDetailPics;
  }

  public void setProductDetailPics(String productDetailPics) {
    this.productDetailPics = productDetailPics;
  }


  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public String getProductIcon() {
    return productIcon;
  }

  public void setProductIcon(String productIcon) {
    this.productIcon = productIcon;
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
