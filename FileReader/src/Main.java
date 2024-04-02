import java.io.*;

public class Main {
 public static void main(String[] args) throws Exception {
        String filePath="C:\\Users\\28413\\Desktop\\PROG-2-2024\\fsfsds\\FileReader\\Groceries.txt";
        String fileToWriter="C:\\Users\\28413\\Desktop\\PROG-2-2024\\fsfsds\\FileReader\\GroceriesFormatted.txt"; 
        String[] array=new String[4];
        String id;
        String itemName;
        String quantity;
        String separator=",";
        double total=0;
        double price;

        FileReader fileReader=new FileReader(filePath);
        FileWriter fileWriter=new FileWriter(fileToWriter);

        BufferedReader reader=new BufferedReader(fileReader);
        BufferedWriter writer=new BufferedWriter(fileWriter);

        String heading;
        heading="ID#"+"\t"+"Item"+"\t\t\t"+"Quantity"+"\t\t"+"Price(€)"+".";
        System.out.println(heading);

        writer.write("*******************************************************");
        writer.newLine();
        writer.write(heading);
        writer.newLine();
        String line;

        while((line=reader.readLine())!=null){
            array=line.split(separator);
            id=array[0];
            itemName=array[1];
            quantity=array[2];
            price=Double.parseDouble(array[3]);
             total+=price;
             if(itemName.length()<5&&quantity.length()<4){
            line=id+"\t"+itemName+"\t\t\t"+quantity+"\t\t\t"+price+".";
            }else if(itemName.length()>=5&&quantity.length()<4){
            line=id+"\t"+itemName+"\t\t\t"+quantity+"\t\t\t"+price+".";
            }else{
             line=id+"\t"+itemName+"\t\t\t"+quantity+"\t\t\t"+price+".";
 }
         System.out.println(line);
         writer.write(line);
         writer.newLine();
 }         

     System.out.println("\n"+"Total price of groceries:"+Math.round(total));
        writer.write("*******************************************************");
        writer.write("\n"+"The grocery shopping total is:€"+Math.round(total));

        reader.close();
        writer.flush();
        writer.close();

    }
}

