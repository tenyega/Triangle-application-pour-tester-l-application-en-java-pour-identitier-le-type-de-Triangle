package appli;

public class Triangle  {

    // Triangle scalène: 3 different length of the triangle
    //  isocèle : with same length and at the bottom it has a same angle.
    //équilatéral  with same length and also the angle  with 60 deg each.
    private float side1, side2, side3, max;
    RandomG randomG ;
    public Triangle(float max) {
        RandomG randomG= new RandomG(max);
        this.side1 =  randomG.getSideOne();
        this.side2 =  randomG.getSideTwo();
        this.side3 = randomG.getSideThree();
    }

    public Triangle(float max, RandomG randomG) {
        this.randomG = randomG;  // Injected RandomG
        this.side1 = randomG.getSideOne();
        this.side2 = randomG.getSideTwo();
        this.side3 = randomG.getSideThree();
    }

    public String checkTriangle(){
        if (this.side1 == this.side2 && this.side1 == this.side3) {
            return "Equilateral";
        }
        if (this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
            return "Isosceles";
        }
        return "Scalene";
    }


public  float getSide1(){
    return this.side1;
}
public  float getSide2(){
        return this.side2;
    }
public  float getSide3(){
        return this.side3;
}




}



