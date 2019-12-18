package com.javaliao.backstage.controller;

import cn.hutool.core.bean.BeanUtil;
import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.bean.TbProductCategory;
import com.javaliao.backstage.service.ProductService;
import com.javaliao.backstage.util.BeanClone;
import com.javaliao.backstage.util.EasyExcelUtil;
import com.javaliao.backstage.vo.ProductVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/productController")
@Api(tags = "ProductController",description = "商品管理")
public class ProductController extends BaseController {

    @Autowired
    ProductService productService;


    @ApiOperation("获取商品列表")
    @GetMapping("/getProductList")
    public String getProductList(ModelMap modelMap) {
        productService.getProductList(modelMap);
        return "product/list";
    }

    @ApiOperation("商品搜索")
    @PostMapping("/productSearch")
    public String productSearch(TbProduct tbProduct, ModelMap modelMap) {
        productService.productSearch(tbProduct, modelMap);
        return "product/list";
    }

    @ApiOperation("根据商品ID获取商品信息")
    @GetMapping("/getProductById")
    public String getProductById(String productId, ModelMap modelMap) {
        productService.getProductById(productId, modelMap);
        return "product/modify";
    }

    @ApiOperation("添加商品")
    @PostMapping("/insertProduct")
    public String insertProduct(TbProduct tbProduct) throws Exception {
        productService.insertProduct(tbProduct);
        return "redirect:getProductList";
    }

    @ApiOperation("更新商品")
    @PostMapping("/updateProduct")
    public String updateProduct(TbProduct tbProduct) throws Exception {
        productService.updateProduct(tbProduct);
        return "redirect:getProductList";
    }

    @ApiOperation("删除商品")
    @GetMapping("/removeProductById")
    public String removeProductById(String productId) throws Exception {
        productService.removeProductById(productId);
        return "redirect:getProductList";
    }

    @ApiOperation("获取商品分类列表")
    @GetMapping("/getProductCategoryList")
    public String getProductCategoryList(ModelMap modelMap) {
        productService.getProductCategoryList(modelMap);
        return "productCategory/list";
    }

    @ApiOperation("根据商品分类ID获取商品信息")
    @GetMapping("/getProductCategoryById")
    public String getProductCategoryById(String productCategoryId, ModelMap modelMap) {
        productService.getProductCategoryById(productCategoryId, modelMap);
        return "productCategory/modify";
    }

    @ApiOperation("删除商品")
    @GetMapping("/removeProductCategoryById")
    public String removeProductCategoryById(String productCategoryId) throws Exception {
        productService.removeProductCategoryById(productCategoryId);
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("更新分类商品")
    @PostMapping("/updateProductCategory")
    public String updateProductCategory(TbProductCategory tbProductCategory) throws Exception {
        productService.updateProductCategory(tbProductCategory);
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("添加商品分类")
    @PostMapping("/insertProductCategory")
    public String insertProductCategory(TbProductCategory tbProductCategory) throws Exception {
        productService.insertProductCategory(tbProductCategory);
        return "redirect:getProductCategoryTwoById?productCategoryId=" + tbProductCategory.getParentId();
    }

    @ApiOperation("根据商品分类ID获取商品信息")
    @GetMapping("/getProductCategoryTwoById")
    public String getProductCategoryTwoById(String productCategoryId, ModelMap modelMap) {
        productService.getProductCategoryTwoById(productCategoryId, modelMap);
        return "productCategory/listTwo";
    }
    @ApiOperation("导入商品数据")
    @PostMapping("/upload")
    public String uploadNew(@RequestParam("file") MultipartFile file) {
        //整改一：extends BaseController会捕获执行时抛出的异常，控制层就不需要加try-catch捕获了
        //整改二：业务代码尽量写到ServiceImpl中，控制层做跳转
        try {
            Map<String, Object> result = EasyExcelUtil.readExcel(file, new ProductVo(), 1);
            Boolean flag = (Boolean) result.get("flag");
            if (flag) {
                List<Object> list = (List<Object>) result.get("datas");
                if (!CollectionUtils.isEmpty(list)) {
                    //整改三：参考BeanClone.clone(T po, Class<K> clz)进行修改
                    List<ProductVo> productVos = list.stream().map(o -> {
                        ProductVo productVo = new ProductVo();
                        BeanUtil.copyProperties(o, productVo);
                        return productVo;
                    }).collect(Collectors.toList());

                    List<TbProduct> products = productVos.stream().map(productVo -> {
                        TbProduct tbProduct = new TbProduct();
                        BeanUtil.copyProperties(productVo, tbProduct);
                        return tbProduct;
                    }).collect(Collectors.toList());
                    //整改四：如果参数为空，没有添加，没有反馈
                    productService.insertProductList(products);
                }
            }
            return "product/list";
        } catch (Exception e) {
            e.printStackTrace();
            //整改五：直接跳转freemark无法获取${Request.ex}
            return "error/exceptionCatch.ftl";
        }
        //整改六：看看能否写一个公共方法调用，导入的数据不只是商品导入，如果每一个页面都需要导入数据，每次都写单独的方法，代码太冗余了
    }
}
