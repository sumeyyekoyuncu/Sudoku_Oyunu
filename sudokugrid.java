
public class sudokugrid {
    private static final int SIZE = 9; // ızgara boyutunun sabiti

    private static final int DIGIT_RANGE = 9; // rakam aralığı sabiti

    public static void grid_yazdir(int[][] grid) { //her bir satır alt satıra gecerek diziyi ekrana yazdirir.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static boolean uygunmu(int[][] grid, int satir, int sutun, int rakam) {
        for (int a = 0; a < SIZE; a++) { //girilen sayı belli bir satır veya sutundan mı diye kontrol eder.
            if (grid[satir][a] == rakam || grid[a][sutun] == rakam) {
                return false; // eger satır veya sutunda varsa false gönderdi.
            }
        }
        return true;
    }

    public static boolean sudokucoz(int[][] grid, int n) {
        int satir = -1;
        int sutun = -1;
        boolean bosluk = true;
        for (int i = 0; i < n; i++) { //boş hucreyı bulur
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    satir = i;
                    sutun = j;
                    bosluk = false;
                    break;
                }
            }
            if (!bosluk) {
                break; // boşluk değilse çıkıldı.
            }
        }
        if (bosluk) {
            return true; //eğer boş bir hücre yoksa sudoku çözüldü.
        }

        for (int rakam = 1; rakam <= n; rakam++) { //o satır ve sutuna uygun sayı arayacak.
            if (uygunmu(grid, satir, sutun, rakam)) {
                grid[satir][sutun] = rakam; //bulunca eşitledi

                if (sudokucoz(grid, n)) {
                    return true;  //çözüme devam edip etmediğini kontrol ediyor
                } else {
                    grid[satir][sutun] = 0;  //çözüme devam etmiyorsa tekrar boşluğa (0) çevir
                }
            }
        }
        return false;
    }
}
