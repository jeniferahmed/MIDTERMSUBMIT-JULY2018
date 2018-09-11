package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
//declaring a map,use value & use loop,put method,call the map - how to retrieve data from map. try for each method.
		//gfg.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
	List<String> EuropeanCountries =new ArrayList<String>();
	EuropeanCountries.add("Spain");
	EuropeanCountries.add("Italy");
	EuropeanCountries.add("Greece");

	List<String> AsianCountries =new ArrayList<String>();
	AsianCountries.add("Bangladesh");
	AsianCountries.add("China");
	AsianCountries.add("Malaysia");

	Map<String,List<String>> listofCountries=new HashMap<String,List<String>>();
    listofCountries.put("Countries in Europe",EuropeanCountries);
    listofCountries.put("Countries in Asia", AsianCountries);

		Iterator it = listofCountries.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	for(Map.Entry<String,List<String>> cityInfo:listofCountries.entrySet()){
	System.out.println("COUNTRIES IN MAP : " +cityInfo.getKey()+"--->"+cityInfo.getValue());
	}
	}







}
