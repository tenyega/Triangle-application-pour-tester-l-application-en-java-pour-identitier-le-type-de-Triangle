package appli;

public class RandomG {
    float max;
    public RandomG(float max){
        this.max = max;
    }
    public float getSideOne(){
        return (float) (Math.random() * this.max);
    };
    public float getSideTwo(){
        return (float) (Math.random() * this.max);
    };
    public float getSideThree(){
        return (float) (Math.random() * this.max);
    }

    public String getType(){
        if (this.getSideOne() == this.getSideTwo() && this.getSideOne() == this.getSideThree()) {
            return "Equilateral";
        }
        if (this.getSideOne() == this.getSideTwo() || this.getSideOne() == this.getSideThree() || this.getSideTwo() == this.getSideThree()) {
            return "Isosceles";
        }
        return "Scalene";
    }

}
