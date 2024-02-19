public class Huntingtons {
    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < dna.length(); i++) {
            if ((i + 3) <= dna.length() && dna.substring(i, i + 3).equals("CAG")) {
                currentCount++;
                i += 2;
            }
            else {
                currentCount = 0;
            }
            maxCount = Math.max(currentCount, maxCount);
        }
        return maxCount;
    }


    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        String newStr = s.replace(" ", "");
        newStr = newStr.replace("\t", "");
        newStr = newStr.replace("\n", "");
        return newStr;
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats < 10) {
            return "not human";
        }
        else if (maxRepeats <= 35) {
            return "normal";
        }
        else if (maxRepeats <= 39) {
            return "high risk";
        }
        else if (maxRepeats <= 180) {
            return "Huntington's";
        }
        else {
            return "not human";
        }
    }

    // Sample client (see below).
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(
                    "Please provide the name of the input file as a command-line argument.");
            return;
        }
        String fileName = args[0];
        In in = new In(fileName);
        String dna = in.readAll();
        dna = removeWhitespace(dna);
        int repeats = maxRepeats(dna);
        String diagnosis = diagnose(repeats);
        System.out.println("max repeats = " + repeats);
        System.out.println(diagnosis);

    }
}
