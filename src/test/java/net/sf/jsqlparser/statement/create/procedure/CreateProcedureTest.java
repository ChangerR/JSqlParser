package net.sf.jsqlparser.statement.create.procedure;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by changer on 16/10/16.
 * email: dingjc@mchz.com.cn
 */
public class CreateProcedureTest {

    @Test
    public void testProcedure() throws Exception{
        Statement statement = CCJSqlParserUtil.parse("create procedure hello (OUT cout INT)\n" +
                "begin\n" +
                "\tselect count(1) into cout from db.veriycode;\n" +
                "end ");

        if ( statement instanceof CreateProcedure) {
            CreateProcedure createProcedure = (CreateProcedure) statement;
            System.out.println("Create Procedure:" + createProcedure.getSpName().getName());
        }
    }

}