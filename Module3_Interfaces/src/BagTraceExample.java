import java.util.Arrays;

public class BagTraceExample {

	public static void main(String[] args) {
		BagInterface<String> nameBag = new ArrayBag();

		System.out.println(nameBag.isEmpty());
		nameBag.add("adam");
		nameBag.add("brian");
		nameBag.add("carl");
		nameBag.add("adam");
		nameBag.add("fred");
		nameBag.add("carl");
		nameBag.add("harry");
		nameBag.add("hank");
		System.out.println(nameBag.remove());
		System.out.println(nameBag.remove("adam"));
		System.out.println(nameBag.getCurrentSize());
		System.out.println(nameBag.remove("adam"));
		//System.out.println(nameBag.getCurrentSize());

		System.out.println(nameBag.remove("adam"));
		//System.out.println(nameBag.getCurrentSize());
		System.out.println(nameBag.remove("ivan"));
		/*System.out.println(nameBag.getCurrentSize());
		System.out.println(nameBag.getFrequencyOf("carl"));
		System.out.println(nameBag.contains("ivan"));
		System.out.println(nameBag.getFrequencyOf("ivan"));
		nameBag.clear();
		System.out.println(nameBag.getCurrentSize());*/


				
	}
}
