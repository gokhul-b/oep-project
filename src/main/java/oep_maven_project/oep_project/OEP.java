package oep_maven_project.oep_project;

public class OEP {
	public String play(int number) {
        if (number % 2 == 0) {
            return "EVEN";
        } else {
            if (isPrime(number)) {
                return "PRIME";
            } else {
                return "ODD";
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
