public class CoffeeShopAnalyzer { // Gumagawa ng class na may pangalang CoffeeShopAnalyzer.
    public static void main(String[] args) { // Main method kung saan magsisimula ang program.

        // Nagdedeklara at naglalagay ng 7 values sa integer array para sa sales ng bawat araw.
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

        // Nagdedeklara ng String array na naglalaman ng pangalan ng mga araw sa isang linggo.
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Ipinapakita ang heading na Daily Sales.
        System.out.println("--- Daily Sales ---");

        // Nagdedeklara ng variable na totalSales na magsisimula sa 0.
        int totalSales = 0;

        // Gumagamit ng for loop para isa-isang kunin ang sales ng bawat araw.
        // Nagsisimula ang i sa 0 at inuulit hanggang sa huling index ng array.
        for ( int i = 0; i < weeklySales.length; i++) {
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);  // Ipinapakita ang pangalan ng araw at ang bilang ng cups na naibenta.
        }

        // Gumagamit ng enhanced for loop para kunin ang bawat sales value sa array.
        for ( int dailySale : weeklySales) {
            totalSales += dailySale;  // Idinadagdag ang bawat dailySale sa totalSales para makuha ang kabuuang benta.
        }

        // Kinakalkula ang average sales sa pamamagitan ng paghahati ng totalSales sa bilang ng araw.
        // Ginagamit ang double para makakuha ng decimal na sagot.
        double avarageSales = (double) totalSales / weeklySales.length;

        System.out.println("--- Weekly Summary ---"); // Ipinapakita ang heading para sa weekly summary.

        System.out.println("Total Sales: " + totalSales + " cups");  // Ipinapakita ang kabuuang sales sa loob ng isang linggo.


        int maxSales = weeklySales[0]; // Itinatakda ang unang sales value bilang panimulang pinakamataas na sales.
        int minSales = weeklySales[0]; // Itinatakda ang unang sales value bilang panimulang pinakamababang sales.
        String bestDay = daysOfWeek[0]; // Itinatakda ang unang araw bilang panimulang araw na may pinakamataas na sales.
        String worstDay = daysOfWeek[0];   // Itinatakda ang unang araw bilang panimulang araw na may pinakamababang sales.

        // Gumagamit ng for loop para suriin ang sales ng bawat araw simula sa pangalawang element.
        for (int i = 1; i < weeklySales.length; i++) {
            if (weeklySales[i] > maxSales) { // Sinusuri kung mas mataas ang sales ng kasalukuyang araw kaysa sa maxSales.
                maxSales = weeklySales[i]; // Pinapalitan ang maxSales ng mas mataas na sales value.
                bestDay = daysOfWeek[i]; // Itinatala ang araw kung kailan nakuha ang pinakamataas na sales.
            }
            if (weeklySales[i] < minSales) { // Sinusuri kung mas mababa ang sales ng kasalukuyang araw kaysa sa minSales.
                minSales = weeklySales[i]; // Pinapalitan ang minSales ng mas mababang sales value.
                worstDay = daysOfWeek[i];  // Itinatala ang araw kung kailan nakuha ang pinakamababang sales.

            }
        }
        System.out.println("--- Best and Worsts---"); // Ipinapakita ang heading para sa best at worst sales.
        // Ipinapakita ang araw na may pinakamataas na sales at ang bilang ng cups na naibenta.
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups ");
        // Ipinapakita ang araw na may pinakamababang sales at ang bilang ng cups na naibenta.
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups ");
    }
}
