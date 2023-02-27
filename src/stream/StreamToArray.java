package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {
	public static void main(String[] args) {
		String[] str = { "java", "html", "go", "css", "spring" };
		String[] str10 = { "apple", "javascript", "jsp", "Mysql", "jquery" };

		Stream<String> strArrStream1 = Arrays.stream(str);
		Stream<String> strArrStream2 = Arrays.stream(str);
		Stream<String> strArrStream3 = Arrays.stream(str);
		Stream<String> strArrStream4 = Arrays.stream(str);
		Stream<String> strArrStream5 = Arrays.stream(str);

		String[] str2 = strArrStream1.toArray(String[]::new);
		String[] str3 = strArrStream2.toArray(i -> new String[i]);
		Object[] str4 = strArrStream3.toArray();
		String[] str5 = strArrStream4.sorted().toArray(String[]::new);
//		Integer[] str6 = strArrStream5.map(s -> s.length()).sorted().toArray(Integer[]::new);
		Object[] str7 = strArrStream5.map(s -> s.length()).sorted().toArray(Integer[]::new);

		System.out.println(Arrays.toString(str2));
		System.out.println(Arrays.toString(str3));
		System.out.println(Arrays.toString(str4));
		System.out.println(Arrays.toString(str5));
//		System.out.println(Arrays.toString(str6));
		System.out.println(Arrays.toString(str7));
		System.out.println();

		Stream<String[]> strStream = Stream.of(str, str10);
		strStream.flatMap(Arrays::stream).sorted().forEach(i -> System.out.print(i + " "));
	}
}
