package com.pinyougou.mapper;

/**
 * @author 白
 * @create 2018/11/24
 **/

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 查询全部品牌列表
 */
public interface BrandMapper {
    public List<TbBrand> queryAll();
}
