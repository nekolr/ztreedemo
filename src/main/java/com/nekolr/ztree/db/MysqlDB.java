package com.nekolr.ztree.db;

import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 */
public class MysqlDB {

    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/emp?useUnicode=true&characterEncoding=utf8";
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String MYSQL_USERNAME = "root";
    private static final String MYSQL_PASSWORD = "root";

    public static Connection connection;

    static {

        try {
            Class.forName(MYSQL_DRIVER);
            try {
                connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> queryList(String sql, Class<T> clazz, Object[] params) {
        QueryRunner queryRunner = new QueryRunner();
        BeanProcessor bean = new GenerousBeanProcessor();
        RowProcessor processor = new BasicRowProcessor(bean);
        List<T> list = null;
        if (params != null && params.length != 0) {
            try {
                list = queryRunner.query(connection, sql, new BeanListHandler<T>(clazz, processor), params);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                list = queryRunner.query(connection, sql, new BeanListHandler<T>(clazz, processor));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
