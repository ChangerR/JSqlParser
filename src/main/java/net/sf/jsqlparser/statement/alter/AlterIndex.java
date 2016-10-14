/*
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2016 JSQLParser
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
package net.sf.jsqlparser.statement.alter;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;

/**
 * Created by dingjc on 2016/10/14.
 * email: dingjc@mchz.com.cn
 */
public class AlterIndex implements Statement{

    private Table index;
    private String rename;

    @Override
    public void accept(StatementVisitor statementVisitor) {
    }

    public Table getIndex() {
        return index;
    }

    public void setIndex(Table index) {
        this.index = index;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }
}
