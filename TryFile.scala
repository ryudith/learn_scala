import java.io.File;
import java.io.PrintWriter;
import scala.io.StdIn.readLine;
import scala.io.Source;



object TryFile {
	def main (args : Array[String]) : Unit = {
		var writer : PrintWriter = new PrintWriter(new File("file_from_tryfile.txt"));
		writer.write("Hello\nScala");
		writer.close();
		
		var input : String = readLine("Please enter a string : ");
		println("You input : " + input);
		
		println("Read file file_from_tryfile.txt : ");
		Source.fromFile("file_from_tryfile.txt").foreach(print);
	}
}