package net.sf.jsqlparser.statement.create.function;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by changer on 16/10/16.
 * email: dingjc@mchz.com.cn
 */
public class CreateFunctionTest {

    @Test
    public void test() throws Exception {
        Statement statement = CCJSqlParserUtil.parse("CREATE DEFINER=`changer`@`%` FUNCTION `hello`() RETURNS int(11)\n" +
                "    READS SQL DATA\n" +
                "begin\n" +
                "declare cout int;\n" +
                "select count(1) into cout from db.veriycode;\n" +
                "    return cout;\n" +
                "end\n");
        if ( statement instanceof CreateFunction ) {
            CreateFunction createFunction = (CreateFunction) statement;
            System.out.println("Create Function:" + createFunction.getSpName());
        }
    }
}