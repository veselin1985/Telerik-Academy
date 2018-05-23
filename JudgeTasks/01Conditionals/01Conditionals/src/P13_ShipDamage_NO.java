import java.util.Scanner;

public class P13_ShipDamage_NO {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int sSX1 = Integer.parseInt(console.nextLine());
        int sSY1 = Integer.parseInt(console.nextLine());
        int sSX2 = Integer.parseInt(console.nextLine());
        int sSY2 = Integer.parseInt(console.nextLine());
        int H = Integer.parseInt(console.nextLine());
        int cX1 = Integer.parseInt(console.nextLine());
        int cY1 = Integer.parseInt(console.nextLine());
        int cX2 = Integer.parseInt(console.nextLine());
        int cY2 = Integer.parseInt(console.nextLine());
        int cX3 = Integer.parseInt(console.nextLine());
        int cY3 = Integer.parseInt(console.nextLine());

        int sX1 = Math.min(sSX1,sSX2);
        int sX2 = Math.max(sSX1,sSX2);
        int sY1 = Math.max(sSY1,sSY2);
        int sY2 = Math.min(sSY1,sSY2);


        int sum = 0;

        boolean c1IsInside = cX1 > sX1 && cX1 < sX2 && Math.abs(cY1 - H) + H < sY1 && Math.abs(cY1 - H) + H > sY2;
        boolean c2IsInside = cX2 > sX1 && cX2 < sX2 && Math.abs(cY2 - H) + H < sY1 && Math.abs(cY2 - H) + H > sY2;
        boolean c3IsInside = cX3 > sX1 && cX3 < sX2 && Math.abs(cY3 - H) + H < sY1 && Math.abs(cY3 - H) + H > sY2;

        boolean c1IsOnCorner = (cX1 == sX1 || cX1 == sX2) && (Math.abs(cY1 - H) + H == sY1 || Math.abs(cY1 - H) + H == sY2);
        boolean c2IsOnCorner = (cX2 == sX1 || cX2 == sX2) && (Math.abs(cY2 - H) + H == sY1 || Math.abs(cY2 - H) + H == sY2);
        boolean c3IsOnCorner = (cX3 == sX1 || cX3 == sX2) && (Math.abs(cY3 - H) + H == sY1 || Math.abs(cY3 - H) + H == sY2);



        boolean c1IsOnLeftOrRight = ((cX1 == sX1 || cX1 == sX2) && (Math.abs(cY1 - H) + H < sY1 && Math.abs(cY1 - H) + H > sY2))
                || ((Math.abs(cY1 - H) + H == sY1 || Math.abs(cY1 - H) + H == sY2) && (cX1 > sX1 && cX1 < sX2));

        boolean c2IsOnLeftOrRight = ((cX2 == sX1 || cX2 == sX2) && (Math.abs(cY2 - H) + H < sY1 && Math.abs(cY2 - H) + H > sY2))
                || (((Math.abs(cY2 - H) + H == sY1 || Math.abs(cY2 - H) + H == sY2)) && (cX2 > sX1 && cX2 <sX2));

        boolean c3IsOnLeftOrRight = ((cX3 == sX1 || cX3 == sX2) && (Math.abs(cY3 - H) + H < sY1 && Math.abs(cY3 - H) + H > sY2))
                || ((Math.abs(cY3 - H) + H == sY1 || Math.abs(cY3 - H) + H == sY2)) && (cX3 > sX1 && cX3 < sX2);

        if (c1IsInside) {
            sum += 100;
        }
        if (c2IsInside) {
            sum += 100;
        }
        if (c3IsInside) {
            sum += 100;
        }
        if (c1IsOnCorner) {
            sum += 25;
        }
        if (c2IsOnCorner) {
            sum += 25;
        }
        if (c3IsOnCorner) {
            sum += 25;

        }
        if (c1IsOnLeftOrRight) {
            sum += 50;
        }
        if (c2IsOnLeftOrRight) {
            sum += 50;

        }
        if (c3IsOnLeftOrRight) {
            sum += 50;

        }
        System.out.printf("%d%%", sum);
    }
}