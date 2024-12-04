class Patient {
    private
        int id;             // patient's ID
        String name;        // patient's full name
        int birthYear;      // patient's year of birth (CE)
        double height;      // patient's height in centimeters
        double weight;      // patient's weight in kilograms
        //updated ******************
        String bloodGroup;
        long phoneNumber;
    public
         Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, int phoneNumber) {
            if (id > 0) this.id = id;
            this.name = name;
            if (birthYear > 0) this.birthYear = birthYear;
                else this.birthYear = birthYear*(-1);
            if (height > 0) this.height = height;
                else this.height = height*(-1);
            if (weight > 0) this.weight = weight;
                else this.weight = weight*(-1);
            //updated ******************
            this.bloodGroup = bloodGroup;
            if(phoneNumber >= 0 && phoneNumber <= 1000000000) this.phoneNumber = phoneNumber;
                else if(phoneNumber <= 0) this.phoneNumber = phoneNumber*(-1);
                else this.phoneNumber = 0;
    }
        //updated ******************
        void DisplayNewInfo(){
            if(phoneNumber != 0) System.out.println("Patient phoneNumber: 0" + phoneNumber);
                else System.out.println("Patient phoneNumber: Invalid number");
            System.out.println("Patient bloodGroup: " + bloodGroup);
        }
        double getBMI(){
            if(height > 0 && weight > 0) return weight/height;
                else return 0.0;
        }


        int getAge(int currentYear) {
            int out = 0;
            if (currentYear > 0 && currentYear >= birthYear) {
                out = currentYear - this.birthYear;
            }
            else out = currentYear - this.birthYear*(-1);
            return out;
        }
        void displayDetails(int currentYear) {
                System.out.println("Patient Name: " + name);
                System.out.println("Patient Age: " + getAge(currentYear));
                System.out.println("Patient Height (cm): " + height);
                System.out.println("Patient Weight (kg): " + weight);
            //updated ******************
                System.out.println("Patient BMI: " + getBMI());
        }
}
/*
public void displayDetails(int currentYear) {
  System.out.println("Patient Name: " + name);
  System.out.println("Patient Age: " + getAge(currentYear));
  System.out.println("Patient Height (cm): " + height);
  System.out.println("Patient Weight (kg): " + weight);
}
 */