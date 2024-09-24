class GradeCalculator {
    public static void main(String[] arg) {
        int s1 = Integer.parseInt(arg[0]);
        int s2 = Integer.parseInt(arg[1]);
        double avg = (s1 + s2) / 2.0;
        if (avg > 80) {
            System.out.println("Grade A");
        } else {
            System.out.println("Grade B");
        }
    }
}

