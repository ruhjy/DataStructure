package john;

import java.util.HashMap;

// Coding with John의 Map 및 HashMap 동영상
class Maps {
	public static void main(String[] args) {

		HashMap<String, Integer> empIds = new HashMap<>();

		empIds.put("john", 12345);
		empIds.put("Carl", 54321);
		empIds.put("Jerry", 8675309);
		empIds.put("heo", 9201);
		empIds.put("Rock", 987654);

		System.out.println(empIds); // empIds의 모든 entry호출?

		System.out.println(empIds.get("Carl")); // Carl의 value 값을 반환
		System.out.println(empIds.get("heo")); // heo의 value 값을 반환

		System.out.println(empIds.containsKey("Jerry")); // empIds의 Jerry라는 키를 포함하는 있는지? true
		System.out.println(empIds.containsKey("johnson")); // empIds의 johnson이라는 키를 포함하고 있는지? false
		System.out.println("------------");
		System.out.println(empIds.containsValue(6)); // empIds의 6이라는 value를 포함하고 있는지? false
		System.out.println(empIds.containsValue(9201)); // empIds의 9201이라는 value를 포함하고 있는지? true
		System.out.println("------------");

		System.out.println(empIds);
		// put과 replace의 기능은 당연한 것이겠지만 메서드의 동작 방식이 다름.
		empIds.put("heo", 3004); // heo라는 키가 존재하면 value 3004를 덮어쓰기함.
		empIds.replace("john", 258); // john이라는 키의 value값을 258로 교체? 라고 이해하면 되려나요.
		// 만약 키 값이 없는데 replace를 한다면
		empIds.replace("dj", 123123); // 아무일도 일어나지 않는다.
		// 만약 키 값이 있는지 확인하고 없다면 ( 키 값이라고 하기에는 애매하네요. )
		// 번역으로는 해당 키가 map 어딘가에 존재하지 않는 경우
		empIds.putIfAbsent("Cook", 1111); // 없다면 추가(put)
		empIds.putIfAbsent("heo", 1111); // 있다면 아무일도 일어나지 않는다.
		System.out.println(empIds); // {heo=3004, Rock=987654, Carl=54321, Cook=1111, john=258, Jerry=8675309}
		System.out.println("------------");
		// 제거 remove
		System.out.println(empIds.remove("Jerry")); // remove("Jerry")의 반환값은 value, 8675903를 출력 
		empIds.remove("Jerry");
		System.out.println(empIds); // {heo=3004, Rock=987654, Carl=54321, Cook=1111, john=258}
		
		
		

//		Set<Map.Entry<String, Integer>> set = empIds.entrySet();
//		
//		for(Map.Entry<String, Integer> e : set) {
//			System.out.println(e.getKey() + " : " + e.getValue());
//		}
//		
//		ArrayList<Integer> list = empIds.values(); // 원래는 value값을 리스트로 받고 출력해보고 싶었는데.. 형변환으로 인해서 안된다.
//		Collection<Integer> list = empIds.values(); // 다형성으로 되는거 같은데.. 헷갈린다.
//		Iterator<Integer> it = list.iterator();
//		
//		while (it.hasNext()) {
//			int v = it.next();
//			System.out.println(v);
//		}

	}
}
