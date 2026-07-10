package lesson17;

public class Box<T> {
	private T content;
	public Box(T content) {
        		this.content=content;
	} 
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content=content;
	}

	public static <T> void printArray (T[] array) {
		for (T element : array) { System.out.println(element + " ");}
		//System.out.println();
	}	
}