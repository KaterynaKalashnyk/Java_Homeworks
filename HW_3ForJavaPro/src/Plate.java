public class Plate {
        private int food;
        private int maxFood;

        public Plate(int food, int maxFood) {
            this.food = food;
            this.maxFood = maxFood;
        }


        public int getFood() {
            return food;
        }

        public void setFood(int food) {
            this.food = food;
        }

        @Override
        public String toString() {
            return "Plate{" +
                    "food=" + food +
                    '}';
        }

            public boolean minusfood(int foodInPlate){
            if (food < foodInPlate){
                return false;
            }
            food -= foodInPlate;
            return true;
            }

            public void addFood(int food){
            if (this.food + food <= maxFood){
                this.food += food;
            }
            }
    }