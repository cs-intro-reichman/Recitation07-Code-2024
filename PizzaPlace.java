public class PizzaPlace {
	private int cashier = 100; 
	
    public void sellPizza() {
        System.out.println("Thanks for buying a pizza");
        updateBalance(50);
	} 

	private void updateBalance(int amount) {
	    cashier += amount; 
	} 
}
