package com.houzw.ddd.plugin.mybatisplus.config;

import com.baomidou.mybatisplus.generator.keywords.BaseKeyWordsHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Db2KeyWordsHandler extends BaseKeyWordsHandler {

    private static List<String> KEY_WORDS = new ArrayList<>(Arrays.asList(
            "DETERMINISTIC",
            "DISALLOW",
            "DISCONNECT",
            "DISTINCT",
            "DO",
            "DOUBLE",
            "DROP",
            "DSNHATTR",
            "DSSIZE",
            "DYNAMIC",
            "EACH",
            "EDITPROC",
            "ELSE",
            "ELSEIF",
            "ENCODING",
            "END",
            "END-EXEC",
            "END-EXEC1",
            "ERASE",
            "ESCAPE",
            "EXCEPT",
            "EXCEPTION",
            "EXCLUDING",
            "EXECUTE",
            "EXISTS",
            "EXIT",
            "EXTERNAL",
            "FENCED",
            "FETCH",
            "FIELDPROC",
            "FILE",
            "FINAL",
            "FOR",
            "FOREIGN",
            "FREE",
            "FROM",
            "FULL",
            "FUNCTION",
            "GENERAL",
            "GENERATED",
            "GET",
            "GLOBAL",
            "GO",
            "GOTO",
            "GRANT",
            "GRAPHIC",
            "GROUP",
            "HANDLER",
            "HAVING",
            "HOLD",
            "HOUR",
            "HOURS",
            "IDENTITY",
            "IF",
            "IMMEDIATE",
            "IN",
            "INCLUDING",
            "INCREMENT",
            "INDEX",
            "INDICATOR",
            "INHERIT",
            "INNER",
            "INOUT",
            "INSENSITIVE",
            "INSERT",
            "INTEGRITY",
            "INTO",
            "IS",
            "ISOBID",
            "ISOLATION",
            "ITERATE",
            "JAR",
            "JAVA",
            "JOIN",
            "KEY",
            "LABEL",
            "LANGUAGE",
            "LC_CTYPE",
            "ADD",
            "AFTER",
            "ALIAS",
            "ALL",
            "ALLOCATE",
            "ALLOW",
            "ALTER",
            "AND",
            "ANY",
            "APPLICATION",
            "AS",
            "ASSOCIATE",
            "ASUTIME",
            "AUDIT",
            "AUTHORIZATION",
            "AUX",
            "AUXILIARY",
            "BEFORE",
            "BEGIN",
            "BETWEEN",
            "BINARY",
            "BUFFERPOOL",
            "BY",
            "CACHE",
            "CALL",
            "CALLED",
            "CAPTURE",
            "CARDINALITY",
            "CASCADED",
            "CASE",
            "CAST",
            "CCSID",
            "CHAR",
            "CHARACTER",
            "CHECK",
            "CLOSE",
            "CLUSTER",
            "COLLECTION",
            "COLLID",
            "COLUMN",
            "COMMENT",
            "COMMIT",
            "CONCAT",
            "CONDITION",
            "CONNECT",
            "CONNECTION",
            "CONSTRAINT",
            "CONTAINS",
            "CONTINUE",
            "COUNT",
            "COUNT_BIG",
            "CREATE",
            "CROSS",
            "CURRENT",
            "CURRENT_DATE",
            "CURRENT_LC_CTYPE",
            "CURRENT_PATH",
            "CURRENT_SERVER",
            "CURRENT_TIME",
            "CURRENT_TIMESTAMP",
            "CURRENT_TIMEZONE",
            "CURRENT_USER",
            "CURSOR",
            "CYCLE",
            "DATA",
            "DATABASE",
            "DAY",
            "DAYS",
            "DB2GENERAL",
            "DB2GENRL",
            "DB2SQL",
            "DBINFO",
            "DECLARE",
            "DEFAULT",
            "DEFAULTS",
            "DEFINITION",
            "DELETE",
            "DESCRIPTOR",
            "LEAVE",
            "LEFT",
            "LIKE",
            "LINKTYPE",
            "LOCAL",
            "LOCALE",
            "LOCATOR",
            "LOCATORS",
            "LOCK",
            "LOCKMAX",
            "LOCKSIZE",
            "LONG",
            "LOOP",
            "MAXVALUE",
            "MICROSECOND",
            "MICROSECONDS",
            "MINUTE",
            "MINUTES",
            "MINVALUE",
            "MODE",
            "MODIFIES",
            "MONTH",
            "MONTHS",
            "NEW",
            "NEW_TABLE",
            "NO",
            "NOCACHE",
            "NOCYCLE",
            "NODENAME",
            "NODENUMBER",
            "NOMAXVALUE",
            "NOMINVALUE",
            "NOORDER",
            "NOT",
            "NULL",
            "NULLS",
            "NUMPARTS",
            "OBID",
            "OF",
            "OLD",
            "OLD_TABLE",
            "ON",
            "OPEN",
            "OPTIMIZATION",
            "OPTIMIZE",
            "OPTION",
            "OR",
            "ORDER",
            "OUT",
            "OUTER",
            "OVERRIDING",
            "PACKAGE",
            "PARAMETER",
            "PART",
            "PARTITION",
            "PATH",
            "PIECESIZE",
            "PLAN",
            "POSITION",
            "PRECISION",
            "PREPARE",
            "PRIMARY",
            "PRIQTY",
            "PRIVILEGES",
            "PROCEDURE",
            "PROGRAM",
            "PSID",
            "QUERYNO",
            "READ",
            "READS",
            "RECOVERY",
            "REFERENCES",
            "REFERENCING",
            "RELEASE",
            "RENAME",
            "REPEAT",
            "RESET",
            "RESIGNAL",
            "RESTART",
            "RESTRICT",
            "RESULT",
            "RESULT_SET_LOCATOR",
            "RETURN",
            "RETURNS",
            "REVOKE",
            "RIGHT",
            "ROLLBACK",
            "ROUTINE",
            "ROW",
            "ROWS",
            "RRN",
            "RUN",
            "SAVEPOINT",
            "SCHEMA",
            "SCRATCHPAD",
            "SECOND",
            "SECONDS",
            "SECQTY",
            "SECURITY",
            "SELECT",
            "SENSITIVE",
            "SET",
            "SIGNAL",
            "SIMPLE",
            "SOME",
            "SOURCE",
            "SPECIFIC",
            "SQL",
            "SQLID",
            "STANDARD",
            "START",
            "STATIC",
            "STAY",
            "STOGROUP",
            "STORES",
            "STYLE",
            "SUBPAGES",
            "SUBSTRING",
            "SYNONYM",
            "SYSFUN",
            "SYSIBM",
            "SYSPROC",
            "SYSTEM",
            "TABLE",
            "TABLESPACE",
            "THEN",
            "TO",
            "TRANSACTION",
            "TRIGGER",
            "TRIM",
            "TYPE",
            "UNDO",
            "UNION",
            "UNIQUE",
            "UNTIL",
            "UPDATE",
            "USAGE",
            "USER",
            "USING",
            "VALIDPROC",
            "VALUES",
            "VARIABLE",
            "VARIANT",
            "VCAT",
            "VIEW",
            "VOLUMES",
            "WHEN",
            "WHERE",
            "WHILE",
            "WITH",
            "WLM",
            "WRITE",
            "YEAR",
            "YEARS"
    ));

    public Db2KeyWordsHandler() {
        super(KEY_WORDS);
    }

    public Db2KeyWordsHandler(List<String> keyWords) {
        super(keyWords);
    }

    @Override
    public String formatStyle() {
        return "`%s`";
    }
}