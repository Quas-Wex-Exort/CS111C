import java.util.*;

public class Trio<T> {
	private T item1, item2, item3;

	public Trio(T newItem1, T newItem2, T newItem3){
		this.item1 = newItem1;
		this.item2 = newItem2;
		this.item3 = newItem3;
	}

	public Trio(T newItem){
		this(newItem,newItem,newItem);
	}

	public void setItem1(T newItem){
		this.item1 = newItem;
	}

	public void setItem2(T newItem){
		this.item2 = newItem;
	}

	public void setItem3(T newItem){
		this.item3 = newItem;
	}

	public T getItem1 (){
		return item1;
	}

	public T getItem2 (){
		return item2;
	}

	public T getItem3 (){
		return item3;
	}


	@Override
	public String toString() {
		return item1.toString() + "\t" + item2.toString() + "\t" + item3.toString();
	}

	/* public int contains(Object item){
		int count = 0;
		if (item.equals(item1)){
			count++;
		}
		if (item.equals(item2)){
			count++;
		}
		if (item.equals(item3)){
			count++;
		}
		return count;
	} */

	public int contains(Object item) {
		int count = 0;
		ArrayList<T> itemArray = new ArrayList<>();
		itemArray.add(0, this.item1);
		itemArray.add(1, this.item2);
		itemArray.add(2, this.item3);
		for (T itemIterator : itemArray) {
			if (itemIterator.equals(item)) {
				count++;
			}
		}
		return count;
	}

	public boolean hasDuplicates(){
		return this.contains(this.item1) > 1 || this.contains(this.item2) > 1;
	}

	@Override
	public boolean equals(Object other){
		if (other instanceof Trio<?>) {
			Trio<?> otherTrio = (Trio<?>) other;

			return this.contains(item1) == otherTrio.contains(item1)
					&& this.contains(item2) == otherTrio.contains(item2)
					&& this.contains(item3) == otherTrio.contains(item3);
		}
		else {
			return false;
		}
	}
}

