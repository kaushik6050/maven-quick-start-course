package clinic.programming.training;

    
 import java.util.Arraylist;
import java.util.list;
import org.apache.commons.lang3.StringUtils;       



public class application {

public int countWords(String words){
	String[] seperateWords = StringUtils.split(words,' ');
	return (seperateWords == null )? 0: seperateWords.length;




public void greet(){
List<String>greetings=new Arraylist<>();
greetings.add("Hello");

for(String greeting :greetings) {
System.out.println("Grreting : " +greeting);
}
}
    

    public class application() {

        System.out.println ("Inside Application");

    }



    // method main(): ALWAYS the APPLICATION entry point
   
         public static void main (String[] args) {
    
             	System.out.println ("Starting Application");
    
             		application app = new application();
    app.greet();
int count= app.countWords("I have four Words");
System.out.println("Word Count  :" +count);
             		    }
    
             		    }
