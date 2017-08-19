class Point (var xp : Int, var yp : Int) {
	def move (dx : Int, dy : Int) : Unit = {
		this.xp += dx;
		this.yp += dy;

		println("Location X : " + this.xp);
		println("Location Y : " + this.yp);
	}
}


class Location (var xl : Int, var yl : Int, var zl : Int) extends Point (xl, yl) {
	def move (dx : Int, dy : Int, dz : Int) : Unit = {
		xl += dx;
		yl += dy;
		zl += dz;
		
		println("Point x location : " + xl);
		println("Point y location : " + yl);
		println("Point z location : " + zl);
	}
}


object TryExtendsClass {
	def main (args : Array[String]) : Unit = {
		/* val p : Point = new Point(10, 20);
		p.move(10, 10); */
		
		var loc : Location = new Location(10, 20, 15);
		loc.move(10, 10, 5);
	}
}