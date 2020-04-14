
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meadow
 */
public class IP_patterning extends project_IP {

    public void patterningwork(String name, String path, int width, int height) throws IOException {
        File file = new File(path);
        FileInputStream fis = null;
        int x = 0;
        int y = 0;
        String ByteOrder = null, Version = null, Offset = null;
        String a, b = null;

        int[][] original = new int[height][width];
        int[][] AfterIt = new int[height*3][width*3];

        try {
            fis = new FileInputStream(file);

            System.out.println("Total file size to read (in bytes) : " + fis.available());

            int value;
            while ((value = fis.read()) != -1) {
                if (y == width) {
                    y = 0;
                    x++;
                }
                original[x][y] = value;
                y++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        for (int i = 0; i < height; i++) {
            System.out.println("");
            for (int j = 0; j < width; j++) {
                System.out.printf("%4s", original[i][j]);
            }
        }

        fis.close();

        for (int ax = 0; ax < height; ax++) {
            for (int ay = 0; ay < width; ay++) {

//                case 0
                if (original[ax][ay] >= 0 && original[ax][ay] <= 25) {
                    AfterIt[ax * 3][ay * 3] = 0;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 0;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 0;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 0;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 0;    //9
                }
//                case 1
                if (original[ax][ay] >= 26 && original[ax][ay] <= 50) {
                    AfterIt[ax * 3][ay * 3] = 0;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 0;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 0;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 0;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 2
                if (original[ax][ay] >= 51 && original[ax][ay] <= 75) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 0;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 0;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 0;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 3
                if (original[ax][ay] >= 76 && original[ax][ay] <= 100) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 0;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 0;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 4
                if (original[ax][ay] >= 101 && original[ax][ay] <= 125) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 0;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 255;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 5
                if (original[ax][ay] >= 126 && original[ax][ay] <= 150) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 0;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 255;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 6
                if (original[ax][ay] >= 151 && original[ax][ay] <= 175) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 0;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 255;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 255;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 7
                if (original[ax][ay] >= 176 && original[ax][ay] <= 200) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 255;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 255;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 255;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 8
                if (original[ax][ay] >= 201 && original[ax][ay] <= 225) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 255;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 255;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 255;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 255;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 9
                if (original[ax][ay] >= 226 && original[ax][ay] <= 255) {
                    AfterIt[ax * 3][ay * 3] = 255;            //1
                    AfterIt[ax * 3][ay * 3 + 1] = 255;        //2
                    AfterIt[ax * 3][ay * 3 + 2] = 255;        //3
                    AfterIt[ax * 3 + 1][ay * 3] = 255;        //4
                    AfterIt[ax * 3 + 1][ay * 3 + 1] = 255;    //5
                    AfterIt[ax * 3 + 1][ay * 3 + 2] = 255;    //6
                    AfterIt[ax * 3 + 2][ay * 3] = 255;        //7
                    AfterIt[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    AfterIt[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
            }

        }
        FileOutputStream fout = new FileOutputStream("patterning_"+name);

        for (int i = 0; i < height*3; i++) {
            System.out.println("");
            for (int j = 0; j < width*3; j++) {
                System.out.printf("%4s", AfterIt[i][j]);
                fout.write(AfterIt[i][j]);

            }
        }
        fout.close();

    }
}
