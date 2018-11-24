package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 白
 * @create 2018/11/24
 **/
@Service(interfaceClass = BrandService.class)//注意：该service注解是阿里巴巴的，不是spring的
public class BrandServiceImpl implements BrandService {
    //注入品牌Mapper
    @Autowired
    private BrandMapper brandMapper;
    /**
     * 查询全部品牌列表
     */
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }
}
