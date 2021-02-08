package com.square.mall.item.center.service.controller;

import com.square.mall.common.dto.PageRspDto;
import com.square.mall.common.dto.RspDto;
import com.square.mall.common.util.DatabaseUtil;
import com.square.mall.common.util.ModuleConstant;
import com.square.mall.item.center.api.dto.CategoryDto;
import com.square.mall.item.center.service.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分类Controller
 *
 * @author Gencent
 * @date 2020/10/26
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;


    /**
     * 插入分类
     *
     * @param categoryDto 分类
     * @return 数据库ID
     */
    @PostMapping("")
    public RspDto<Long> insertCategory(@RequestBody CategoryDto categoryDto) {
        int success = categoryService.insertCategory(categoryDto);
        return DatabaseUtil.getResult(success, categoryDto.getId(), ModuleConstant.INVENTORY_CENTER);
    }

    /**
     * 更新分类
     *
     * @param categoryDto 分类
     * @return 响应
     */
    @PutMapping("")
    public RspDto updateCategory(@RequestBody CategoryDto categoryDto) {
        int success = categoryService.updateCategory(categoryDto);
        return DatabaseUtil.getResult(success, ModuleConstant.ITEM_CENTER);
    }

    /**
     * 批量删除分类
     *
     * @param ids ID数组
     * @return 响应
     */
    @DeleteMapping("/batch/ids")
    public RspDto batchDeleteCategory(@RequestParam("ids") Long[] ids) {
        int success = categoryService.batchDeleteCategory(ids);
        return DatabaseUtil.getResult(success, ModuleConstant.ITEM_CENTER);
    }

    /**
     * 根据上级ID查询分类列表
     *
     * @param parentId 上级ID
     * @return 分类列表
     */
    @GetMapping("/list/parent-id")
    public RspDto<List<CategoryDto>> selectCategoryByParentId(@RequestParam("parentId") Long parentId) {

        return new RspDto<>(categoryService.selectCategoryByParentId(parentId));
    }

    /**
     * 根据ID查询分类
     *
     * @param id ID
     * @return 分类
     */
    @GetMapping("/id")
    public RspDto<CategoryDto> selectCategoryById(@RequestParam("id") Long id) {
        return new RspDto<>(categoryService.selectCategoryById(id));
    }

    /**
     * 分页条件查询分类列表
     *
     * @param categoryDto 查询条件
     * @param pageNum 当前页
     * @param pageSize 分页大小
     * @return 分类列表
     */
    @PostMapping("list/page/condition")
    public PageRspDto<List<CategoryDto>> selectPageCategoryByCondition(@RequestBody CategoryDto categoryDto,
                               @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return categoryService.selectPageCategoryByCondition(categoryDto, pageNum, pageSize);
    }


}