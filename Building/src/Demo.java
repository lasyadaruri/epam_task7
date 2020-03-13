public class Demo {
   public static void main(String[] args) {
   
      Mealc m = new Mealc();

      Meal nonMeal = m.NonMeal();
      System.out.println("NonVeg Meal");
      nonMeal.showItems();
      System.out.println("Total Cost: " + nonMeal.getCost());

}
}

