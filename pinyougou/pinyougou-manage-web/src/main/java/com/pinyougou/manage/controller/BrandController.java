package com.pinyougou.manage.controller;

/**
 * @author 白
 * @create 2018/11/24
 **/

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌controller
 */
@RequestMapping("/brand")
@RestController
public class BrandController {
    /**
     * 该Reference注解来自阿里巴巴，不是其他的，请注意不要引入错误注解
     * 还有注意的是，这里使用@Reference不是@Autowired
     */
    @Reference
    private BrandService brandService;
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }
}
