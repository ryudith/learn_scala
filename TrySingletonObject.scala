class Point (var xp : Int, var yp : Int) {
	def move (dx : Int, dy : Int) : Unit = {
		xp += dx;
		yp += dy;
	}
}


object TrySingletonObject {
	def main (args : Array[String]) : Unit = {
		def printPoint (p : Point = new Point(10, 10)) : Unit = {
			println("Point x location : " + p.xp);
			println("Point y location : " + p.yp);
		}
		
		var p : Point = new Point(10, 20);
		printPoint(p);
		printPoint();
	}
}