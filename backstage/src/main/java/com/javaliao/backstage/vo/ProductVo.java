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

}
