package methodreference.sample01;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * 建立一個 List
		 * 練習用 method reference 的方式操作這個 List
		 * 各種 Functional Interface 都要練到
		 * */
		ArrayList<String> instance = new ArrayList<>();
		
		Function<String, Boolean> add = instance::add;
		BiConsumer<Integer, String> addAtIndex = instance::add;
		Function<Collection<String>, Boolean> addAll = instance::addAll;
		Runnable clear = instance::clear;
		Function<String, Boolean> contains = instance::contains;
		Consumer<Integer> ensureCapacity = instance::ensureCapacity;
		Consumer<Consumer<String>> forEach = instance::forEach;
		Function<Integer, String> get = instance::get;
		Supplier<Integer> size = instance::size;
		Consumer<Comparator<String>> sort = instance::sort;
		
		add.apply("Peter");
		add.apply("Kevin");
		add.apply("Jason");
		addAtIndex.accept(2, "Roger");
		addAll.apply(Arrays.asList("Marry", "Emmie", "Nancy"));
		
		out.println("forEach -->");
		forEach.accept(printer());
		
		out.println("get [3] --> " + get.apply(3));
		
		out.println("is contains 'Kevin'? --> " + contains.apply("Kevin"));
		
		out.println("size --> " + size.get());
		
		out.println("after sort -->");
		sort.accept((s1, s2) -> s1.compareTo(s2));
		forEach.accept(printer());
		
		clear.run();
		out.println("after clear --> ");
		forEach.accept(printer());
		out.println("size --> " + size.get());
		
	}
	
	public static Consumer<String> printer(){
		return (s) -> out.println(s);
	}

}
