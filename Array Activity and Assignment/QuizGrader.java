public class QuizGrader { // Gumagawa ng class na may pangalang QuizGrader.
    public static void main(String[] args) { // Main method kung saan magsisimula ang program.

        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; // Nagdedeklara ng array na naglalaman ng mga tamang sagot sa 10 questions
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; // Nagdedeklara ng array na naglalaman ng mga sagot ng estudyante.
        int correctCount = 0; // Nagdedeklara ng variable na magbibilang ng mga tamang sagot.

        // Gumagamit ng for loop para isa-isang suriin ang lahat ng sagot sa answerKey array.
        // Nagsisimula ang i sa 0 dahil 0 ang unang index ng array.
        // Inuulit ang loop hangga't mas mababa ang i sa haba ng answerKey.
        // Dinadagdagan ng 1 ang i pagkatapos ng bawat pag-uulit.
        for (int i = 0; i < answerKey.length; i++) {

            // Kinukumpara ang sagot ng estudyante sa tamang sagot.
            // Ginagawang uppercase ang parehong character para maging tama pa rin ang lowercase na sagot.
            if (studentAnswers[i] == answerKey[i]) {
                correctCount++;  // Dinadagdagan ng 1 ang correctCount kapag tama ang sagot.

            }
        }

        // Nagdedeklara ng double variable para paglagyan ng percentage ng score.
        // Kino-convert sa double ang correctCount para maiwasan ang integer division.
        // Hinahati ang tamang sagot sa kabuuang bilang ng tanong at minumultiply sa 100.
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;


        // Ipinapakita ang kabuuang bilang ng tamang sagot at ang total number of questions.
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);

        // Ipinapakita ang final percentage ng nakuha ng estudyante sa quiz.
        System.out.println("Final Percentage: " + scorePercentage + "%");
        // Sinusuri kung ang percentage ng estudyante ay 70.0 o mas mataas.
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS "); // Ipinapakita ang PASS kapag ang score ay 70% pataas.
        } else {
            System.out.println("Result: FAIL "); // Ipinapakita ang FAIL kapag ang score ay mas mababa sa 70%.
        }

        // Gumagamit ng for loop para isa-isang suriin ang lahat ng sagot sa answerKey array.
        // Nagsisimula ang a sa 0 dahil 0 ang unang index ng array.
        // Inuulit ang loop hangga't mas mababa ang a sa haba ng answerKey.
        // Dinadagdagan ng 1 ang a pagkatapos ng bawat pag-uulit.
        for (int a = 0; a < answerKey.length; a++) {

            // Kinukumpara ang sagot ng estudyante at tamang sagot.
            // Ginagawang uppercase ang mga letra para hindi mahalaga kung lowercase o uppercase ang sagot.
            if (Character.toUpperCase(studentAnswers[a]) == Character.toUpperCase(answerKey[a])) {
            } else {

                // Ipinapakita ang numero ng tanong na mali ang sagot.
                // Ang i + 1 ay ginagamit dahil nagsisimula sa 0 ang index pero sa 1 ang bilang ng tanong.
                // Ipinapakita rin kung ano ang sagot ng estudyante at kung ano ang tamang sagot.
                System.out.println("Question " + (a + 1) + ": Incorrect. You answered '" + studentAnswers[a] + "', correct answer is '" + answerKey[a] + "'");
            }
        }
    }
}