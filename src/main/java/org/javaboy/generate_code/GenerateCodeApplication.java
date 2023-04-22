package org.javaboy.generate_code;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.google.common.base.CaseFormat;
import org.apache.poi.ss.usermodel.Workbook;
import org.javaboy.generate_code.model.ColumnClass;
import org.javaboy.generate_code.model.TableClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GenerateCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenerateCodeApplication.class, args);


    }
//
//    @Excel(name="表名")
//    private String tablename;
////    @Excel(name="字段名")
//    private String columns;
////    @Excel(name="类型")
//    private String typename;
////    @Excel(name="注释")
//    private String remarks;
//
//    public String getTablename() {
//        return tablename;
//    }
//
//    public void setTablename(String tablename) {
//        this.tablename = tablename;
//    }
//
//    public String getColumns() {
//        return columns;
//    }
//
//    public void setColumns(String columns) {
//        this.columns = columns;
//    }
//
//    public String getTypename() {
//        return typename;
//    }
//
//    public void setTypename(String typename) {
//        this.typename = typename;
//    }
//
//    public String getRemarks() {
//        return remarks;
//    }
//
//    public void setRemarks(String remarks) {
//        this.remarks = remarks;
//    }
//
//    public static void main2(String[] args) throws ClassNotFoundException, SQLException, IOException {
////        bus_safe_supervision
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://111.172.242.58:33060/bus_safe_supervision?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "mysql@2023#wawi.8888");
//            DatabaseMetaData metaData = connection.getMetaData();
//            ResultSet tables = metaData.getTables(connection.getCatalog(), null, null, null);
//            List<GenerateCodeApplication> tableClassList = new ArrayList<>();
//            while (tables.next()) {
//                TableClass tableClass = new TableClass();
//                String table_name = tables.getString("TABLE_NAME");
//                System.out.println(table_name);
////                ResultSet columns = metaData.getColumns(connection.getCatalog(), null, table_name, null);
////                while(columns.next()){
////                    String column_name = columns.getString("COLUMN_NAME");
////                    String type_name = columns.getString("TYPE_NAME");
////                    String remarks = columns.getString("REMARKS");
////                    System.out.println("----"+column_name+type_name+remarks);
//
//                    GenerateCodeApplication gca = new GenerateCodeApplication();
//                    gca.setTablename(table_name);
////                    gca.setColumns(column_name);
////                    gca.setTypename(type_name);
////                    gca.setRemarks(remarks);
//                    tableClassList.add(gca);
//
////                }
//
//            }
//        //生成excel文档
//        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户","用户信息"), GenerateCodeApplication.class, tableClassList);
//        FileOutputStream fos = new FileOutputStream("src/main/resources/easypoi-user6.xls");
//        workbook.write(fos);
//        fos.close();
//
//
//
//
//        }
//
//
//    public static void main(String[] args) {
//
//    }

}
