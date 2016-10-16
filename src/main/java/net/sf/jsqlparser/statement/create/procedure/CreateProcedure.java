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
package net.sf.jsqlparser.statement.create.procedure;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by changer on 16/10/15.
 * email: dingjc@mchz.com.cn
 */
public class CreateProcedure implements Statement {

    private List<Parameter> parameterList = null;
    private Table spName;
    private List<Statement> statements = null;

    @Override
    public void accept(StatementVisitor statementVisitor) {

    }

    public void setParameterList(List<Parameter> parameters) {
        parameterList = parameters;
    }

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public Table getSpName() {
        return spName;
    }

    public void setSpName(Table spName) {
        this.spName = spName;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
