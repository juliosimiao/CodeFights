import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.sql.*; 
import java.util.*;

// Main class should be named 'Solution'
class Solution {
    
    public static void main(String[] args) {
        
        ArrayList<String> mapUsers = new ArrayList<>();
        ArrayList<String> mapProducts = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ri_db","test","");
            mapUsers = getUsers(con);
            mapProducts = getProducts(con);   
            con.close();
        }catch(Exception e){ 
            System.out.println(e);
        }
        printResult(mapUsers,mapProducts); 
    }
    
    public static ArrayList<String> getUsers(Connection con){
        ArrayList<String> mapUsers = new ArrayList<>();
        
        try{
            Statement stmt=con.createStatement();  
            ResultSet users = stmt.executeQuery("select * from users");  
            while(users.next())  {
                mapUsers.add(users.getString(1) + "-" + users.getString(2));   
            }
        }catch(SQLException e){
            System.out.println("Not possible to create statement");
        }
        
        return mapUsers;
    }
    
    public static ArrayList<String> getProducts(Connection con){
        ArrayList<String> mapProducts = new ArrayList<>();
        
        try{
            Statement stmt=con.createStatement();  
            ResultSet products = stmt.executeQuery("select * from products");  
            while(products.next())  {
                mapProducts.add(products.getString(1) + "-" + products.getString(2));   
            }
        }catch(SQLException e){
            System.out.println("Not possible to create statement");
        }
        
        return mapProducts;
    } 
    
    public static void printResult(ArrayList<String> mapUsers, 
        ArrayList<String> mapProducts){
        
        for (int j=0;j<mapUsers.size();j++) {
            String name = (mapUsers.get(j).split("-"))[0];
            String userProductLicenses = (mapUsers.get(j).split("-"))[1];
            System.out.println("User " + name + ":");
            for (int i=0;i<mapProducts.size();i++) {
                String productName = (mapProducts.get(i).split("-"))[0];
                String productlicenses = (mapProducts.get(i).split("-"))[1];
                System.out.println("  " + productName + ": " + 
                    hasValidLicense(userProductLicenses,productlicenses));           
            }
        }
    } 
    
    public static boolean hasValidLicense(String userProductLicenses, 
        String productlicenses){
        
        String[] licenses = productlicenses.split(",");
        
        for(int i=0;i<licenses.length;i++){
            if(userProductLicenses.contains(licenses[i])){
                return true;
            }
        }
        
        return false;
    }
}
