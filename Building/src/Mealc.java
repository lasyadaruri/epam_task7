public class Mealc{
	public Meal NonMeal(){
      Meal m = new Meal();
      m.addItem(new Nonburger());
      m.addItem(new Coke());
      return m;
   }   
}

