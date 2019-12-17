package com.javaliao.backstage.service.impl;

import cn.hutool.core.util.StrUtil;
import com.javaliao.backstage.bean.TbColumn;
import com.javaliao.backstage.mapper.ColumnMapper;
import com.javaliao.backstage.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

@Service
public class ColumnServiceImpl implements ColumnService {
    @Autowired
    private ColumnMapper columnMapper;

    @Override
    public void getColumnList(ModelMap modelMap) {
        List<TbColumn> tbColumns = columnMapper.selectAll();
        modelMap.put("tbColumns", tbColumns);
    }

    @Override
    public void ColumnSerach(TbColumn tbColumn, ModelMap modelMap) {
        tbColumn.setIsDelete(0L);
        if (StrUtil.isBlank(tbColumn.getColumnName())) {
            tbColumn.setColumnName(null);
        }
        List<TbColumn> tbColumns = columnMapper.select(tbColumn);
        modelMap.put("tbColumns", tbColumns);
    }

    @Override
    public void getColumnById(String columnId, ModelMap modelMap) {
        TbColumn column = new TbColumn();
        column.setIsDelete(0L);
        column.setId(Long.valueOf(columnId));
        TbColumn tbcolumn = columnMapper.selectOne(column);
        modelMap.put("tbcolumn", tbcolumn);

    }

    @Override
    public void insertColumn(TbColumn tbColumn) throws Exception {
        tbColumn.setIsDelete(0L);
        tbColumn.setCreateTime(new Date());
        tbColumn.setUpdateTime(tbColumn.getCreateTime());
        int flag = columnMapper.insertSelective(tbColumn);
        if (flag < 0) {
            throw new Exception("添加失败");
        }
    }

    @Override
    public void updateColumn(TbColumn tbColumn) throws Exception {
        tbColumn.setUpdateTime(new Date());
        int flag = columnMapper.updateByPrimaryKeySelective(tbColumn);
        if (flag < 0) {
            throw new Exception("更新失败");
        }
    }

    @Override
    public void removeColumn(String columnId) throws Exception {
        TbColumn tbColumn = columnMapper.selectByPrimaryKey(columnId);
        tbColumn.setIsDelete(0L);
        tbColumn.setUpdateTime(new Date());
        int flag = columnMapper.updateByPrimaryKeySelective(tbColumn);
        if (flag < 0) {
            throw new Exception("删除失败");
        }

    }
}
