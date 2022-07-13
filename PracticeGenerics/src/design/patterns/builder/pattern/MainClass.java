package design.patterns.builder.pattern;

public class MainClass {
	public static void main(String[] args) {
		Cake cake = new Cake.Builder()
				.eggs(4)
				.sugar(1)
				.butter(0.5)
				.vanila(2)
				.flour(1.4)
				.bakingpowder(0.67)
				.milk(0.5).build();
		
		System.out.println(cake);
	}
}
