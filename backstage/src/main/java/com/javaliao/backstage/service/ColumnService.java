package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbColumn;
import org.springframework.ui.ModelMap;

public interface ColumnService {
    void getColumnList(ModelMap modelMap);

    void ColumnSerach(TbColumn tbColumn, ModelMap modelMap);

    void getColumnById(String columnId, ModelMap modelMap);

    void insertColumn(TbColumn tbColumn) throws Exception;

    void updateColumn(TbColumn tbColumn) throws Exception;

    void removeColumn(String columnId) throws Exception;
}
