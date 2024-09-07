import java.util.Scanner;

public class Politics3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a state (Gujrat, Himachal, Odisha, Kanrnatak, West bengal, Punjab, Maharashtra, Goa, Jammu and Kashmir , Madhya Pradesh, Andhra Pradesh, Delhi , Uttar Pradesh , Bihar, Assam , Uttarakhand, Arunachal, Rajasthan , Haryana, Kerala, Telangana, TamilNadu , Jharkhand, Chhattisgarh): ");
            String input = scanner.next();

            switch (input) {
                case "Gujrat":
                    System.out.println("\n 1. Amit Shah \n 2. S Jaishankar \n 3. Mansukh Mandaviya \n 4. CR Patil \n 5. Neemu Wayne Bambhania");
                    break;
                case "Himachal":
                    System.out.println("1. JP Nadda");
                    break;
                case "Odisha":
                    System.out.println("\n 1. Ashwini Vaishnav \n 2. Dharmendra Pradhan \n 3. Jewel Autumn");
                    break;
                case "Kanrnatak":
                    System.out.println("\n 1. Nirmala Sitharaman \n 2. HDK \n 3. Prahlad Joshi \n 4. Shobha Katandalaje \n 5. V Somanna");
                    break;
                case "West bengal":
                    System.out.println("\n 1. Shantanu Thakur \n 2. Turning Majumdar");
                    break;
                case "Punjab":
                    System.out.println("1. Ravneet Singh Bittu");
                    break;
                case "Maharashtra":
                    System.out.println("\n 1. Piyush Goyal \n 2. Nitin Gadkari \n 3. Pratap Rao Jadhav \n 4. Raksha Khadse \n 5. Tom Das Athawale \n 6. Muralidhar Mohol");
                    break;
                case "Goa":
                    System.out.println("1. Shripad Naik");
                    break;
                case "Jammu and Kashmir":
                    System.out.println("1. Jitendra Singh");
                    break;
                case "Madhya Pradesh":
                    System.out.println("\n 1. Shivraj Singh Chauhan \n 2. Jyotiraditya Scindia \n 3. Savitri Thakur \n 4. Virendra Kumar");
                    break;
                case "Andhra Pradesh":
                    System.out.println("\n 1. Dr. Chandrashekhar Pemmasani \n 2. Ram Mohan Naidu Kinjarapu \n 3. Srinivas Verma");
                    break;
                case "Delhi":
                    System.out.println("1. Harsh Malhotra");
                    break;
                case "Uttar Pradesh":
                    System.out.println("\n 1. Hardeep Singh Puri \n 2. Rajnath Singh \n 3. Jayant Chaudhary \n 4. Jitin Prasad \n 5. Pankaj Chaudhary \n 6. B L Verma \n 7. Anupriya Patel \n 8. Kamlesh Paswan \n 9. SP Singh Baghel");
                    break;
                case "Bihar":
                    System.out.println("\n 1. Chirag Paswan \n 2. Giriraj Singh \n 3. Jitan Ram Manjhi \n 4. Ramnath Thakur \n 5. Lalan Singh \n 6. Nirayanand Rai \n 7. Taraj Bhushan \n 8. Satish Dubey");
                    break;
                case "Assam":
                    System.out.println("\n 1. Sarbananda Sonowal \n 2. Holy Margehita");
                    break;
                case "Uttarakhand":
                    System.out.println("1. Ajay Tamtal");
                    break;
                case "Arunachal":
                    System.out.println("1. Kiren Rijiju");
                    break;
                case "Rajasthan":
                    System.out.println("\n 1. Gajendra Singh Shekhawat \n 2. Arjun Ram Meghwal \n 3. Bhupendra Yadav \n 4. Bhagirach Chaudhary");
                    break;
                case "Haryana":
                    System.out.println("\n 1. ML Khattar \n 2. Rao Inderjit Singh \n 3. Krishna Pal Gurjar");
                    break;
                case "Kerala":
                    System.out.println("\n 1. Suresh Gopi \n 2. George Kurian");
                    break;
                case "Telangana":
                    System.out.println("\n 1. G Kishan Reddy \n 2. Bandi Sanjay");
                    break;
                case "TamilNadu":
                    System.out.println("1. L Murugan");
                    break;
                case "Jharkhand":
                    System.out.println("\n 1. Sanjay Seth \n 2. Annapurna Devi");
                    break;
                case "Chhattisgarh":
                    System.out.println("1. Tokhan Sahu");
                    break;
                default:
                    System.out.println("Invalid state entered.");
                    break;
            }
        }
    }
}