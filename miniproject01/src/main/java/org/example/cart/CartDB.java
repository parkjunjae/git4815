package org.example.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CartDB {
    private CartCLI cartCLI = new CartCLI();

    public void insert() {
        //장바구니 만들기
        Connection con =null;
        PreparedStatement pstmt = null;
        try {


        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
                pstmt.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
