package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger= LogManager.getLogger();

    public static void main(String []args){
        logger.info("Program started");

        Calculator calculator= new Calculator();
        System.out.println(calculator.add(2,4));
        System.out.println(calculator.subtract(10,3));
        System.out.println(calculator.divide(12,5));
        logger.error("Error could appear");
        System.out.println(calculator.multiply(2,4));
        System.out.println("Hannah Posch");
    }
}
