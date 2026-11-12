public interface Array {
    public static void main(String[] args) {

        // Ito ay nagde-declare at gumagawa ng double array na may eksaktong 5 na elements.
        double[] temperatures = new double[5];

        // Naglalagay ng temperature sa bawat index ng array.
        temperatures[0] = 32.5; // Temperature sa unang araw.
        temperatures[1] = 34.0; // Temperature sa ikalawang araw.
        temperatures[2] = 31.8; // Temperature sa ikatlong araw.
        temperatures[3] = 33.2; // Temperature sa ikaapat na araw.
        temperatures[4] = 35.1; // Temperature sa ikalimang araw.

        // Gumagamit ng for loop para isa-isang eprint ang temperature sa bawat araw.
        // Ang "temperature.length ay tumotukoy sa bilang ng elements ng array.
        for (int i = 0; i < temperatures.length; i++){

            // Nagpi-print ang temperature kasama ang araw nito.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);

        }

        // Ina-update nito ang temperature sa ikatlong araw (index 2) mula 31.8 papuntang 32.0.
        temperatures[2] = 32.0;

        // Nagpi-print ng heading para sa updated temperature.
        System.out.println("Updated Temperature:");

        // piniprint ang bagong temperature sa ikatlong araw
        System.out.println("Day 3: " + temperatures[2]);
    }
}
