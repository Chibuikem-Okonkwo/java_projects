<!-- 
    Document   : bank_list
    Created on : Aug 5, 2021, 3:32:33 PM
    Author     : Tony-->


<%@page import="beans.BankBean"%>
<%@page import="java.util.List"%>
<%@page import="DAO.BankDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank List</title>
    </head>
    <body>
        <h3>Bank List!</h3>
        <table>
            <thead>
                <tr>
                    <th>S/N</th>
                    <th>Bank Code</th>
                    <th>Bank</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                
                <% 
                    int BankCode = 0;
                    String Bank ="";
                    
                    int counter = 1;
                    BankDAO DAO = new BankDAO();
                    
                    List<BankBean> bean = DAO.getBanks();
                    for (BankBean bb : bean) {
                            
                        BankCode = bb.getBankCode();
                        Bank = bb.getBank();
                %>
                <tr>
                    <td><%=counter%></td>
                    <td><%=BankCode%></td>
                    <td><%=Bank%></td>
                </tr>
                
                <%
                    counter++;
                    }
                %>
            </tbody>
        </tbody>
        </table>
    </body>
</html>
