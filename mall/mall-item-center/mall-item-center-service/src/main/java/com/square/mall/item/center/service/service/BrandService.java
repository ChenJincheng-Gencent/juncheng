package com.square.mall.item.center.service.service;

import com.square.mall.item.center.api.dto.BrandDto;

import java.util.List;

/**
 * 品牌Service
 * @author Gencent
 * @date 2020/7/24
 */
public interface BrandService {

    /**
     * 插入品牌数据
     * @param brandDto 品牌
     * @return 是否成功，1成功，0失败
     */
    int insertBrand(BrandDto brandDto);

    /**
     * 更新品牌数据
     * @param brandDto 品牌
     * @return 否成功，1成功，0失败
     */
    int updateBrand(BrandDto brandDto);

    /**
     * 删除品牌数据
     * @param id 数据库ID
     * @return 是否成功，1成功，0失败
     */
    int deleteBrand(Long id);

    /**
     * 条件查询品牌数据列表
     * @param brandDto 查询条件
     * @return 品牌数据列表
     */
    List<BrandDto> selectBrandByCondition(BrandDto brandDto);
}
