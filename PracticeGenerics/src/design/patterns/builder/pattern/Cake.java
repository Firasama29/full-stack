package design.patterns.builder.pattern;


public class Cake {
	private final int eggs;
	private final double sugar;
	private final double butter;
	private final double vanila;
    private final double flour;
    private final double bakingpowder;
    private final double milk;
    
    public static class Builder {
    	private int eggs;
    	private double sugar;
    	private double butter;
    	private double vanila;
        private double flour;
        private double bakingpowder;
        private double milk;

		//builder methods for setting property
        public Builder sugar(double cup) {
        	this.sugar = cup;
        	return this;
        }
        
        public Builder eggs(int number) {
        	this.eggs = number;
        	return this;
        }
        
        public Builder butter(double cup) {
        	this.butter = cup;
        	return this;
        }
        
        public Builder vanila(double cup) {
        	this.vanila = cup;
        	return this;
        }
        
        public Builder flour(double cup) {
        	this.flour = cup;
        	return this;
        }
        
        public Builder bakingpowder(double spoon ) {
        	this.bakingpowder = spoon;
        	return this;
        }
        
        public Builder milk(double cup) {
        	this.milk = cup;
        	return this;
        }
        
      //return fully build object
        public Cake build() {
        	return new Cake(this);
        }
    	
    }
    
  //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
    	this.eggs = builder.eggs;
    	this.sugar = builder.sugar;
    	this.butter = builder.butter;
    	this.vanila = builder.vanila;
    	this.flour = builder.flour;
    	this.bakingpowder = builder.bakingpowder;
    	this.milk = builder.milk;
    }

    
    @Override
	public String toString() {
		return "eggs=" + eggs + "\n sugar=" + sugar + "\n butter=" + butter + "\n vanila=" + vanila
				+ "\n flour=" + flour + "\n bakingpowder=" + bakingpowder + "\n milk=" + milk;
	}

}
