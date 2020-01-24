public class array {


    public static void main(String[] args) {
        int a[];
        int[] b;
        int c[] = new int[5];
        c[0] = 10;
        c[1] = 20;
        a = new int[3];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(d.length);

        for (int i = 1; i < d.length; i++) {
            System.out.println(d[i]);
        }

        int[] x1, y1; //both are array
        int x2, y2[]; //1-int,2-array
        int x3[], y3; //1-array,2-int
        int[] x4, y4[]; //x4-10 array,y4-20array

        y4 = new int[3][3];

        System.out.println("Using compact for(:)");
        for (int p : d)
        {
            System.out.println(p);
        }


    }

}


