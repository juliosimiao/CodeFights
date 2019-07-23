String htmlTable(String table, int row, int column) {
    
    String[] content = table.split("<tr>");
    String rowToSearch = "";
    String value = "";
    
    if(row + 1 < content.length){
        rowToSearch = content[row+1];
        String[] columnsContent = rowToSearch.split("<td>");
        if(column + 1 < columnsContent.length){
            String[] columnToSearch = columnsContent[column+1].split("</td>");
            value = columnToSearch[0];
        }else{
            value = "No such cell"; 
        }
    }else {
        value = "No such cell";
    }
    
    
    return value;    
}
