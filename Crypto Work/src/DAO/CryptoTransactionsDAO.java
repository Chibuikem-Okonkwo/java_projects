package DAO;

import Beans.CryptoTransactionsBean;
import CONN.JConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CryptoTransactionsDAO {
    
    JConnect jc = new JConnect();
    
    public int addCryptoTransaction(){
        int status = 1;
        
        PreparedStatement ps = null;
        Connection connect = null;
        
        String query = "INSERT into crypto_transactions values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return 0;
    }
}
