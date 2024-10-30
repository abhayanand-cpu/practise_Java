package oneMonthPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class sparseArray {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>(); //aba baba aba xzxb
		List<String> queries = new ArrayList<String>(); //aba xzxb ab
		List<Integer> integer = new ArrayList<Integer>();
		List<String> stringsCopy = new ArrayList<String>(); 
		
		
		strings.add("aba"); strings.add("baba"); strings.add("aba"); strings.add("xzxb");
		queries.add("aba"); queries.add("xzxb"); queries.add("ab"); queries.add("aba");
		
		stringsCopy.addAll(strings);
		
		int iter = 0;
		int contains = 0;
		
		while( iter < queries.size() ) {
			
			if( strings.contains(queries.get(iter)) ) {
				contains++;
				strings.remove(queries.get(iter));
			}
			
			else {
					integer.add(iter,contains);
					iter++;
					contains = 0;
					strings.clear();
					strings.addAll(stringsCopy);
			}
			
			
		}
		System.out.println(integer);
	}

}
