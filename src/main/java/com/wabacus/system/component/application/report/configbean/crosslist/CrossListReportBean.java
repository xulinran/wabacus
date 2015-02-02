/* 
 * Copyright (C) 2010---2014 星星(wuweixing)<349446658@qq.com>
 * 
 * This file is part of Wabacus 
 * 
 * Wabacus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.wabacus.system.component.application.report.configbean.crosslist;

import com.wabacus.config.component.application.report.AbsConfigBean;
import com.wabacus.config.component.application.report.extendconfig.AbsExtendConfigBean;

public class CrossListReportBean extends AbsExtendConfigBean
{
    private boolean hasDynamicColGroupBean;

    private boolean shouldCreateRowSelectCol;//当前交叉报表是否需要在运行时新增行选中列（因为这种报表是动态查询要显示的列的，因此如果是checkbox/radiobox行选中类型，且没有配置行选中列，则不能在加载时生成，而是在运行时生成）

    public CrossListReportBean(AbsConfigBean owner)
    {
        super(owner);
    }

    public boolean isHasDynamicColGroupBean()
    {
        return hasDynamicColGroupBean;
    }

    public void setHasDynamicColGroupBean(boolean hasDynamicColGroupBean)
    {
        this.hasDynamicColGroupBean=hasDynamicColGroupBean;
    }

    public boolean isShouldCreateRowSelectCol()
    {
        return shouldCreateRowSelectCol;
    }

    public void setShouldCreateRowSelectCol(boolean shouldCreateRowSelectCol)
    {
        this.shouldCreateRowSelectCol=shouldCreateRowSelectCol;
    }
}