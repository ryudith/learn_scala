import scala.io.StdIn.readLine;



object TryBranching {
	def main (args : Array[String]) : Unit = {
		var userInput : String = readLine("Type number day [1 - 7] : ");
		var numDay : Int = 0;
		var reply : String = "";
		
		try {
			numDay = userInput.toInt;
		} catch {
			case e : Exception => {
				reply = e.toString();
			}
		}
		
		if (numDay == 1) {
			reply = "Sunday";
			
		} else if (numDay == 2) {
			reply = "Monday";
			
		} else if (numDay == 3) {
			reply = "Tuesday";
			
		} else if (numDay == 4) {
			reply = "Wednesday";
			
		} else if (numDay == 5) {
			reply = "Thursday";
			
		} else if (numDay == 6) {
			reply = "Friday";
			
		} else if (numDay == 7) {
			reply = "Saturday";
			
		} else {
			if (reply == "") {
				reply = "Unknown day";
			}
		}
		
		println("Day : " + reply);
	}
}