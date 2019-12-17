package com.javaliao.backstage.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVo extends BaseRowModel {

    @ExcelProperty(value = "productSn",index = 0)
    private String productSn;
    @ExcelProperty(value = "商品名称",index = 1)
    private String productName;
    @ExcelProperty(value = "商品价格",index = 2)
    private String productPice;
    @ExcelProperty(value = "商品现价",index = 3)
    private String productNowPrice;
    @ExcelProperty(value = "商品品牌",index = 4)
    private String productBrand;
    @ExcelProperty(value = "商品库存",index = 5)
    private String productStock;
    @ExcelProperty(value = "商品标题",index = 6)
    private String productTitle;
    @ExcelProperty(value = "商品卖家",index = 7)
    private String productSeller;
    @ExcelProperty(value = "商品发货地",index = 8)
    private String productPlaceOfDelivery;
    @ExcelProperty(value = "商品重量",index = 9)
    private String productWeight;
    @ExcelProperty(value = "商品描述",index = 10)
    private String productDescription;



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

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
