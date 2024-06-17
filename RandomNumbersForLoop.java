public class RandomNumbersForLoop {

    public static void main(String[] args) {
        // Declare variables
        int randomNumber, minValue = 1, maxValue = 20;
        
        // Display message based on ten numbers between 1 and 20
        System.out.println("Ten numbers between " + minValue + " and " + maxValue);
        
        for(int i = 1; i <= 10; i++){
            // Generate random number using the math floor
            randomNumber = (int)Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
            
            // Display ten random numbers using for loop in horizontal format
            System.out.print(randomNumber + " ");
        }
    }
    
}
