import scala.io.StdIn.readLine;
import scala.util.control.Breaks;



object TryCollections {
	def main (args : Array[String]) : Unit = {
		println("List collection : ");
		var list1 : List[String] = List("apple", "orange", "pear");
		var list2 : List[List[Int]] = List(
			List(1, 0, 0), 
			List(0, 1, 0), 
			List(0, 0, 1));
		var list3 : List[List[Int]] = List((1 :: 0 :: 0 :: Nil), (0 :: 1 :: 0 :: Nil), (0 :: 0 :: 1 :: Nil));
		var list4 : List[Int] = Nil;
		
		println("Length of fruit : " + list1.length);
		println("Size of fruit : " + list1.size);
		println("Head of fruit : " + list1.head);
		println("Tail of fruit : " + list1.tail);
		println("Check if fruit is empty : " + list1.isEmpty);
		println("Check if num is empty : " + list4.isEmpty);
		
		var list5 : List[String] = ("apple" :: "pear" :: "orange" :: Nil);
		println("Before reverse fruit : " + list5);
		println("After reverse fruit : " + list5.reverse);
		
		println("concate list : " + list1.:::(list5.reverse));
		list2 = List.concat(list2, list3);
		println("Concat list with concat function : " + list2);
		
		println("Array with List.fill() method : " + List.fill(10)(2));
		
		var input : String = readLine("Input your value : ");
		var x : Int = 0;
		var reply : String = "";
		try {
			x = Integer.parseInt(input);
			
		} catch {
			case e : Exception => {
				reply = e.toString();
			};
		}
		var list7 : List[Int] = List.tabulate(x)(n => n * 2);
		println("Array with List.tabulate method : " + list7);
		println("\n\n\n");
		
		
		
		println("Set collection : ");
		var set1 : Set[String] = Set("apple", "orange", "pear");
		var set2 : Set[Int] = Set();
		println("Head of fruit : " + set1.head);
		println("Tail of fruit : " + set1.tail);
		println("Check if fruit is empty : " + set1.isEmpty);
		println("Check if num is empty : " + set2.isEmpty);
		
		var set3 : Set[String] = Set("apple", "orange", "pear");
		var set4 : Set[String] = Set("mango", "banana");
		var set5 : Set[String] = set3 ++ set4;
		println("Set3 value : " + set3);
		println("Set4 value : " + set4);
		println("Concat set (set3 ++ set4) : " + set5);
		
		var set6 : Set[Int] = Set(5,7,9,15,30,28);
		println("Min element in Set(5,7,9,15,30,28) : " + set6.min);
		println("Max element in Set(5,7,9,15,30,28) : " + set6.max);
		
		var set7 : Set[Int] = Set(5,7,2,9,19);
		var set8 : Set[Int] = Set(7,9,2,10,15);
		println("set7 value : " + set7);
		println("set8 value : " + set8);
		println("Set intersection (.& method) : " + set7.&(set8));
		println("Set intersection (intersect method) : " + set8.intersect(set7));
		println("\n\n\n")
		
		
		
		println("Map collection : ");
		var map1 : Map[String, String] = Map(
			"red" -> "#FF0000", 
			"azure" -> "#F0FFFF", 
			"peru" -> "#CD853F");
		var map2 : Map[Int, Int] = Map();
		println("Keys in color : " + map1.keys);
		println("Values in color : " + map1.values);
		println("Check if color is empty : " + map1.isEmpty);
		println("Check if num is empty : " + map2.isEmpty);
		
		println("Add more map item : \n");
		var map3 : Map[String, String] = Map();
		var mapName : String = "";
		var mapValue : String = "";
		var loop : Breaks = new Breaks();
			loop.breakable {
				while (true) {
				mapName = readLine("Type map name : ");
				mapValue = readLine("Type map value : ");
				
				if (mapName == "finish") loop.break;
				
				map3 += (mapName -> mapValue);
			}
		}
		println("\nMap value : " + map3);
		var map4 : Map[String, String] = map1 ++ map3;
		println("Concat map (map4 = map1 ++ map3) : " + (map1 ++ map3));
		
		println("Keys map4 : ");
		map4.keys.foreach{i => print("key : " + i + " => "); println("value : " + map4(i));};
		
		println("Check key in map : ");
		if (map1.contains("red")) {
			println("\tRed key exist with value : " + map1("red"));
		} else {
			println("\tRed key does not exist");
		}
		
		if (map1.contains("maroon")) {
			println("\tMaroon key exist with value : " + map1("maroon"));
		} else {
			println("\tMaroon key does not exist");
		}
		println("\n\n\n");
		
		
		
		println("Tuple collection : ");
		var tuple1 : Tuple5[Int, String, String, Double, Char] = new Tuple5(10, "test", "name", 3.1416, 'A');
		println("Tuple5 value : " + tuple1);
		println("Iterator : ");
		tuple1.productIterator.foreach{i => println("value : " + i);};
		println("toString : " + tuple1.toString());
		var tuple2 : Tuple2[String, String] = new Tuple2("Hello,", "World!");
		println("Swap tuple : " + tuple2.swap);
		println("\n\n\n");
		
		
		
		println("Option collection : ");
		var opt1 : Map[String, String] = Map("France" -> "Paris", "Japan" -> "Tokyo");
		println("show(opt1.get(\"Japan\")) : " + show(opt1.get("Japan")));
		println("show(opt1.get(\"India\")) : " + show(opt1.get("India")));
		
		var opt2 : Option[Int] = Some(8);
		var opt3 : Option[Int] = None;
		println("opt2.getOrElse(0) : " + opt2.getOrElse(0));
		println("opt3.getOrElse(10) : " + opt3.getOrElse(10));
		println("opt2.isEmpty : " + opt2.isEmpty);
		println("opt3.isEmpty : " + opt3.isEmpty);
		println("\n\n\n");
		
		
		
		println("Iterator collection : ");
		var it1 : Iterator[String] = Iterator("howdy", "_name_", "how", "are", "you", "?");
		while (it1.hasNext) {
			println(it1.next());
		}
		
		var it2 : Iterator[Int] = Iterator(10, 9, 3, 8, 6, 7);
		var it3 : Iterator[Int] = it2;
		var it4 : Iterator[Int] = Iterator(10, 9, 3, 8, 6, 7);
		var it5 : Iterator[Int] = Iterator(10, 9, 3, 8, 6, 7);
		println("value it2.size : " + it2.size);
		println("value it2.size : " + it2.length);
		println("Maximum value element : " + it4.max);
		println("value it2 : " + it4);
		println("Minimum value element : " + it5.min);
		println("value it5 : " + it5);
		
	}
	
	def show (x : Option[String]) : String = {
		return x match {
			case Some(s) => {s}
			case None => "?"
		}
	}
}