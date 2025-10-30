import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays
        int[][] N =new int[2][2];
        int[][] M =new int[2][2];
        // Llamadas
        rellenar(N,M);
        mostrar(N,M);
        System.out.println("""
Que quieres hacer?
------------------
1. Sumar matrices
2. Restar matrices
3. Multiplicar matrices
4. Calcular A'   
                """);
        int r = sc.nextInt();
        if (r == 1) {
            sumar(N,M);
        } else if (r==2) {
            restar(N,M);
        } else if (r==3) {
            multiplicar(N,M);
        } else if (r==4) {
            elevar(N,M);
        } else {
            System.out.println("Error");
        }

        System.out.println("""
Quieres volver a empezar?
------------------
1. Si
2. No""");
        int r2=sc.nextInt();
        if (r2==1) {
            main(args);
        }
    }
    public static void mostrar(int[][] N, int[][] M) {
        System.out.println("------------");
        System.out.println("Array1");
        System.out.println("------------");
        for (int i = 0; i<N.length;i++) {
            for (int j=0;j<N[i].length; j++) {
                System.out.print("| " + N[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("------------");
        System.out.println("Array2");
        System.out.println("------------");
        for (int i = 0; i<M.length;i++) {
            for (int j=0;j<M[i].length; j++) {
                System.out.print("| " + M[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("------------");

    }
    public static void rellenar(int[][] N, int[][] M) {
        for (int i = 0; i<N.length;i++) {
            for (int j=0;j<N[i].length; j++) {
                int numerornd = (int) (Math.random()*100);
                N[i][j] = numerornd;
            }
        }
        for (int i = 0; i<M.length;i++) {
            for (int j=0;j<M[i].length; j++) {
                int numerornd = (int) (Math.random()*100);
                M[i][j] = numerornd;
            }
        }
    }
    public static void sumar(int[][] N, int[][] M) {
        int valor1;
        int valor2;
        int valor3;
        int[][] O =new int[2][2];
        for (int i = 0; i<N.length;i++) {
            for (int j=0;j<N[i].length; j++) {
                valor1=N[i][j];
                valor2=M[i][j];
                valor3=valor1+valor2;
                O[i][j]=valor3;
            }
        }
        System.out.println("Sumado");
        System.out.println("--------------");
        for(int i=0;i<O.length;i++) {
            for (int j=0;j<O.length;j++) {
                System.out.print("| " + O[i][j] + " |");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
    public static void restar(int[][] N, int[][] M) {
        int valor1;
        int valor2;
        int valor3;
        int[][] O =new int[2][2];
        for (int i = 0; i<N.length;i++) {
            for (int j=0;j<N[i].length; j++) {
                valor1=N[i][j];
                valor2=M[i][j];
                valor3=valor1-valor2;
                O[i][j]=valor3;
            }
        }
        System.out.println("Restado");
        System.out.println("--------------");
        for(int i=0;i<O.length;i++) {
            for (int j=0;j<O.length;j++) {
                System.out.print("| " + O[i][j] + " |");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
    public static void multiplicar(int[][] N, int[][] M) {
        int valor1;
        int valor2;
        int valor3;
        int[][] O =new int[2][2];
        // Multiplicar
        for(int i=0;i<N.length;i++) {
            for (int j = 0; j < N.length; j++) {
                if (i == 0) {
                    valor3 = ((N[i][j] * M[i][j]) + (N[i][j] * M[i + 1][j]));
                } else {
                    valor3 = ((N[i][j] * M[i][j]) + (N[i][j] * M[i - 1][j]));

                }
                O[i][j] = valor3;
            }
        }
        System.out.println("Multiplicado");
        System.out.println("--------------");
        for(int i=0;i<O.length;i++) {
            for (int j=0;j<O.length;j++) {
                System.out.print("| " + O[i][j] + " |");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
    public static void elevar(int[][] N, int[][] M) {
        int valor1;
        int valor2;
        int valor3 = 0;
        int[][] O =new int[2][2];
        int[][] P = new int [2][2];
        for(int i=0;i<N.length;i++) {
            for (int j=0;j<N.length;j++) {

                if (i == 0) {
                    O[i][j] = N[i+1][j];
                    P[i][j] = M[i+1][j];

                } else {
                    O[i][j] = N[i-1][j];
                    P[i][j] = M[i-1][j];
                }
            }
        }
        System.out.println("Elevado");
        System.out.println("--------------");
        mostrar(O,P);
    }
}
