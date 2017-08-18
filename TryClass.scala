class Point (xp : Int, yp : Int) {
	var x : Int = xp;
	var y : Int = yp;

	def move (dx : Int, dy : Int) : Unit = {
		x += dx;
		y += dy;

		println("Point x location : " + x);
		println("Point y location : " + y);
	}
}


object TryClass {
	def main (args : Array[String]) : Unit = {
		val pt = new Point(10, 20);
		pt.move(10, 10);
	}
}