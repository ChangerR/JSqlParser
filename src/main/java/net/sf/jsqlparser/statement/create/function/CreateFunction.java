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
package net.sf.jsqlparser.statement.create.function;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;
import net.sf.jsqlparser.statement.create.procedure.Parameter;
import net.sf.jsqlparser.statement.create.table.ColDataType;

import java.util.List;

/**
 * Created by changer on 16/10/16.
 * email: dingjc@mchz.com.cn
 */
public class CreateFunction implements Statement{
    private List<Parameter> parameterList = null;
    private Table spName;
    private List<Statement> statements = null;
    private ColDataType returnType;

    @Override
    public void accept(StatementVisitor statementVisitor) {

    }

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
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

    public ColDataType getReturnType() {
        return returnType;
    }

    public void setReturnType(ColDataType returnType) {
        this.returnType = returnType;
    }
}
