//package org.example;
//
//import java.sql.*;
//
//public class Main {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/sample_db?serverTimezone=UTC";
//        String user = "app_user";
//        String password = "password123";
//        String tableName = "users";
//
//        try (Connection conn = DriverManager.getConnection(url, user, password);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName)) {
//
//            while (rs.next()) {
//                // カラムごとに取り出す
//                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
//            }
//
//
////            ResultSetMetaData rsmd = rs.getMetaData();
////            int columnCount = rsmd.getColumnCount();
////
////            // カラム名一覧を取得して出力
////            for (int i = 1; i <= columnCount; i++) {
////                System.out.print(rsmd.getColumnName(i) + "\t");
////            }
////            System.out.println("\n---------------------------");
//
//            // 各行の各カラムを取得して出力
////            while (rs.next()) {
////                for (int i = 1; i <= columnCount; i++) {
////                    System.out.print(rs.getObject(i) + "\t");
////                }
////                System.out.println();
////            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
