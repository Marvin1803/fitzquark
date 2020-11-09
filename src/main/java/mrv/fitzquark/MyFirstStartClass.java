package mrv.fitzquark;

class MyFirstStartClass {

    public static void main(String[] args) {
        String fitz = "Fitz";
        String quark = "Quark";
        String fitzQuark = "FitzQuark";

        for (int i = 1; i < 101; i++) {
            if(i%7 == 0 && i%5 == 0)
            {
                System.out.println(fitzQuark);
            }
            else if (i % 5 == 0)
            {
                System.out.println(fitz);
            }
            else if (i % 7 == 0)
            {
                System.out.println(quark);
            }
            else System.out.println(i);
        }
    }

}