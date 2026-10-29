public class Factory {
    //String variables can hold words, sentences, etc.
    //Strings always need quotes
    //Capital S
    public String owner = "Ollie";
    public boolean isOpen;
    public String yearFounded = "1738";
    public Donuts donutOrder1;
    public Donuts donutOrder2;
    public int randomNumber;

    //class = blueprint
    //object = house
    //dontOrder1 is an object of class Donuts

    public static void main(String[] args) {
        //special method: constructor
        //name has to be the same name as class
        //you do not say void
        Factory a = new Factory();

    }//end of psvm

    //start of the souts

    //special method: constructor
    public Factory(){
        System.out.println("Welcome to Ollie's Factory");
        System.out.println("the factory was founded in ");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");

        randomNumber = (int)(Math.random() * 100) +1;

        //make an object of type Donut
        donutOrder1 = new Donuts(randomNumber);
        System.out.println("they ordered " + donutOrder1.numberOfDonuts +  " donuts");
        System.out.println("it is " + donutOrder1.hasFilling + " that the donuts have filling");
        System.out.println("the donut flavor is " + donutOrder1.frostingType);

//        donutOrder1.numberOfDonuts = donutOrder1.numberOfDonuts + 1;
//todo: make the 2nd order have a range of 1-45

        randomNumber = (int)(Math.random() * 45)+1;

        donutOrder2 = new Donuts(randomNumber);
        System.out.println("they ordered  " + donutOrder2.numberOfDonuts + " donuts");
        System.out.println("it is " + donutOrder2.hasFilling + " that the donuts have filling");
        System.out.println("the donut flavor is " + donutOrder2.frostingType);
//        donutOrder2.numberOfDonuts = donutOrder1.numberOfDonuts*2;
//        System.out.println(donutOrder2.numberOfDonuts);

//        donutOrder2.printInfo();
    }//end of Factory

}//end of file
