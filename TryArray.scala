object TryArray {
	def main (args : Array[String]) : Unit = {
		
		println("Multi dimension array : ");
		var myMatrix = Array.ofDim[Int](3, 3);
		
		for (i <- 0 to 2) {
			for (ii <- 0 to 2) {
				myMatrix(i)(ii) = ii;
			}
		}
		
		for (i <- 0 to 2; ii <- 0 to 2) {
			print(myMatrix(i)(ii) + " ");
			
			if (ii == 2) println();
		}
		
		
		println("\nConcat array : ");
		var (arr1 : Array[Double], arr2 : Array[Double]) = 
			(Array(1.9, 2.9, 3.9, 4.9), Array(5.9, 6.9, 7.9, 8.9));
		var arr3 : Array[Double] = Array.concat(arr1, arr2);
		for (i <- arr3) {
			println(i);
		}
		
		
		println("\nCreate array with range method : ");
		var arr4 : Array[Int] = Array.range(10, 20, 2);
		var arr5 : Array[Int] = Array.range(10, 20);
		
		println("\tRange with step value : ");
		for (i <- arr4) {
			println(i);
		}
		
		println("\tRange without step value : ");
		for (i <- arr5) {
			println(i);
		}
	}
}