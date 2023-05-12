public class Cat extends Animal{

   public Cat(String name, String color, int age, int running, int swimming) {
      super(name, color, age, running, swimming
      );
   }
   @Override
   public String voice() {
      return "meow";
   }

   @Override
   public String run() {
      if (running <= 150){
         return "Кот может пробежать это расстояние. " + name + " пробежал: " + running + " метров.";
      }else{
         return "К сожалению " + name + " мне может пробежать так много";
      }
   }
   @Override
   public String swim() {
      return "К сожалению, коты не умеют плавать";
   }
   }





