import scala.util.matching.Regex;


object TryRegexp {
	def main (args : Array[String]) : Unit = {
		println("Create regexp from \"\".r method : ");
		var pattern : Regex = "Scala".r;
		var str : String = "Scala is Scalable and cool.";
		println(pattern.findFirstIn(str));
		
		
		println("Create regexp from new Regex : ");
		var pattern2 : Regex = new Regex("(S|s)cala");
		var str2 : String = "Scala is scalable and cool.";
		println(pattern2.findAllIn(str2).mkString(","));
	}
}