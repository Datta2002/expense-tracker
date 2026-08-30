import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseFileFormat {
            private final String FILE_NAME = "expense.txt";

           public void savaExpenseToFile(ExpenseData expenseData){
               System.out.println(expenseData);
               try {
                   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME,true));
                   String line = expenseData.getExpenseName()+","+
                           expenseData.getDescription()+","+
                           expenseData.getAmount()+","+
                           expenseData.getExpenseDate()+","+
                           expenseData.getCategory()+","+
                           expenseData.getModeOfPayment();
                   System.out.println(line);
                   bufferedWriter.write(line);

                   bufferedWriter.newLine();
               } catch (IOException e) {
                   System.out.println("Error writing to file"+e.getMessage());
               }
           }


           public List<ExpenseData> loadExpensesFromFile(){
               List<ExpenseData> list = new ArrayList<ExpenseData>();
               File file = new File(FILE_NAME);
               System.out.println("Reading expenses from file"+file.getAbsolutePath());
               if(!file.exists()){
                   return list;
               }
               try {
                   BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                   String line;
                   while (( line = bufferedReader.readLine()) != null){
                       String[] part = line.split(",");
                       ExpenseData expenseData = new ExpenseData(
                               part[0],part[1],Integer.parseInt(part[2]), LocalDate.parse(part[3]),part[4],part[5]
                       );
                       list.add(expenseData);
                   }
               } catch (IOException e) {
                   System.out.println("Error in reading file"+e.getMessage());
               }
            return list;
           }
}
