import javax.swing.*;


public class Level {

    private JTable table1;


    private static int[] Bomben = {20, 30};
    private static int[] hoehe = {10, 16}; // Die realen Array dimensionen
    private static int[] breite = {10, 16};
    private static int[] width = {8, 14};
    private static int[] height = {8, 14};

    //Wir wollen zunächst nur 2 Level implementieren.

    private static int[][][] level =
            {
                    {         //level 0 schaut so aus:
                            {22, 22, 22, 22, 22, 22, 22, 22, 22, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 22, 22, 22, 22, 22, 22, 22, 22, 22}},

                    {     //level 1 schaut so aus :
                            {22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 22, 22},
                            {22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22}}

            };

    //GETTER damit andere Klassen drauf zugreifen können
    public static int[] getBomben() {
        return Bomben;
    }

    public static int[] getHoehe() {
        return hoehe;
    }


    public static int[] getBreite() {
        return breite;
    }

    public static int[][][] getLevel() {
        return level;
    }
}
