 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for person 1
        int bd1 = sc.nextInt();
        int bm1 = sc.nextInt();
        int by1 = sc.nextInt();

        // for person 2
        int bd2 = sc.nextInt();
        int bm2 = sc.nextInt();
        int by2 = sc.nextInt();

        // Root Numbers
        int DD1 = (bd1 / 10) + (bd1 % 10);
        int DD2 = 0;
        while (bd2 > 0) {
            DD2 += bd2 % 10;
            bd2 = bd2 / 10;
        }
        
        // Destini Numbers
        // for person 1
        // month
        int sumOfmonth1 = 0;
        while (bm1 > 0) {
            sumOfmonth1 += bm1 % 10;
            bm1 = bm1 / 10;
        }

        // year
        int sumOfYear1 = 0;
        while (by1 > 0) {
            sumOfYear1 += by1 % 10;
            by1 = by1 / 10;
        }

        int DN1 = DD1 + sumOfmonth1 + sumOfYear1;

        // for person 2
        int sumOfmonth2 = 0;
        while (bm2 > 0) {
            sumOfmonth2 += bm2 % 10;
            bm2 = bm2 / 10;
        }

        // year
        int sumOfYear2 = 0;
        while (by2 > 0) {
            sumOfYear2 += by2 % 10;
            by2 = by2 / 10;
        }

        int DN2 = DD2 + sumOfmonth2 + sumOfYear2;
        
        // sum of the digits of destiny number
        // for person 1
        int sumOfDN1 = 0;
        while (DN1 > 0) {
            sumOfDN1 += DN1 % 10;
            DN1 = DN1 / 10;
        }

        // for person 2
        int sumOfDN2 = 0;
        while (DN2 > 0) {
            sumOfDN2 += DN2 % 10;
            DN2 = DN2 / 10;
        }
        // number lists
        //for 1
        int friendlyNum1[] = {1, 2, 3, 5, 6 , 9};
        int enemyNum1[] = {8};
        int nutralNum1[] = {4,7};

        //for 2
        int friendlyNum2[] = {1, 2, 3, 5};
        int enemyNum2[] = {8, 4, 9};
        int nutralNum2[] = {7, 6};

        //for 3
        int friendlyNum3[] = {1, 2, 3, 5};
        int enemyNum3[] = {6};
        int nutralNum3[] = {4, 8, 7, 9};

        //for 4
        int friendlyNum4[] = {1, 5, 7, 6};
        int enemyNum4[] = {2, 9, 4, 8};
        int nutralNum4[] = {3};

        //for 5
        int friendlyNum5[] = {1, 2, 3, 5, 6};
        int enemyNum5[] = { };
        int nutralNum5[] = {4, 7, 8, 9};

        //for 6
        int friendlyNum6[] = {1, 4, 5, 6, 7};
        int enemyNum6[] = {3};
        int nutralNum6[] = {2, 8, 9};

        //for 7
        int friendlyNum7[] = {1, 3, 4, 5, 6};
        int enemyNum7[] = {2};
        int nutralNum7[] = {8, 7, 9};

        //for 8
        int friendlyNum8[] = {5, 3, 6, 7};
        int enemyNum8[] = {1, 2, 4, 8};
        int nutralNum8[] = {9};

        //for 9
        int friendlyNum9[] = {1, 5, 3};
        int enemyNum9[] = {4, 2};
        int nutralNum9[] = {9, 7, 6, 8};

        // traverse and check
        // for person1
        int point1 = 0;
        
        if (DD1 == 1) {
        for (int i = 0; i < friendlyNum1.length; i++) {
            if (friendlyNum1[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum1.length; j++) {
                if (enemyNum1[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum1.length; k++) {
                if (nutralNum1[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else if (DD1 == 2) {
        for (int i = 0; i < friendlyNum2.length; i++) {
            if (friendlyNum2[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum2.length; j++) {
                if (enemyNum2[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum2.length; k++) {
                if (nutralNum2[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else if (DD1 == 3) {
        for (int i = 0; i < friendlyNum3.length; i++) {
            if (friendlyNum3[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum3.length; j++) {
                if (enemyNum3[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum3.length; k++) {
                if (nutralNum3[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else if (DD1 == 4) {
        for (int i = 0; i < friendlyNum4.length; i++) {
            if (friendlyNum4[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum4.length; j++) {
                if (enemyNum4[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum4.length; k++) {
                if (nutralNum4[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else if (DD1 == 5) {
        for (int i = 0; i < friendlyNum5.length; i++) {
            if (friendlyNum5[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum5.length; j++) {
                if (enemyNum5[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum5.length; k++) {
                if (nutralNum5[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else if (DD1 == 6) {
        for (int i = 0; i < friendlyNum6.length; i++) {
            if (friendlyNum6[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum6.length; j++) {
                if (enemyNum6[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum6.length; k++) {
                if (nutralNum6[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } if (DD1 == 7) {
        for (int i = 0; i < friendlyNum7.length; i++) {
            if (friendlyNum7[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum7.length; j++) {
                if (enemyNum7[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum7.length; k++) {
                if (nutralNum7[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else if (DD1 == 8) {
        for (int i = 0; i < friendlyNum8.length; i++) {
            if (friendlyNum8[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum8.length; j++) {
                if (enemyNum8[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum8.length; k++) {
                if (nutralNum8[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        } else {
        for (int i = 0; i < friendlyNum9.length; i++) {
            if (friendlyNum9[i] == sumOfDN1) {
                point1 += 5;
                break;
            }
            for (int j = 0; j < enemyNum9.length; j++) {
                if (enemyNum9[j] == sumOfDN1) {
                    point1 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum9.length; k++) {
                if (nutralNum9[k] == sumOfDN1) {
                    point1 += 2;
                    break;
                }
            }
        }
        }

        // for person 2
        int point2 = 0;
        
        if (DD2 == 1) {
        for (int i = 0; i < friendlyNum1.length; i++) {
            if (friendlyNum1[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum1.length; j++) {
                if (enemyNum1[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum1.length; k++) {
                if (nutralNum1[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else if (DD2 == 2) {
        for (int i = 0; i < friendlyNum2.length; i++) {
            if (friendlyNum2[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum2.length; j++) {
                if (enemyNum2[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum2.length; k++) {
                if (nutralNum2[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else if (DD2 == 3) {
        for (int i = 0; i < friendlyNum3.length; i++) {
            if (friendlyNum3[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum3.length; j++) {
                if (enemyNum3[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum3.length; k++) {
                if (nutralNum3[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else if (DD2 == 4) {
        for (int i = 0; i < friendlyNum4.length; i++) {
            if (friendlyNum4[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum4.length; j++) {
                if (enemyNum4[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum4.length; k++) {
                if (nutralNum4[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else if (DD2 == 5) {
        for (int i = 0; i < friendlyNum5.length; i++) {
            if (friendlyNum5[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum5.length; j++) {
                if (enemyNum5[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum5.length; k++) {
                if (nutralNum5[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else if (DD2 == 6) {
        for (int i = 0; i < friendlyNum6.length; i++) {
            if (friendlyNum6[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum6.length; j++) {
                if (enemyNum6[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum6.length; k++) {
                if (nutralNum6[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } if (DD2 == 7) {
        for (int i = 0; i < friendlyNum7.length; i++) {
            if (friendlyNum7[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum7.length; j++) {
                if (enemyNum7[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum7.length; k++) {
                if (nutralNum7[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else if (DD2 == 8) {
        for (int i = 0; i < friendlyNum8.length; i++) {
            if (friendlyNum8[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum8.length; j++) {
                if (enemyNum8[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum8.length; k++) {
                if (nutralNum8[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        } else {
        for (int i = 0; i < friendlyNum9.length; i++) {
            if (friendlyNum9[i] == sumOfDN2) {
                point2 += 5;
                break;
            }
            for (int j = 0; j < enemyNum9.length; j++) {
                if (enemyNum9[j] == sumOfDN2) {
                    point2 += 0;
                    break;
                }
            }
            for (int k = 0; k < nutralNum9.length; k++) {
                if (nutralNum9[k] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }
        }
        int totalPoint = point1 + point2;
        System.out.println(totalPoint + " Highly Compatible");
    }
}
