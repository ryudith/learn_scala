import scala.io.StdIn.readLine;



object TrySwitch {
	def main (args : Array[String]) : Unit = {
		var str : String = readLine("Type number day [1 - 7] : ");
		
		println(dayName(str));
	}
	
	def dayName (x : String) : String = {
		var num : Int = 0;
		var name : String = "No Name";
		
		try {
			num = x.toInt;
			
		} catch {
			case e : Exception => {
				println(e.toString());
			}
		}
		
		(num) match {
			case 1 => {
				name = "Sunday";
			}
			
			case 2 => {
				name = "Monday";
			}
			
			case 3 => {
				name = "Tuesday";
			}
			
			case 4 => {
				name = "Wednesday";
			}
			
			case 5 => {
				name = "Thursday";
			}
			
			case 6 => {
				name = "Friday";
			}
			
			case 7 => {
				name = "Saturday";
			}
			
			case _ => {
				name = "Invalid day number";
			}
		}
		
		return name;
	}
}