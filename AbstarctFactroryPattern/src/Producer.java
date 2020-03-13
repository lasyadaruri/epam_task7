public class Producer {
   public static Abstractfactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShape();         
      }else{
         return new ShapeFactory();
      }
   }
}

