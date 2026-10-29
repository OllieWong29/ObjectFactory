public class Donuts {

    //classes = blueprints for the things we want to make

    //instance variables
    //todo: make these three comments into variables
    public String frostingType;
    public boolean hasFilling;
    public int numberOfDonuts;
    //constructors
    //same name as class
    //no void
    //create
    public Donuts (int pNumberOfDonuts){
        frostingType = "Boston Cream";
        hasFilling = true;
        numberOfDonuts = pNumberOfDonuts;


    }//end of Donut constructor

    public void printInfo(){
        //todo: use souts to print the instance variables
        System.out.println("they ordered" + numberOfDonuts + " donuts");
        System.out.println("it is " + hasFilling + "that the donuts have filling");
        System.out.println("the donut type is " + frostingType);

        //souts with context = readable
        //souts with only variable = not-readable


    }//end of printInfo
}//end of file
