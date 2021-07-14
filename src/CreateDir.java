import java.io.File;
public class CreateDir {
   public CreateDir(String memName) {
      try {
         String fName = "designing/" + memName;
         File file = new File(fName);
         // file.createNewFile();
         boolean flag = file.mkdir();
         System.out.print("Directory created? " + flag);
      } catch(Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      System.out.println("CreateDir");
      new CreateDir("A");

   }
}