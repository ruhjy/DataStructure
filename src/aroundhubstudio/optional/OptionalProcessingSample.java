package aroundhubstudio.optional;

import java.util.*;

public class OptionalProcessingSample {
	
	
	public OptionalProcessingSample() {
		
		// filter
		Optional<SampleObject> sampleObject1 = Optional.of(getObject())
				.filter(object -> object.getName().equals("java"));
		System.out.println(sampleObject1.get());
		
		Optional<SampleObject> sampleObject2 = Optional.of(getObject())
				.filter(object -> object.getAge().equals("31"));
		System.out.println(sampleObject2.isPresent());
		
		// map
		Optional<String> StringObject1 = Optional.of(getObject())
				.map(sampleObject -> sampleObject.getName());
		System.out.println(StringObject1.get());
		
		// ifPresent
		Optional.of(getObject())
				.ifPresent(object -> System.out.println(object));
		
		// ifPresentOrElse
		Optional.ofNullable(getNullObject())
				.ifPresentOrElse(object -> {
					System.out.println(object);
				}, () -> {
					System.out.println("null object");
				});
		
		// isPresent
		if (Optional.ofNullable(getObject()).isPresent()) {
			System.out.println("is present");
		}
		
		// isEmpty
		if (Optional.ofNullable(getNullObject()).isEmpty()) {
			System.out.println("is empty");
		}
		
		// get
		Optional<SampleObject> sampleObject3 = Optional.of(getObject());
		System.out.println(sampleObject3.get());
		
		// orElse
		SampleObject sampleObject4 = Optional.ofNullable(getNullObject())
				.orElse(new SampleObject("spring", "11", "apple"));
		System.out.println(sampleObject4);
		
		// orElseGet
		SampleObject sampleObject5 = Optional.ofNullable(getNullObject())
				.orElseGet(() -> new SampleObject("servlet", "20", "meta"));
		System.out.println(sampleObject5);
		
	}
	
	private SampleObject getNullObject() {
		return null;
	}
	
	private SampleObject getObject() {
		return new SampleObject("java", "33", "woowa");
	}
	
	public static void main(String[] args) {
		new OptionalProcessingSample();
		
	}
}
