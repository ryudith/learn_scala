import scala.io.StdIn.readLine;



object TryLoop {
	def main (args : Array[String]) : Unit = {
		var totalLoop : String = readLine("Type total number loop [Integer] : ");
		var totalLoop2 : String = readLine("Type total number loop2 [Integer] : ");
		var (reply : String, totalNum : Int, totalNum2 : Int, i : Int, ii : Int) = ("", 0, 0, 0, 0);
		
		try {
			totalNum = totalLoop.toInt - 1;
			totalNum2 = totalLoop2.toInt - 1;
			
		} catch {
			case e : Exception => {
				reply = e.toString();
			}
			
		}
		
		println("\nWhile loop : ");
		while (i < totalNum) {
			println("\t- This is while loop [" + i + "].");
			i += 1;
		}
		
		i = 0;
		println("\nDo while loop : ");
		do {
			println("\t- This is do while loop [" + i + "].");
			i += 1;
		} while (i < totalNum);
		
		i = 0;
		println("\nNormal for loop : ");
		for (x <- i to totalNum) {
			println("\t- This is for loop [" + x + "]");
		}
		
		i = 0;
		ii = 0;
		println("\n2 Loop for variable : ");
		for (x <- i to totalNum; y <- i to totalNum2) {
			println("\t- This is for loop 2 variable [" + x + "][" + y + "].");
		}
		
		
		var numList : Seq[Int] = for (n <- 1 to 10) yield n;
		println("Yield result " + totalNum + " : " + numList);
		var nTotal : Int = 0;
		for (i <- numList) {
			nTotal += i;
		}
		println("Total addition result " + totalNum + "! : " + nTotal);
	}
}